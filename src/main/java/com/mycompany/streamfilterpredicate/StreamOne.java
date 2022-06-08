package com.mycompany.streamfilterpredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamOne {

	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		numList.add(11);
		numList.add(12);
		numList.add(211);
		numList.add(121);
		numList.add(141);
		numList.add(1661);
		
		System.out.println(numList);
		List<Integer> oddNumList = new ArrayList<>();
		
		for(Integer num:numList) {
			if(num%2 !=0) {
				oddNumList.add(num);
			}
		}
		//System.out.println(oddNumList);
		
		//Java 8
		oddNumList = numList.stream().filter((num)->{
			if(num%2 !=0) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
		
		oddNumList = numList.stream().filter(num->num%2 !=0).collect(Collectors.toList());
		System.out.println(oddNumList);
		
		Predicate<Integer> oddLogic = num-> num%2 !=0;
		Predicate<Integer> gt50 = num-> num > 50;
		
		//oddNumList = numList.stream().filter(oddLogic).collect(Collectors.toList());
		
		oddNumList = numList.stream().filter(oddLogic.and(gt50)).collect(Collectors.toList());
		System.out.println(oddNumList);
	}

}
