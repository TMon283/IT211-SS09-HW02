package com.example.it211ss09hw02.controller;

import com.example.it211ss09hw02.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/discount")
    public String applyDiscount(@RequestParam String userId, @RequestParam String code) {
        try {
            demoService.applyDiscount(userId, code);
            return "Đã xử lý mã giảm giá cho user: " + userId;
        } catch (Exception e) {
            return "Có lỗi xảy ra khi xử lý mã giảm giá!";
        }
    }
}

