package com.prathyusha.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
 
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Prathyusha","Bellam",16),
				new Person("Pravallika","paritala",17),
				new Person("Mahesh","Ghattamaneni",15),
				new Person("Anusha","Gaddamm",30)
					);
				
	//Step 1: Sort list by last name
		
    Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
	//Step 2: Create a method that prints all elements in the list
		
	System.out.println("printing all persons");
    //printAll(people);
    performConditionally(people, p -> true, p -> System.out.println(p));
		
		
	//step3: create a method that prints all people that have last name beginning with B 
		
	System.out.println("Printing all persons with last name beginning with G");
    performConditionally(people, p -> p.getLastName().startsWith("G"),p -> System.out.println(p));
    
	System.out.println("Printing all persons with first name beginning with P");
	
	performConditionally(people, p -> p.getFirstName().startsWith("P"),p -> System.out.println(p.getFirstName()));
		

	}


  private static void performConditionally(List<Person> people,Predicate <Person >predicate,Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}	
		}	
	}
}


