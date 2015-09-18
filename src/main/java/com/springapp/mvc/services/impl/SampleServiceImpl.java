package com.springapp.mvc.services.impl;

import com.springapp.mvc.dto.SampleDTO;
import com.springapp.mvc.services.SampleService;
import org.springframework.stereotype.Service;

/**
 * Created by abhay on 17/09/15.
 */
@Service(value = "sampleService")
public class SampleServiceImpl implements SampleService {


    @Override
    public void pleaseLogMe(int x, String y, SampleDTO z) {

        System.out.println(y+x+z.toString());
    }
}
