package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.dao.UserDAO;
import com.example.demo.model.entity.UsersEntity;

@Controller
public class UserController {
    UserDAO userDAO = new UserDAO();

    @GetMapping({ "/index", "/" })
    public String index(Model model) {
        model.addAttribute("user", new UsersEntity());
        return "register"; // Formulario de registro
    }

    @GetMapping("/list")
    public String getUserList(Model model) {
        List<UsersEntity> userList = userDAO.getUsers(); // Obtiene la lista de usuarios
        model.addAttribute("userList", userList);
        return "userList"; // Vista que muestra la lista de usuarios
    }

    @GetMapping("/userListByDirection")
    public String userByDirection(@RequestParam String direction, Model model) {
        List<UsersEntity> userListByDirection = userDAO.getUsersByDirection(direction);
        model.addAttribute("userListByDirection", userListByDirection);
        model.addAttribute("direction", direction);
        return "userListByDirection"; // userListByDirection.html
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new UsersEntity());
        return "register"; // plantilla de registro
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute UsersEntity user, Model model) {
        userDAO.addUser(user); 
        return "redirect:/list";
    }
}
