package DataProvider;

import org.testng.annotations.DataProvider;

/**
 * @项目: apiTest-demo-client
 * @描述: demo测试类中的测试数据
 * @作者: lujuan03
 * @创建日期: 2020-06-27
 **/

public class DemoDataProvider {

    @DataProvider(name = "testEqual")
    public static Object[][] testEqual(){
        return new Object[][]{

                {1, 2},
                {2, 2}
        };
    }
}
