package com.gsafc.site.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by DELL on 2016/10/23.
 */
@Controller
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }
}
