package com.example.swagger.controller;

import com.example.swagger.dto.UserReq;
import com.example.swagger.dto.UserRes;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"API 정보를 제공하는 Controller"})
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "x", value = "x 값", required = true, dataType = "int", paramType = "path"),
            @ApiImplicitParam(name = "y", value = "y 값", required = true, dataType = "int", paramType = "query")
    })
    @GetMapping("/plus/{x}")
    public int plus(@PathVariable int x, @RequestParam int y){
        return x + y;
    }

    @ApiResponse(code = 502, message = "노충내는 중2병 막둥이")
    @ApiOperation(value = "노충내의 이름과 나이를 리턴하는 메소드")
    @GetMapping("/user")
    public UserRes user(UserReq userReq) {
        return new UserRes(userReq.getName(), userReq.getAge());
    }

    @PostMapping("/user")
    public UserRes userPost(@RequestBody UserReq req) {
        return new UserRes(req.getName(), req.getAge());
    }

}
