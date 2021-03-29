package org.zhyuliuk.array.validator.impl;

import org.zhyuliuk.array.validator.ValidatorReadInterface;

import java.io.File;
import java.util.ArrayList;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorForReading implements ValidatorReadInterface {
    private static Logger logger= LogManager.getLogger();

    public boolean validateLines(String line) {
        Pattern pattern=Pattern.compile("^\\s*\\d+\\s*(,\\s*(\\d|\\dd)\\s*)+$");
        Matcher matcher=pattern.matcher(line);
//        logger.log(Level.DEBUG,matcher.find());
        return matcher.find();
    }
    public boolean fileExists(String filename){

            File file = new File(filename);// инициализируем file
        // если файл существует то выполнить чтение, в противном случае ошибка
        return file.exists();

    }
    public boolean emptyFile(ArrayList<String> list){
        return list.size() == 0 || list.size() == 1 && list.get(0).isEmpty();
    }



}