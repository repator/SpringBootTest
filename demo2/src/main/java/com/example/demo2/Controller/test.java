package com.example.demo2.Controller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class test {

    @RequestMapping("/")
    String index() {
        String url = "http://localhost:8080/order";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse closeableHttpResponse = null;
        String content = null;
        try {
            closeableHttpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = closeableHttpResponse.getEntity();
            if (httpEntity != null) {
                content = EntityUtils.toString(httpEntity, "utf-8");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       System.out.println("heeeee");
        return content;

    }
}
