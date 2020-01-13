package com.library.app

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("index")
class IndexController {

    @GetMapping("")
    fun index(model: Model): String{

        return "index"

    }

}