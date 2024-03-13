package com.mericaltikardes.learnspringaop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DataRepo2 {
    public int[] retrieveData(){
        return new int[] {111,222,333,444,555};

    }
}
