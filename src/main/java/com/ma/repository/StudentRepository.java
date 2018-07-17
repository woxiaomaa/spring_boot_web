package com.ma.repository;

import com.ma.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mh on 2018/7/15.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByName(String name);

}
