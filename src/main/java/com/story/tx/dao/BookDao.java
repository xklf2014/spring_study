package com.story.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateBalance(String username,int price){
        String sql = "update account set balance=balance-? where username = ?";
        jdbcTemplate.update(sql,price,username);
    }

    public int getPrice(int id){
        String sql = "select price from book where id=?";
        return jdbcTemplate.queryForObject(sql,Integer.class,id);
    }

    public void updateStock(int id){
        String sql = "update book_stock set stock=stock-1 where id = ?";
        jdbcTemplate.update(sql,id);
    }

    public void updatePrice(int id){
        String sql = "update book set price=price-1 where id = ?";
        jdbcTemplate.update(sql,id);
    }
}
