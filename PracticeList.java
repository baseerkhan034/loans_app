package collection;

import java.util.ArrayList;

public class PracticeList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(13);
		al.add("raj");
		al.add('v');
		System.out.println(al);
		System.out.println(al.contains('v'));
		al.remove(2);
		System.out.println(al.contains('v'));
		System.out.println(al.contains('V'));
		al.add(1, "kadali");
		System.out.println(al);
		
	}

}
