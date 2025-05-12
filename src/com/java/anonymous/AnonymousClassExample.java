package com.java.anonymous;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Magesh", "Kumar", "Aathi");
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {

				return s1.length() - s2.length();
			}

		});
		
		System.out.println(names);

	}

}
