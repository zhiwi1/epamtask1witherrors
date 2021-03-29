package org.zhyuliuk.array.parser;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.parser.impl.Parser;
import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.reader.impl.ReadArrayAction;

import java.io.IOException;
import java.util.ArrayList;

public class ParserTest {
    ParserInterface parser = new Parser();

    @Test(description = "Тест чтения")
    public void parseTest() {

        ArrayList<String> list = new ArrayList<>();
        list.add("1,2,3,4");
        ArrayList<int[]> listActual = parser.parse(list);
        ArrayList<int[]> listExpected = new ArrayList<>();
        listExpected.add(new int[]{1, 2, 3, 4});

        Assert.assertEquals(listActual.get(0), listExpected.get(0));
    }

}
