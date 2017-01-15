package RPC_Demo;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Server;

/**
 * 
 *ֱ��ͨ����̬��Builder����һ��Server,����start()����
 */
public class RPCServer {
	private static final String HOST = "localhost";
	private static final int PORT = 2181;
	public static void main(String[] args) throws IOException {
		System.out.println("I am server!");
		Configuration conf = new Configuration();

		Server server = new RPC.Builder(conf).setProtocol(ClientProtocol.class)
				.setInstance(new ClientProtocolImpl()).setBindAddress(HOST)
				.setNumHandlers(5)
				.setPort(PORT).build();
		server.start();
		
	}
}