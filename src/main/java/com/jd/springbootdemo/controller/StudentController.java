package com.jd.springbootdemo.controller;

import com.jd.springbootdemo.entity.Student;
import com.jd.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: controller调用层（可直接做测试用）
 * @Author: yuhua
 * @Date: 2018/11/19
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add")
    @ResponseBody
    public String add(Student student) {
        try {
            student.setName("yhh");
            student.setNumber("224432");
            studentService.saveStudent(student);
            return "插入成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "插入数据出错了";
        }
    }

    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(Student student) {
        try {
            student.setName("yhh");
            studentService.deleteStudent(student.getName());
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "删除数据出错了";
        }
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public String update(Student student) {
        try {
            student.setName("yh");
            student.setNumber("111111");
            studentService.updateStudent(student.getName(), student.getNumber());
            return "更新数据成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "更新数据出错了";
        }
    }

    @RequestMapping(value = "/find")
    @ResponseBody
    public String findStudent(Student student) {
        try {
            student.setName("yh");
            Student studentByName = studentService.findStudentByName(student.getName());
            String student1 = studentByName.toString();
            return student1;
        } catch (Exception e) {
            e.printStackTrace();
            return "查询数据失败";
        }
    }
}
