package org.zhyuliuk.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.validator.impl.ValidatorForReading;

public class ValidatorForArrayTest {

    ValidatorReadInterface validator=new ValidatorForReading();
    @Test(description = "")
    public void validateLinesTest(){
        String line="1,2,3,4d";
        Assert.assertEquals(    validator.validateLines(line),true);

    }
}
