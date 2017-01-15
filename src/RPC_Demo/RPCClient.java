package RPC_Demo;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

/**
 * 　这里使用静态方法getProxy构造客户端代理对象，直接通过代理对象调用远程端的方法。
 *
 */
public class RPCClient {
	private static final String HOST = "localhost";
	private static final int PORT = 2181;

	public static void main(String[] args) throws IOException {
		System.out.println("I am clint!");
		Configuration conf = new Configuration();
		ClientProtocol proxy = RPC.getProxy(ClientProtocol.class, ClientProtocol.versionID,
				new InetSocketAddress(HOST, PORT), conf);
		System.out.println("call proxy.add().");
		int result = proxy.add(2, 4);
		System.out.println(result);
		
	}
}