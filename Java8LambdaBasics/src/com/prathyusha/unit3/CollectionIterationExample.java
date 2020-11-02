package com.prathyusha.unit3;

import java.util.Arrays;
import java.util.List;

import com.prathyusha.unit1.Person;

public class CollectionIterationExample {

public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Prathyusha","Bellam",16),
				new Person("Pravallika","paritala",17),
				new Person("Mahesh","Ghattamaneni",15),
				new Person("Anusha","Gaddamm",30)
					);
				
		System.out.println("Using for loop");
		
		for(int i =0; i < people.size();i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");
		
		for(Person p: people) {
			System.out.println(p);
		}
		
		System.out.println("Using lambda for each loop");
		//people.forEach(p -> System.out.println(p));
		people.forEach(System.out::println);
		
   }

}
