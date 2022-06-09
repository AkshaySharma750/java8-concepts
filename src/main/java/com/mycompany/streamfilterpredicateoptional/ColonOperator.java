package com.mycompany.streamfilterpredicateoptional;

import java.util.Arrays;
import java.util.List;

public class ColonOperator {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("apple","mango","banana","grapes");
		
		
		//names.forEach(name->System.out.println(name));
		names.forEach(System.out::println);//double colon operator
		
		names.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
