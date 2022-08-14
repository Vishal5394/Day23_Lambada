package com.Bridgelabz.Lambda;

import static org.junit.Assert.*;

import org.junit.Test;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    //UserCase1
    @Test
    public void firstNameTestShouldReturnTrue() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "Shruthin", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);

    }

    @Test
    public void firstNameTestShouldReturnFalse() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.firstName("^[A-Z]{1}[a-z]{3,}$", "shruthin", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);

    }

    //UserCase2
    @Test
    public void lastNameTestShouldReturnTrue() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$", "Satheesh", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }

    @Test
    public void lastNameTestShouldReturnFalse() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.lastName("^[A-Z]{1}[a-z]{3,}$", "satheesh", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }

    //UserCase3
    @Test
    public void emailTestShouldReturnTrue() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "vishnuofch@gmail.com", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }

    @Test
    public void emailTestShouldReturnFalse() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.email("^[a-zA-Z0-9\\-\\+\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$", "vishnuofch#gmail.com", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }

    //UserCase4
    @Test
    public void phoneTestShouldReturnTrue() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$", "7777777777", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }

    @Test
    public void phoneTestShouldReturnFalse() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.phone("^[0-9]{2}[ ]?[0-9]{10}$", "7038682300", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }

    //UserCase8
    @Test
    public void passwordTestShouldReturnTrue() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])", "vishnuofch@", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertTrue(result);
    }

    @Test
    public void passwordTestShouldReturnFalse() {
        boolean result = false;
        try {
            InvalidUserException.ExpectedException expectedException = InvalidUserException.ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            result = userRegistration.password("^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])([a-zA-Z0-9]+[\\@\\#\\^])", "Shruthin", "Happy");
        } catch (InvalidUserException e) {
            e.printStackTrace();
        }
        assertFalse(result);
    }

}