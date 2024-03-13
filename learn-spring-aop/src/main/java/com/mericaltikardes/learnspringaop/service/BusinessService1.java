package com.mericaltikardes.learnspringaop.service;

import com.mericaltikardes.learnspringaop.annotations.TrackTime;
import com.mericaltikardes.learnspringaop.repository.DataRepo1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    DataRepo1 dataRepo1;

    public BusinessService1(DataRepo1 dataRepo1) {
        this.dataRepo1 = dataRepo1;
    }
    @TrackTime
    public int calculateMax(){
       // throw new RuntimeException("Example Exception Logging");
      return Arrays.stream(dataRepo1.retrieveData()).max().orElse(0);
    }
}
