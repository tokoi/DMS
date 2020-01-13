package com.library.app.book

import com.library.domain.service.book.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("bookdetail")
class BookDetailController {

    @Autowired
    lateinit var bookService : BookService

    @GetMapping("")
    fun showBookDetail(model: Model): String{

        val books = bookService.findAll()

        print(books.toString())

        model.addAttribute("books", books)

        return "bookDetail"

    }



}