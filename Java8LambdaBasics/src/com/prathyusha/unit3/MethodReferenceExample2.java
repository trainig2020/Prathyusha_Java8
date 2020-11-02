package com.prathyusha.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.prathyusha.unit1.Person;

public class MethodReferenceExample2 {
	
public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Prathyusha","Bellam",16),
				new Person("Pravallika","paritala",17),
				new Person("Mahesh","Ghattamaneni",15),
				new Person("Anusha","Gaddamm",30)
					);
				
	
		
	System.out.println("printing all persons");
    //performConditionally(people, p -> true, p -> System.out.println(p));
	//using Method Reference	
    performConditionally(people, p -> true, System.out::println); //p ->method(p)
   }

  private static void performConditionally(List<Person> people,Predicate <Person >predicate,Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}	
		}	
	}

}
