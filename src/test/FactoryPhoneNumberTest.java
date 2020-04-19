package test;

import main.com.myt.katas.phoneNumber.FactoryPhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryPhoneNumberTest {

    @Test
    public void display_number_valid_input() {
        Assertions.assertEquals("(123) 456-7890", FactoryPhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
     public void throws_invalid_input() {
         Assertions.assertThrows(IllegalArgumentException.class, ()-> FactoryPhoneNumber.createPhoneNumber(new int[] {12,3,4,5,66,7,7}));
    }
}
