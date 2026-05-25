package com.example.it211ss09hw02.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    public void applyDiscount(String userId, String code) {
        if ("VIP".equals(code)) {
            logger.info("Áp dụng thành công cho user: {}", userId);
        } else if ("EXPIRED".equals(code)) {
            logger.warn("Mã giảm giá đã hết hạn: {}", code); // Lỗi nghiệp vụ
        } else {
            logger.error("Lỗi mất kết nối DB khi check mã: {}", code); // Lỗi hệ thống
        }
    }
}

