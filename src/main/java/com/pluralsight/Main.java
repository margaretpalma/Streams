package com.pluralsight;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Ezra", "Cooper", 4));
        people.add(new Person("Leah", "London", 11));
        people.add(new Person("Emma", "D'Arcy", 32));
        people.add(new Person("Kristen", "Stewart", 25));
        people.add(new Person("Mia", "Dot", 22));
        people.add(new Person("Robert", "Pattison", 38));
        people.add(new Person("Leah", "Hendrix", 27));
        people.add(new Person("Ezra", "Black", 30));
        people.add(new Person("Clancy", "Stewart", 40));
        people.add(new Person("Dominic", "Dot", 19));

        while(true){
            String searchForName = ConsoleHelper.promptForString("Enter First Or Last Name").toLowerCase();

            if(searchForName.equals("quit")){
                System.out.println("Exiting Program");
                break;
            }

            //stream - turns list into stream - person one by one
            List<Person> personMatches = people.stream()
                    //keep matching ones
                    .filter(person ->
                            person.getFirstName().equalsIgnoreCase(searchForName) ||
                                    person.getLastName().equalsIgnoreCase(searchForName))

                    //turn stream into list
                    .toList();

            if(personMatches.isEmpty()) {
                System.out.println("No Matches Found For: " + searchForName);
            }else {
                personMatches.forEach(person -> System.out.println(person));
            }
        }
    }
}