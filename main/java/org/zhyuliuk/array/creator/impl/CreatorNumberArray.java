package org.zhyuliuk.array.creator.impl;

import org.zhyuliuk.array.creator.CreatorInterface;
import org.zhyuliuk.array.entity.NumberArray;

import java.util.ArrayList;

public class CreatorNumberArray implements CreatorInterface {

    public NumberArray[] create(ArrayList<int[]> arrayList) {

        NumberArray[] intArray = new NumberArray[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            int[] insertingArr = arrayList.get(i);
            intArray[i] = new NumberArray(insertingArr);
        }
        return intArray;
    }

}
