package org.zhyuliuk.array.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;

public class ReplacementArrayService {
    private static Logger logger = LogManager.getLogger();
    public ReplacementArrayService() {
    }

    public void replaceIfBigger(NumberArray numberArray, int replacement, int condition) {
        for (int i = 0; i < numberArray.size(); ++i) {
            if (numberArray.getElementByIndex(i) > condition) {
                numberArray.setElementByIndex(i, replacement);
            }
        }
        logger.log(Level.INFO,"changed array : {}",numberArray );
    }

    public void replaceIfSmaller(NumberArray numberArray, int replacement, int condition) {
        for (int i = 0; i < numberArray.size(); ++i) {
            if (numberArray.getElementByIndex(i) < condition) {
                numberArray.setElementByIndex(i, replacement);
            }
        }
        logger.log(Level.INFO,"changed array : {}",numberArray );
    }
}