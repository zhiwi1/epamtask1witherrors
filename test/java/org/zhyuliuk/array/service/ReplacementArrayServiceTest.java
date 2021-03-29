package org.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;

public class ReplacementArrayServiceTest
{
ReplacementArrayService service=new ReplacementArrayService();
@Test(description = "Тест на корректность замены по условию")
    public void replaceIfSmallerTest(){
    NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
    service.replaceIfSmaller(numberArray,14,0);
    NumberArray expected=new NumberArray(new int[]{1,2,3,4,5,14,14,14,14,14,0});
    Assert.assertEquals(  numberArray  ,expected);
}
    @Test(description = "Тест на корректность замены по условию")
    public void replaceIfBiggerTest(){
        NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
        service.replaceIfBigger(numberArray,14,0);
        NumberArray expected=new NumberArray(new int[]{14,14,14,14,14,-1,-2,-3,-4,-5,0});
        Assert.assertEquals(  numberArray  ,expected);
    }
}
