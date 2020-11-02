package com.prathyusha.unit3;

import java.util.Arrays;
import java.util.List;

import com.prathyusha.unit1.Person;

public class StreamsExample1 {
	
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Prathyusha","Bellam",16),
				new Person("Pravallika","paritala",17),
				new Person("Mahesh","Ghattamaneni",15),
				new Person("Anusha","Gaddamm",30)
					);
		
		/*
		 * people.stream() .filter(p -> p.getLastName().startsWith("G")) .forEach(p ->
		 * System.out.println(p.getFirstName()));
		 */
		
		/*
		 * long count = people.stream() .filter(p -> p.getLastName().startsWith("B"))
		 * .count();
		 * 
		 * System.out.println(count);
		 */
		
		long count = people.parallelStream()
				.filter(p -> p.getLastName().startsWith("B"))
				.count();
				
				System.out.println(count);
				

}

}
