package com.springapp.mvc.services;

import com.springapp.mvc.advice.DetailedLogging;
import com.springapp.mvc.dto.SampleDTO;

/**
 * Created by abhay on 17/09/15.
 */
public interface SampleService {

    @DetailedLogging
    void pleaseLogMe(int x, String y, SampleDTO z);
}
