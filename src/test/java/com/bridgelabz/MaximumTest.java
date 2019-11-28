package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void when_Entered_Should_Return_Maximum() {
        Maximum maximum=new Maximum();
        Integer result= maximum.getMaximum(2,1,0);
        Assert.assertEquals(Integer.valueOf(2), result);
    }
    @Test
    public void when_Entered_Float_Should_Return_Maximum() {
        Maximum maximum=new Maximum();
        Float result= maximum.getMaximum(2.52f,1.41f,0.81f);
        Assert.assertEquals(Float.valueOf(2.52f), result);
    }
}
