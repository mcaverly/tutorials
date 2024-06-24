package com.baeldung.stockapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Michael Caverly <m.caverly30@gmail.com>
 */
@Controller
public class StockController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
