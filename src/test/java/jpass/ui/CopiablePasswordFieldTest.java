package jpass.ui;

import org.junit.Assert;
import org.junit.Test;

public class CopiablePasswordFieldTest {

    @Test
    public void testCopyEnabled() {
        CopiablePasswordField fieldTrue = new CopiablePasswordField(true);
        Assert.assertTrue("CopyEnabled is set to true", fieldTrue.isCopyEnabled());

        CopiablePasswordField fieldFalse = new CopiablePasswordField(false);
        Assert.assertFalse("CopyEnabled is set to false", fieldFalse.isCopyEnabled());
    }
}

