package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
       // people.add(//new person ("name" "lasstName" "age"))

       people.add(new Person("Scout","London", 33));
       people.add(new Person("Clancy", "Cooper", 31));
       people.add(new Person("Ezra","Cooper", 4));
       people.add(new Person("Leah", "London", 11));
       people.add(new Person("Emma","D'arcy", 32));
       people.add(new Person("Kristen", "Stewart", 25));
       people.add(new Person("Mia","Goth", 22));
       people.add(new Person("Robert", "Pattison", 38));


       //prompt name search
        System.out.println("Enter A First Or Last Name: ");
        String searchForName = scanner.nextLine().trim().toLowerCase();

        List<Person> personList = new ArrayList<>();

        //loop through names






        //display results




        //average age / oldest / youngest

    }
}