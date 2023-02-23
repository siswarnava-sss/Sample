package com.semicolon.Sample.service;

import com.semicolon.Sample.entity.Example;
import com.semicolon.Sample.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExampleServiceImpl implements ExampleService {

    @Autowired
    ExampleRepository exampleRepository;
    @Override
    public List getAllExamples() {
        return exampleRepository.findAll();
    }

    @Override
    public Example saveExample(Example example) {
        return (Example) exampleRepository.save(example);
    }
}
