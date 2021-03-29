package org.zhyuliuk.array;

import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.reader.impl.ReadArrayAction;
import org.zhyuliuk.array.service.DefinitionArrayService;
import org.zhyuliuk.array.service.ReplacementArrayService;
import org.zhyuliuk.array.service.SearchArrayService;
import org.zhyuliuk.array.validator.ValidatorReadInterface;
import org.zhyuliuk.array.validator.impl.ValidatorForReading;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {

    public static void main(String[] args) throws IOException {

        NumberArray arr = new NumberArray(new int[]{-1, -2, -3, 1, 2, 3, 10, -10});

        DefinitionArrayService das = new DefinitionArrayService();
        ReplacementArrayService ras = new ReplacementArrayService();
        SearchArrayService sas = new SearchArrayService();
        das.definitionSum(arr);
        das.countNegativeEl(arr);
        das.countPositiveEl(arr);
        das.definitionOfMean(arr);
        sas.findMaxElement(arr);
        sas.findMinElement(arr);
        ras.replaceIfSmaller(arr, 57, 0);
        ReadArrayInterface arrayInterface=new ReadArrayAction();
        List<String> list=new ArrayList<>();
        Logger logger=LogManager.getLogger();
        ValidatorReadInterface validator=new ValidatorForReading();
        String filename="a.txt";
       list= arrayInterface.readInList(filename);

           for (int i = 0; i < list.size(); i++) {
               logger.info(validator.validateLines(list.get(i)));
               if(validator.validateLines(list.get(i))) {
              logger.debug(list.get(i));

           }
       }
    }
}
