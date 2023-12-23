package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author lidashuang
 * @version 1.0
 */
public interface TestRepository extends
        JpaRepository<TestModel, Integer>,
        JpaSpecificationExecutor<TestModel> {
}