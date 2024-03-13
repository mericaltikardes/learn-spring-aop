package com.mericaltikardes.learnspringaop.service;

import com.mericaltikardes.learnspringaop.repository.DataRepo1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService2 {

    DataRepo1 dataRepo2;

    public BusinessService2(DataRepo1 dataRepo2) {
        this.dataRepo2 = dataRepo2;
    }

    public int calculateMin() {
        throw new RuntimeException("Example Exception Logging");
        //   return Arrays.stream(dataRepo2.retrieveData()).min().orElse(0);
    }
}
