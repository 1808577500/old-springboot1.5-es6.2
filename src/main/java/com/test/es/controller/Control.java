package com.test.es.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.test.es.config.ElasticsearchUtils;

@RestController  
@RequestMapping("/es")  
public class Control {  
      
	
      
    //增加  
    @RequestMapping("/add")  
    public String add(){
    	CardInfo cardInfo = new CardInfo();
		cardInfo.setCardNum("test123");
		cardInfo.setPwd("asddddd");
		ElasticsearchUtils.addData(JSONObject.parseObject(JSONObject.toJSONString(cardInfo)), "test", "mytest");
    	return "success";  
    }  
}  
