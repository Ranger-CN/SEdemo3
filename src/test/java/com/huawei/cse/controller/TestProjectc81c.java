package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectc81c {

        Projectc81cDelegate projectc81cDelegate = new Projectc81cDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectc81cDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}