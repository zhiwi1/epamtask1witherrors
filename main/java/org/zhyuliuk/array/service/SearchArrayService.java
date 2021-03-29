package org.zhyuliuk.array.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;

public class SearchArrayService {
    private static Logger logger = LogManager.getLogger();

    public SearchArrayService() {
    }

    public int findMaxElement(NumberArray numberArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.getElementByIndex(i) > max) {
                max = numberArray.getElementByIndex(i);
            }
        }
        logger.log(Level.INFO, "max : {}, result : {} ", numberArray, max);
        return max;
    }

    public int findMinElement(NumberArray numberArray) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.getElementByIndex(i) < min) {
                min = numberArray.getElementByIndex(i);
            }
        }
        logger.log(Level.INFO, "min : {}, result : {} ", numberArray, min);
        return min;
    }
}
