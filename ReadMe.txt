执行前请先设置修改 src/test.java 文件

//用户名
private static String Uid = "uid";
	
//接口安全秘钥（不是登录密码）
private static String Key = "key";
	
//手机号码，多个号码如13800000000,13800000001,13800000002
private static String smsMob = "13800000000";
	
//短信内容
private static String smsText = "验证码：8888";



其他说明请参考
http://www.smschinese.cn/api.shtml

注意：
如果放到项目里面运行时会乱码
请调用接口之前打印下你串进去的内容，看看会不会乱码


欢迎访问我的博客：https://blog.csdn.net/weixin_38964895
