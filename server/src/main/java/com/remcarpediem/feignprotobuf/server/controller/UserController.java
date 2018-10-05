package com.remcarpediem.feignprotobuf.server.controller;

import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private String host = "http://xxx/user/";
    @GetMapping("/info")
    public UserDTO register(@RequestParam("id") Long id) {
        return UserDTO.newBuilder().
                setId(id.intValue()).setName("Tom").
                setUrl(host + "Tom").build();
    }
}
