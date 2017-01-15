package RPC_Demo;

import org.apache.hadoop.ipc.VersionedProtocol;

/**
 * 
 *Hadoop中所有自定义RPC接口都需要继承VersionedProtocol接口，它描述了协议的版本信息。
 */
public interface ClientProtocol extends VersionedProtocol {
	//版本号，默认情况下，不同版本号的RPC客户端与Server之间不能相互通信
	public static final long versionID = 1L;
	public int add(int v1, int v2);
}