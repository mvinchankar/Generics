package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void when_Entered_Should_Return_Maximum() {
        Integer result= (Integer) Maximum.getMaximum(2,1,0);
        Assert.assertEquals(Integer.valueOf(2), result);
    }
    @Test
    public void when_Entered_Float_Should_Return_Maximum() {
        Float result= (Float) Maximum.getMaximum(2.52f,1.41f,0.81f);
        Assert.assertEquals(Float.valueOf(2.52f), result);
    }
    @Test
    public void when_Entered_String_Should_Return_Maximum() {
        String result= (String) Maximum.getMaximum("Mangesh","Mahendra","Akshay");
        Assert.assertEquals("Mangesh", result);
    }

}
