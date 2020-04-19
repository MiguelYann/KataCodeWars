package com.myt.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    public void display_number_valid_input() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        int[] ints = new int[]{1,2,4};
    }

    @Test
     public void throws_invalid_input() {
         Assertions.assertThrows(IllegalArgumentException.class, ()-> PhoneNumber.createPhoneNumber(new int[] {12,3,4,5,66,7,7}));
    }
}
