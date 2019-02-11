package com.gzucm.fuck_his.controller;

import com.gzucm.fuck_his.DTO.CommonDTO;
import com.gzucm.fuck_his.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianyi
 * @date 2018-10-26 00:08
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/add")
    public CommonDTO addBook(String healthCard, int patientId, int doctorId){
        return bookService.book(healthCard,patientId,doctorId);
    }

    @GetMapping("/confirm")
    public CommonDTO confirmBook(String healthCard){
        return bookService.comfirm(healthCard);
    }

    @GetMapping("/find")
    public CommonDTO findByCard(String healthCard){
        return bookService.findByCard(healthCard);
    }
}
