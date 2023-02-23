package com.semicolon.Sample.controller;


import com.semicolon.Sample.entity.Example;
import com.semicolon.Sample.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ExampleController {

    @Autowired
    ExampleService exampleService;
    
    @GetMapping("/getexample")
    public List<Example> getAllExamples() {
        return exampleService.getAllExamples();
    }

    @PostMapping("/postexample")
    public Example saveExample(@RequestBody Example example){

        return exampleService.saveExample(example);
     }

}
