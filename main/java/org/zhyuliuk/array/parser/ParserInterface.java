package org.zhyuliuk.array.parser;

import java.util.ArrayList;

public interface ParserInterface {
    public ArrayList<int[]> parseWithStream(String[] correctLines);
    public ArrayList<int[]> parse(ArrayList<String> list);
}
