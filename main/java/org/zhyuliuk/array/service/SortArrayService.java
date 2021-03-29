package org.zhyuliuk.array.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;

public class SortArrayService {
    private static Logger logger = LogManager.getLogger();

    public SortArrayService() {
    }

    public void quickSort(NumberArray numberArray, int low, int high) {

//        if (array.length == 0)
//            return;//завершить выполнение если длина массива равна 0


    if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int middleElement = numberArray.getElementByIndex(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (numberArray.getElementByIndex(i) < middleElement) {
                i++;
            }

            while (numberArray.getElementByIndex(j) > middleElement) {
                j--;
            }

            ;
            if (i <= j) {//меняем местами
                swap(i, j, numberArray);

                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(numberArray, low, j);

        if (high > i)
            quickSort(numberArray, i, high);

    }
public void bubbleSort(NumberArray numberArray){
    for (int k = numberArray.size() - 1; k >= 0; k--) {
        for (int j = 0; j < k; j++) {
            if (numberArray.getElementByIndex(j) >= numberArray.getElementByIndex(j + 1)) {
                swap(j,j+1,numberArray);
                          }
        }
    }
}
public void insertionSort(NumberArray numberArray){

    for (int i = 1; i < numberArray.size(); i++) {
        int temp = numberArray.getElementByIndex(i);
        int j = i - 1;
        while(j >= 0 && temp < numberArray.getElementByIndex(j)) {
            numberArray.setElementByIndex(j+1, numberArray.getElementByIndex(j));
            j--;
        }
        // в этой точке мы вышли, так что j так же -1
        // или в первом элементе, где текущий >= a[j]
        numberArray.setElementByIndex(j+1,temp);
    }
}
    private static void swap(int x, int y, NumberArray numberArray) {
        int temp = numberArray.getElementByIndex(x);
        numberArray.setElementByIndex(x, numberArray.getElementByIndex(y));
        numberArray.setElementByIndex(y, temp);
    }
}

