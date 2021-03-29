package org.zhyuliuk.array.parser.impl;

import org.zhyuliuk.array.parser.ParserInterface;

import java.util.ArrayList;

public class Parser implements ParserInterface {

    public ArrayList<int[]> parseWithStream(String[] correctLines) {
//        int[] resultArray;
//        ArrayList resultList = new ArrayList<int[]>();
//        for (String correctLine : correctLines) {
//            resultArray = Arrays.stream(correctLine.split(","))
//                    .mapToInt(element -> Integer.parseInt(element))
//                    .toArray();
//            resultList.add(resultArray);
//        }
//        return resultList;
        return null;
    }

    public ArrayList<int[]> parse(ArrayList<String> list) {
        int[] numberArray;
        ArrayList<int[]> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] masOfStrings = list.get(i).split(",");
            for (int j = 0; j < masOfStrings.length; j++) masOfStrings[j] = masOfStrings[j].trim();//trim надо
            int[] resultArray = new int[masOfStrings.length];
            for (int j = 0; j < masOfStrings.length; j++) {
                resultArray[j] = Integer.parseInt(masOfStrings[j]);
            }
            resultList.add(resultArray);
        }
        return resultList;
    }
}
