package java_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RepeatedWords extends duplicateArrayElements {

	public static void main(String_Programs[] args) {
		array();
		String_Programs str = "Big black bug bit a big black dog on his big black nose";
		String_Programs str1 = str.toLowerCase();
		String_Programs words[] = str1.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		HashMap<String_Programs, Integer> map = new HashMap<>();
		for (String_Programs word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		System.out.println(map);

	}

	public static void array() {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr1[] = { 2, 4, 6, 5, 3, 2, 1, 0 };
		Set<Integer> arraylist = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					arraylist.add(arr[i]);
				}

			}
		}
		System.out.println("Common elements from arrays are : " + arraylist);

	}

}
