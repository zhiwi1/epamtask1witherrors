package org.zhyuliuk.array.creator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.creator.impl.CreatorNumberArray;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.parser.ParserInterface;
import org.zhyuliuk.array.parser.impl.Parser;
import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.reader.impl.ReadArrayAction;

import java.io.IOException;
import java.util.ArrayList;


public class CreatorTest {
    CreatorInterface creator= new CreatorNumberArray();

    @Test(description = "Тест чтения")
    public void createTest() {
        int[] array=new int[]{1,2,3};
        NumberArray numArray=new NumberArray(array);
        NumberArray[] arrExpected=new NumberArray[]{
                numArray
        };
        ArrayList<int[]>list=new ArrayList<>();
        list.add(new int[]{1,2,3});
       NumberArray arrActual[]= creator.create(list);
        Assert.assertEquals(arrActual,arrExpected);



    }
}
