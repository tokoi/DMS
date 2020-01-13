package com.library.domain.service.book

import com.library.domain.model.Book
import com.library.domain.repository.book.BookRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BookService(val bookRepository: BookRepository) {

    fun findAll() = bookRepository.findAll()

    fun findOne(id: Int) = bookRepository.findById(id).orElse(null)

    fun save(book: Book) = bookRepository.save(book)

    fun delete(id: Int)= bookRepository.deleteById(id)

}