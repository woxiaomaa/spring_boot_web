package com.ma.web;

import com.ma.bean.Student;
import com.ma.enums.Errors;
import com.ma.exception.StudentException;
import com.ma.repository.StudentRepository;
import com.ma.result.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * Created by mh on 2018/7/15.
 */
@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value = "findAll")
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("getById")
    public Student getById(Integer id){
        Student student = studentRepository.getOne(id);
        System.out.println("sssssssssssssssssssss"+student.getName());
        return student;
    }


    /**
     * valid 注解
     * */
    @PostMapping("/insert")
    public Student insert(@Valid Student stu, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }else {
            Student student = new Student(stu.getAge(), stu.getName());
            return studentRepository.save(student);
        }

    }

    @PutMapping("update/{id}")
    public Student update(@PathVariable Integer id,@RequestParam String name){
        Student student = new Student(18,name);
        student.setId(id);
        return studentRepository.save(student);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/findByName/name/{name}")
    public List<Student> finByName(@PathVariable String name){

        return studentRepository.findByName(name);
    }

    @GetMapping("errortest/{age}")
    public void errorTest(@PathVariable Integer age) throws Exception {
        if(age < 18){
            throw new StudentException(Errors.Less);
        }else{
            throw new StudentException(Errors.MORE);
        }
    }
}
