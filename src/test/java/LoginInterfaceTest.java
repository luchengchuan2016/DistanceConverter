import org.junit.Assert;
import org.junit.Test;

/**
 * ���������Ϣ�Ƽ����޹�˾Դ���룬��Ȩ�麼�������Ϣ�Ƽ����޹�˾���� <br/>
 * ��Ŀ���ƣ�distance-converter <br/>
 * �ļ�����LoginInterfaceTest.java <br/>
 * ���� <br/>
 */

/**
 * ������LoginInterfaceTest.java <br/>
 * ��������TODO <br/>
 * ������TODO <br/>
 * �޸���ʷ�� <br/>
 * 1.[2016��1��9������2:13:31]�����ļ� by lcc
 */
public class LoginInterfaceTest {

    @Test
    public void testLogin(){
        LoginInterface l = new  LoginService ();
        l.login();
        Assert.assertEquals("a" ,"a");
    }
}
