package org.zhyuliuk.array.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;

public class DefinitionArrayService {
    private static Logger logger = LogManager.getLogger();
    public DefinitionArrayService() {
    }

    public int countPositiveEl(NumberArray numberArray) {
        int counter=0;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.getElementByIndex(i) > 0) {
                counter++;
            }
        }
        logger.log(Level.INFO,"quantity of positive elements : {},result : {}",numberArray, counter );
        return counter;
    }
    public int countNegativeEl(NumberArray numberArray) {
        int counter=0;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.getElementByIndex(i) < 0) {
                counter++;
            }
        }
        logger.log(Level.INFO,"quantity of negative elements : {},result : {}",numberArray, counter );
        return counter;
    }
    public int definitionSum(NumberArray numberArray) {
        int sum = 0 ;
        for (int i = 0; i < numberArray.size(); i++) {
           sum+=numberArray.getElementByIndex(i);
        }
        logger.log(Level.INFO,"sum of elements : {},result : {}",numberArray, sum);
        return sum;
    }
    public double definitionOfMean(NumberArray numberArray){
        int sum = definitionSum(numberArray);
        double mean=(double)sum/(double)numberArray.size();
        logger.log(Level.INFO,"average value elements : {},result : {}",numberArray, mean);
        return mean;
    }

//    public int findMaxElement(NumberArray numberArray) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < numberArray.size(); i++) {
//            if (numberArray.getElementByIndex(i) > max) {
//                max = numberArray.getElementByIndex(i);
//            }
//        }
//        // logger.info("max : {}, result : {} ", numberArray, max);
//        return max;
//    }

//    private int binarySearch(NumberArray arr, int l, int r, int x) {
//        if (r >= l && l < arr.size() - 1) {
//            int mid = l + (r - l) / 2;
//            if (arr.getElementByIndex(mid) == x)
//                return mid;
//            if (arr.getElementByIndex(mid) > x)
//                return binarySearch(arr, l, mid - 1, x);
//
//            return binarySearch(arr, mid + 1, r, x);
//        }
//        return -1;
//    }
}
