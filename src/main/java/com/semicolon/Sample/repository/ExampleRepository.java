package com.semicolon.Sample.repository;

import com.semicolon.Sample.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Example,Long> {
}
