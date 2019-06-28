package com.example.demo2.Controller;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {
@RequestMapping("/")
    String  index(){
    CloseableHttpClient httpClient= HttpClients.createDefault();
    HttpGet  httpGet=new HttpGet("localhost:8080/order");
    CloseableHttpResponse closeableHttpResponse=null;
    try {
       closeableHttpResponse= httpClient.execute(httpGet);
        HttpEntity httpEntity=closeableHttpResponse.getEntity();
        if(httpEntity!=null){
            return httpEntity.toString();
        }
    }
   catch (Exception e){
        System.out.println(e.getMessage());
   }
    finally {

    }
return  null;
}
}
