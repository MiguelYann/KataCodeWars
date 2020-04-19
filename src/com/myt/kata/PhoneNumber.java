package com.myt.kata;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {

        StringBuilder phoneNumber = new StringBuilder();
        StringBuilder firstSequence = new StringBuilder();
        StringBuilder secondSequence = new StringBuilder();
        StringBuilder thirdSequence = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0 && numbers[i] < 10) {
                if (i == 0 || i == 1 || i == 2) {
                    firstSequence.append(numbers[i]);
                }

                if (i == 3 || i == 4 || i == 5) {
                    secondSequence.append(numbers[i]);
                }

                if (i == 6 || i == 7 || i == 8 || i == 9) {
                    thirdSequence.append(numbers[i]);
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

        phoneNumber.append("(");
        phoneNumber.append(firstSequence.toString());
        phoneNumber.append(")");
        phoneNumber.append(" ");
        phoneNumber.append(secondSequence.toString());
        phoneNumber.append("-");
        phoneNumber.append(thirdSequence.toString());

        return phoneNumber.toString();
    }
}
