package com.test.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Yangwei
 * @Description:
 * @Date: Created in 2018/6/5 12:50
 */
@RestController
public class TestController {
    @GetMapping("teststr")
    public String getTheTestString(){
        return  "hello yw";
    }

    @GetMapping("testmap")
    public Map<String,Object> getTheTestMap(){
        Map<String,Object> result =   new HashMap<String, Object>();
        result.put("test","this a map ");
        result.put("test2","this a map ");
        result.put("32","this a map ");
        result.put("3232","this a map ");
        result.put("te23232st","this a map ");
        result.put("3232r3","this a map ");

        return  result;
    }


    @GetMapping("testls")
    public List<Map<String,Object>> getTheTestls(){
        List<Map<String,Object>>  ls =  new ArrayList<Map<String, Object>>();
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("test","恶趣味驱蚊器饿p ");
        result.put("test2","EDQEQW  a map ");
        result.put("32","this a map ");
        result.put("3232","this a map ");
        result.put("te23232st","this a map ");
        result.put("3232r3","this a map ");
        ls.add(result);
        return  ls;
    }
}
