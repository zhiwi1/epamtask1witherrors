package org.zhyuliuk.array.validator;


import java.util.ArrayList;

public interface ValidatorReadInterface {

    public boolean validateLines(String line);
    public boolean fileExists(String filename);
    public boolean emptyFile(ArrayList<String> list);
}