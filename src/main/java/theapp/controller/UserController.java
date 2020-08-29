package theapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import theapp.model.User;
import theapp.service.Service;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private Service service;

    public UserController(Service service) {
        this.service = service;
    }

    @GetMapping("/user/info")
    public String getUser() throws IOException {
        service.anotherTry();
        return service.getData();
    }

    @GetMapping("/user/infotwo")
    public String getAnotherUser() throws Exception {
        return service.getAnotherData();
    }


}
