package com.String;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
        public static void main(String[] args) {

            String str = "2017-07-05";
            LocalDate date = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);

            System.out.println(date);
        }
    }

