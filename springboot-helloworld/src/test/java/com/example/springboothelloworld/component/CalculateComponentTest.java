package com.example.springboothelloworld.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.PropertyResourceBundle;

@SpringBootTest
public class CalculateComponentTest {


    @Autowired
   private CalculateComponent calculateComponent;
    @Test
    public void add_(){
        Assertions.assertEquals(2, calculateComponent.add(1, 1));
    }
}
