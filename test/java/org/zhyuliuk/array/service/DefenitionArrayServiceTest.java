package org.zhyuliuk.array.service;

import org.apache.logging.log4j.Level;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;

public class DefenitionArrayServiceTest {
    NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
    DefinitionArrayService service=new DefinitionArrayService();
    @Test(description = "Тест счетчика позитивных элементов")

    public void countPositiveElTest(){
        int actual=service.countPositiveEl(numberArray);
                int expected=5;
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "Тест счетчика негативных элементов")
    public void countNegativeElTest(){
        int actual=service.countNegativeEl(numberArray);
        int expected=5;
        Assert.assertEquals(actual,expected);
    }
    @Test(description = "Расчет суммы всех элементов массива")
    public void definitionSumTest(){
        int actual=service.definitionSum(numberArray);
        int expected=0;
        Assert.assertEquals(actual,expected);

    }
    @Test(description = "Расчет среднего значения всех элементов массива")
    public void definitionOfMean(){
        double actual=service.definitionOfMean(numberArray);
        double expected=0.0d;
        Assert.assertEquals(actual,expected);

    }

//    public int countPositiveEl(NumberArray numberArray) {
//        int counter=0;
//        for (int i = 0; i < numberArray.size(); i++) {
//            if (numberArray.getElementByIndex(i) > 0) {
//                counter++;
//            }
//        }
//     //   logger.log(Level.INFO,"quantity of positive elements : {},result : {}",numberArray, counter );
//        return counter;
//    }
}
