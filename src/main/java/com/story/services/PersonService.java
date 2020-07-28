package com.story.services;

import com.story.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void save(){
        System.out.println("PersonService被调用");
        personDao.save();
    }
}