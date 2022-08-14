package com.Bridgelabz.Lambda;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class ValidEmailTest {
    private final String email2Test;
    private final boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult) {
        this.email2Test = email;
        this.expectedResult = expectedResult;
    }

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false}
        });
    }

    @Test
    public void shouldValidateAllTheEmailSamples(Assert Assert) {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", this.email2Test, "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(this.expectedResult, result);
    }
}
