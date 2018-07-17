package com.ma.web;

import com.ma.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mh on 2018/7/15.
 */
@RestController
public class MyController {
    @Autowired
    private Person person;

    //@RequestMapping(value = "/hi",method = RequestMethod.GET)
    @GetMapping
    public String hi(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myID){
        return person.getName()+myID;
    }


}
