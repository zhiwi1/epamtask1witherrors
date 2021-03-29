package org.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;

public class SearchArrayServiceTest {
    NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
    SearchArrayService service=new SearchArrayService();
    @Test(description = "Тестируем Поиск максимального элемента в массиве ")

    public void findMaxElementTest() {

            int actual = service.findMaxElement(numberArray);

        int expected = 5;

        Assert.assertEquals(actual,expected);
    }
    @Test(description = "")
    public void findMinElementTest(){
        int actual=service.findMinElement(numberArray);
        int expected=-5;
        Assert.assertEquals(actual,expected);
    }
}
