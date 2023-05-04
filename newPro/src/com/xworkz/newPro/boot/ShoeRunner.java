package com.xworkz.newPro.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.newPro.config.ShoeConfigaration;

public class ShoeRunner {
      ApplicationContext spring=new
    		  AnnotationConfigApplicationContext(ShoeConfigaration.class);
       
      
      
}
