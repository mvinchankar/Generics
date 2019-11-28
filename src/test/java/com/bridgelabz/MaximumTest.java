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
}
