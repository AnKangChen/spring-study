package com.helios.spring

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class HelloReaderController {

    @RequestMapping(value = "/hello")
    fun sayHello():ModelAndView {
        val mv = ModelAndView()
        mv.addObject("message","Hello Reader!!!")
        mv.viewName = "helloReader"
        return mv
    }
}