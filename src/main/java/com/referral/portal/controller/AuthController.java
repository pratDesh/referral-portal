package com.referral.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Authentication controller
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String getPing() {
        return "hello from the inside!!";
    }
}
