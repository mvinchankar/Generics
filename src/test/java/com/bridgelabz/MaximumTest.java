package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void when_Entered_Should_Return_Maximum() {
        Integer result = (Integer) Maximum.testMax(2, 1, 0);
        Assert.assertEquals(Integer.valueOf(2), result);
    }

    @Test
    public void when_Entered_String_Should_Return_Maximum() {
        String result = (String) Maximum.testMax("Mangesh", "Mahendra", "Akshay");
        Assert.assertEquals("Mangesh", result);
    }

    @Test
    public void when_Entered_Float_Should_Return_Maximum() {
        Float result = (Float) Maximum.testMax(2.52f, 1.41f, 0.81f);
        Assert.assertEquals(Float.valueOf(2.52f), result);
    }

    @Test
    public void when_Entered_Should_Return_Maximum_With_PrintMax() {
        Maximum max=new Maximum<Integer>(2,1,0);
        Object maximum=max.testMax();
        Assert.assertEquals((Integer)2,maximum);
    }

}
