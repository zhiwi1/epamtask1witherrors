package org.zhyuliuk.array.reader;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.reader.impl.ReadArrayAction;

import java.io.IOException;
import java.util.ArrayList;

public class ReadArrayTest {
    ReadArrayInterface arrayInterface=new ReadArrayAction();
    String filename="testRead.txt";
    @Test(description = "Тест чтения")
    public void ReadInListTest()  {
        try{
       ArrayList<String>list= arrayInterface.readInList(filename);
ArrayList<String>expected=new ArrayList<>();
expected.add("1, 2, 3");
Assert.assertEquals(list,expected);
    }catch (IOException e){
            Assert.fail("Can't");
        }
    }

}
