package org.zhyuliuk.array.reader.impl;


import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.validator.ValidatorReadInterface;
import org.zhyuliuk.array.validator.impl.ValidatorForReading;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadArrayAction  implements ReadArrayInterface {
    private static Logger logger = LogManager.getLogger();


    public ArrayList<String> readInList(String pathname) throws IOException  {

        ValidatorReadInterface validatorInterface = new ValidatorForReading();
        if (validatorInterface.fileExists(pathname)) {

            ArrayList<String> rightList = new ArrayList<>();
            List<String> list = readByJava7(pathname);
            for (int i = 0; i < list.size(); i++) {
                if (validatorInterface.validateLines(list.get(i))) {

                    rightList.add(list.get(i));
                    System.out.println(list.get(i));
                    logger.log(Level.INFO,list.get(i));
                }
            }
            if (!validatorInterface.emptyFile((ArrayList<String>) list)) {
                logger.log(Level.INFO, "Success in reading");
                return (ArrayList<String>) list;

            }
        }
        logger.log(Level.ERROR, "File doesn't exist");
        return null;
    }

    private  List<String> readByJava7(String fileName) throws IOException {
        return Files.readAllLines(new File(fileName).toPath(), Charset.defaultCharset());
    }


}
