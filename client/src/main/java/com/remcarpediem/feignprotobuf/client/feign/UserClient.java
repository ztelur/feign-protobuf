package com.remcarpediem.feignprotobuf.client.feign;

import com.remcarpediem.feignprotobuf.client.conf.ProtoFeignConfiguration;
import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user", configuration = ProtoFeignConfiguration.class)
public interface UserClient {
    @RequestMapping(value = "/info", method = RequestMethod.GET,
            consumes = "application/x-protobuf", produces = "application/x-protobuf")
    UserDTO getUserInfo(@RequestParam("id") Long id);
}
