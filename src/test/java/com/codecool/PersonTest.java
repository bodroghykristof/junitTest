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

    @Test
    public void testAgeCanBeSetToPositiveValue() {
        Person john = new Person("John", 31);
        john.setAge(15);
        assertEquals(15, john.getAge());
    }

    @Test
    public void testNameCanBeSet() {
        Person john = new Person("John", 31);
        john.setName("George");
        assertEquals("George", john.getName());
    }

    @Test
    public void testGetName() {
        Person john = new Person("John", 31);
        assertEquals("John", john.getName());
    }
}