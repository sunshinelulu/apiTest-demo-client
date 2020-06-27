package DataProvider;

import org.testng.annotations.DataProvider;

/**
 * @项目: apiTest-demo-client
 * @描述: 测试数据
 * @作者: 一叶浮尘
 * @创建日期: 2020-06-27
 **/

public class HttpDemo1TestDataProvider {

    @DataProvider(name = "testHttp1")
    public static Object[][] testHttp1(){
        return new Object[][]{

                {"sophia"},
                {"coder"}
        };
    }
}
