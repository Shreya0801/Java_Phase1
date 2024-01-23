package eg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(3333);
		li.add("mayekar");
		li.add(77.888);
		li.add(true);
		li.add(299999999L);
		li.add('c');
		li.add(null);
		li.add(null);
		li.add("mayekar");
		System.out.println(li);
		
		List<Integer> list1=new LinkedList<>();
		//list1.add("hhh");
		list1.add(12222);
		list1.add(12222);
		list1.add(3);
		list1.add(44);
		list1.add(22);
		list1.add(4000);
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		list1.add(1,100);
		System.out.println(list1);
		System.out.println(list1.size());
		
		System.out.println(list1.get(0)); //read
		
		System.out.println("Iterating the list using for loop");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i+"->"+list1.get(i));
		}
		
		list1.set(7, 77777); //update
		System.out.println(list1);
		
		
		list1.remove(0);//takes index
		System.out.println(list1);
		
		Integer i=100;
		list1.remove(i);//takes object as value and deletes that value from your list remember it takes off only the first occurance
		System.out.println(list1);
		list1.add(22);
		list1.add(22);
		System.out.println(list1);
		Integer i1=22;
		list1.remove(i1);
		System.out.println(list1);
		
		while(list1.remove(i1)) {}
		System.out.println(list1);
		

	}

}