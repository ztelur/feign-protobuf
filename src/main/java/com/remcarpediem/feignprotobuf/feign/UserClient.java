package com.remcarpediem.feignprotobuf.feign;

import com.remcarpediem.feignprotobuf.conf.ProtoFeignConfiguration;
import com.remcarpediem.feignprotobuf.proto.dto.RegisterForm;
import com.remcarpediem.feignprotobuf.proto.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "user", configuration = ProtoFeignConfiguration.class)
public interface UserClient {
    @RequestMapping(value = "/register", method = RequestMethod.POST,
            consumes = "application/x-protobuf", produces = "application/x-protobuf")
    UserDTO requestMessage(@RequestBody RegisterForm form);
}
