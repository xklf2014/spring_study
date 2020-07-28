package com.story.controller;

import com.story.dao.BaseDao;
import com.story.dao.StudentDao;
import com.story.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//@Controller
public class BaseControllor {

   /* @Autowired
    public TeacherDao teacherDao;

    @Autowired
    public StudentDao studentDao;

    public void save(){
        teacherDao.save();
    }

    public void save2(){
        studentDao.save();
    }*/

   @Autowired
   BaseDao baseDao;

   public void save(){
       baseDao.save();
   }
}
