package com.codecool;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testNameIsNotNull() {
        Person john = new Person("John", 31);
        assertNotNull(john.getName());
    }

    @Test
    public void testIsAgeBelowThrowsException() {
        Person john = new Person("John", 31);
        assertThrows(IllegalArgumentException.class, () -> john.setAge(-5));
    }
}