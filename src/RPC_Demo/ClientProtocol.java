package RPC_Demo;

import org.apache.hadoop.ipc.VersionedProtocol;

/**
 * 
 *Hadoop�������Զ���RPC�ӿڶ���Ҫ�̳�VersionedProtocol�ӿڣ���������Э��İ汾��Ϣ��
 */
public interface ClientProtocol extends VersionedProtocol {
	//�汾�ţ�Ĭ������£���ͬ�汾�ŵ�RPC�ͻ�����Server֮�䲻���໥ͨ��
	public static final long versionID = 1L;
	public int add(int v1, int v2);
}