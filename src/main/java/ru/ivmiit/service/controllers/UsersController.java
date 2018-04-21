package ru.ivmiit.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.ivmiit.service.repositories.UsersRepository;

import java.util.*;

@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("usersFromServer", usersRepository.findAll());
        return "users";
    }

    @GetMapping("/{name}/users")
    public String getUsersByEmail(@PathVariable String name, ModelMap model) {
        model.addAttribute("usersFromServer", Collections.singletonList(usersRepository.findByEmail(name)));
        return "/users";
    }
}
