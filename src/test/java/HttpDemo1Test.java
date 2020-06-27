import DataProvider.HttpDemo1TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import com.alibaba.fastjson.JSONObject;

/**
 * @项目: apiTest-demo-client
 * @描述: 接口测试代码编写
 * @作者: 一叶浮尘
 * @创建日期: 2020-06-27
 **/

public class HttpDemo1Test {

    @Test(dataProvider = "testHttp1", dataProviderClass = HttpDemo1TestDataProvider.class)
    public void testHttp1(String inputName) throws Exception{

        //编写一个URL
        URI uri = new URI("http://localhost:5000/json/" + inputName);
        URL url = uri.toURL();

        //在java的输入输出操作对象中
        InputStream response = url.openStream();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(response));
        String body = buffer.readLine();

        System.out.println(body);

        //解析为json对象
        JSONObject rspJSON = JSONObject.parseObject(body);

        Assert.assertEquals(rspJSON.get("name"), inputName);
        Assert.assertEquals(rspJSON.get("info"), "Hello, " + inputName + " !");


    }
}
