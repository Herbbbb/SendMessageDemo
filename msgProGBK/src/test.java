import java.util.HashMap;
import java.util.Map;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class test {
	
	//ÿ����ʹ��֮ǰ��ע��һ���˺žͿ����ˣ������Լ�����������
	
	//�û���
	private static String Uid = "GitС��";
	
	//�ӿڰ�ȫ��Կ
	private static String Key = "d41d8cd98f00b204e9";
	
	//�ֻ����룬���������13800000000,13800000001,13800000002
	private static String smsMob = "13800000000";
	
	//��������
	private static String smsText = "С�����";
	
	public static void main(String[] args) {
		
		HttpClientUtil client = HttpClientUtil.getInstance();
		
		//GBK����
		int resultGbk = client.sendMsgGbk(Uid, Key, smsText, smsMob );
		if(resultGbk>0){
			System.out.println("GBK�ɹ���������=="+resultGbk);
		}else{
			System.out.println(client.getErrorMsg(resultGbk));
		}
	}
}
