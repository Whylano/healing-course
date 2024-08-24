package com.jandj.healingcourse.adapter.in.web;

import com.jandj.healingcourse.application.service.UserService;
import com.jandj.healingcourse.config.JwtTokenUtil;
import com.jandj.healingcourse.web.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String createAuthenticationToken(@RequestBody UserDTO userDTO) throws Exception {
        UserDetails userDetails = userService.authenticate(userDTO.getUsername(), userDTO.getPassword());
        return jwtTokenUtil.generateToken(userDetails);
    }
}
