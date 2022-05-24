package com.techelevator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ldate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate myBirthday = LocalDate.of(1985, 10, 27);

        today.isAfter(myBirthday);
        System.out.println(today.isAfter(myBirthday));
        LocalDate tomorrow = today.plusDays(1);

        LocalDate endOfJan = LocalDate.of(2022, 01, 31);
        System.out.println(endOfJan.plusMonths(1));
        System.out.println(endOfJan.plusMonths(2));

        today.format(DateTimeFormatter.ISO_DATE);
        today.format(DateTimeFormatter.ofPattern("yyyy MM dd"));


    }

}
