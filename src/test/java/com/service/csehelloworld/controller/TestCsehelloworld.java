package com.service.csehelloworld.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsehelloworld {

        CsehelloworldDelegate csehelloworldDelegate = new CsehelloworldDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csehelloworldDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}