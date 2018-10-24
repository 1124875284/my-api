package com.myprivate.myapi.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄志强
 * @data 2018/10/24 16:40
 */
@Api("自由练习")
@RestController
public class PersionApi {
    @GetMapping("/abc")
    @ApiOperation(value = "one")
    public String test2(){
        return "123";
    }
    @ApiOperation(value = "运营后台登录", notes = "运营后台登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @RequestMapping(value = "/ff",method = RequestMethod.GET)
    public String test3(){
        return "123";
    }
    @RequestMapping(value = "/ddddd",method = RequestMethod.GET)
    @ApiOperation(value = "运营后台登录", notes = "运营后台登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test5(){
        return "123";
    }
    @RequestMapping(value = "/yhgf",method = RequestMethod.GET)
    @ApiOperation(value = "运营后台登录", notes = "运营后台登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test6(){
        return "123";
    }
    @RequestMapping(value = "/jjkhj",method = RequestMethod.POST)
    @ApiOperation(value = "运营后台登录", notes = "运营后台登录", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test7(){
        return "123";
    }
}
