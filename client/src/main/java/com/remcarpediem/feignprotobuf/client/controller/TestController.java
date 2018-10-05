package com.remcarpediem.feignprotobuf.client.controller;

import com.remcarpediem.feignprotobuf.client.feign.UserClient;
import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserClient userClient;

    @PostMapping("/user")
    public String getUserInfo() {
        UserDTO  userDTO = userClient.getUserInfo(1L);
        return userDTO.getName();
    }
}
