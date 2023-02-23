package com.semicolon.Sample.service;

import com.semicolon.Sample.entity.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExampleService {
    List<Example> getAllExamples();

    Example saveExample(Example example);
}
