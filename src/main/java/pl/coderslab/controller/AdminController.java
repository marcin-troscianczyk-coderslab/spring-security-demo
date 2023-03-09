package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class AdminController {

    @GetMapping(path = "/users")
    String findAllUsers() {
        return "user/list";
    }
}
