package jeni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLis {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("Apple");
		al.add("Banana");
		System.out.println(al);
		ArrayList<String> a = new ArrayList<String>();

		for (String i : al) {
			if (!a.contains(i)) {

				a.add(i);
			}
		}

		System.out.println(a);

	}

}
