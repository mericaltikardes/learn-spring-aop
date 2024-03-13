package com.mericaltikardes.learnspringaop.repository;

import com.mericaltikardes.learnspringaop.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataRepo1 {
    @TrackTime
    public int[] retrieveData(){
        return new int[] {11,22,33,44,55};

    }
}
