package com.hithink.community.main.controller;

import com.hithink.community.main.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private AdminService adminService;
}
