package com.story.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MultService {
    @Autowired
    private BookService bookService;

    //存在事务嵌套，则同一由外层事务处理
    @Transactional
    public void mult(){

            bookService.buyBook();

        try {
            bookService.updateprice();
        }catch (Exception e){
            e.getStackTrace();
        }
        System.out.println(1/0);
    }

    //@Transactional
    public void buyBook(){
        bookService.buyBook();
    }
}
