package com.story.tx.service;

import com.story.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    //事务超时时间
  /*  @Transactional(timeout = 5)
    public void buyBook(){
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookDao.updateStock(1);
    }*/

  //只读事务，默认关闭
/*
  @Transactional(readOnly = true)
    public void buyBook(){
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        bookDao.updateStock(1);
    }
*/

    //设置那些异常不会回滚
/*    @Transactional(noRollbackFor = {ArithmeticException.class})
    public void buyBook(){
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }*/

    //指定类名不会回滚
/*    @Transactional(noRollbackForClassName = {"java.lang.ArithmeticException"})
    public void buyBook(){
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }*/

    //设置发生那些异常进行回滚
  /*  @Transactional(rollbackFor = {FileNotFoundException.class})
    public void buyBook() throws FileNotFoundException {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        bookDao.updateStock(1);
        new FileInputStream("aaa.txt");
    }*/

    //设置具体异常发生时进行事务回滚
  /*  @Transactional(rollbackForClassName = "java.io.FileNotFoundException")
    public void buyBook() throws FileNotFoundException {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        bookDao.updateStock(1);
        new FileInputStream("aaa.txt");
    }*/

 /*   @Transactional(timeout = 3,isolation = Isolation.READ_COMMITTED)
       public void buyBook() {

        bookDao.updateStock(id);
        int price = bookDao.getPrice(id);
        bookDao.updateBalance(username,price);
    }*/


  //事务的传播特性
/*    @Transactional(propagation = Propagation.REQUIRED)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        //System.out.println(1/0);
        bookDao.updateStock(1);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateprice(){
        System.out.println(1/0);
        bookDao.updatePrice(1);

    }*/

    //事务嵌套，子事务为REQUIRES_NEW，则第一个事务内出现异常，会发生事务回滚，第二个发生异常，则第一个子事务会提交，第二个子事务回滚
 /*   @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateprice(){
        //System.out.println(1/0);
        bookDao.updatePrice(1);

    }*/

    //REQUIRES_NEW为独立事务，如果没有异常则会提交成功，不会受同级事务影响导致父级事务回滚
/*    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        //System.out.println(1/0);
        bookDao.updateStock(1);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateprice(){
        System.out.println(1/0);
        bookDao.updatePrice(1);

    }*/

    //SUPPORTS外层有异常则由外层事务处理，没有则不会进行事务处理
 /*   @Transactional(propagation = Propagation.SUPPORTS)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }*/

    //NOT_SUPPORTED当前如果有事务，则将事务挂起
 /*   @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }*/

/*    @Transactional(propagation = Propagation.NEVER)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }*/


    //如果外层没有事务，则抛出异常
    /*@Transactional(propagation = Propagation.MANDATORY)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        System.out.println(1/0);
        bookDao.updateStock(1);
    }*/

    @Transactional(propagation = Propagation.NESTED)
    public void buyBook() {
        bookDao.getPrice(1);
        bookDao.updateBalance("zhangsan",100);
        bookDao.updateStock(1);
        //System.out.println(1/0);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void updateprice(){
        //System.out.println(1/0);
        bookDao.updatePrice(1);

    }

    @Transactional
    public void mult(){
        buyBook();
        updateprice();
        System.out.println(1/0);
    }
}
