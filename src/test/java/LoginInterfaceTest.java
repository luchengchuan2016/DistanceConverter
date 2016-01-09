import org.junit.Assert;
import org.junit.Test;

/**
 * 杭州天谷信息科技有限公司源代码，版权归杭州天谷信息科技有限公司所有 <br/>
 * 项目名称：distance-converter <br/>
 * 文件名：LoginInterfaceTest.java <br/>
 * 包： <br/>
 */

/**
 * 类名：LoginInterfaceTest.java <br/>
 * 中文名：TODO <br/>
 * 描述：TODO <br/>
 * 修改历史： <br/>
 * 1.[2016年1月9日下午2:13:31]创建文件 by lcc
 */
public class LoginInterfaceTest {

    @Test
    public void testLogin(){
        LoginInterface l = new  LoginService ();
        l.login();
        Assert.assertEquals("a" ,"a");
    }
}
