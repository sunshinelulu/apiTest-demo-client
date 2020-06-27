import DataProvider.DemoDataProvider;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * @项目: apiTest-demo-client
 * @描述: 接口测试框架示例
 * @作者: 一叶浮尘
 * @创建日期: 2020-06-27
 **/

public class DemoTest {

    @BeforeClass()
    public void beforeClass(){

        System.out.println("----beforeClass---");
    }

    @Test(dataProvider = "testEqual", dataProviderClass = DemoDataProvider.class)
    public void testEqual(int input, int output){

        Assert.assertEquals(input,output);
    }


    @AfterClass()
    public void afterClass(){

        System.out.println("----afterClass---");
    }

}
