package com.library.app.book

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("list")
class ListController(){

    @GetMapping("")
    fun showList(): String {

        return "list"

    }







}