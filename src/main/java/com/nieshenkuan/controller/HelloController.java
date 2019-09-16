package com.nieshenkuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @author: nieshenkuan
 * @Date: 2019/7/15 22:05
 */
@Controller
public class HelloController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getDept(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        return maps.get(0);
    }
}
