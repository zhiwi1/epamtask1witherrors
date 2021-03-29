package org.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;

public class SortArrayServiceTest {

    SortArrayService service=new SortArrayService();
    NumberArray expected=new NumberArray(new int[]{-5,-4,-3,-2,-1,0,1,2,3,4,5});
    @Test(description = "Тестируем пузырьковую сортировку ")

    public void bubbleSortTest(){
        NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
        service.bubbleSort(numberArray);

            Assert.assertEquals(numberArray,expected);

    }
    @Test(description ="Тестируем быструю сортировку" )
    public void quickSortTest(){
        NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
        service.quickSort(numberArray,0,numberArray.size()-1);

            Assert.assertEquals(numberArray,expected);


    }
    @Test(description = "Teстируем сортировку вставками")
    public void insertionSortTest(){
        NumberArray numberArray=new NumberArray(new int[]{1,2,3,4,5,-1,-2,-3,-4,-5,0});
        service.insertionSort(numberArray);

            Assert.assertEquals(numberArray,expected);

    }


}