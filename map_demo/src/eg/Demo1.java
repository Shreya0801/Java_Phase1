package eg;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(121, "java");
		hm.put(121, "updated");
		hm.put(null, "testnull");
		hm.put(null, "testnull");
		hm.put(144, null);
		hm.put(244, null);
		hm.put(444, null);
		hm.put(777, "jme");
		hm.put(744,"jme");
		hm.put(944, "jeee");
		hm.put(99, "AJAY");
		System.out.println("hm = "+hm);
		
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(121, "java");
		lhm.put(121, "updated");
		lhm.put(null, "testnull");
		lhm.put(null, "testnull");
		lhm.put(444, null);
		lhm.put(777, "jme");
		lhm.put(744,"jme");
		lhm.put(944, "jeee");
		lhm.put(144, null);
		lhm.put(244, null);
		
		System.out.println("lhm = "+lhm);
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(121, "java");
		tm.put(121, "updated");
		//tm.put(null, "testnull");
		//tm.put(null, "testnull");
		tm.put(144, null);
		tm.put(244, null);
		tm.put(444, null);
		tm.put(777, "jme");
		tm.put(744,"jme");
		tm.put(944, "jeee");
		tm.put(44, "jeee");
		tm.put(9, "jeee");
		tm.put(22, "jeee");
		System.out.println("tm = "+tm);
		
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(121, "java");
		ht.put(121, "updated");
	//	ht.put(null, "testnull");
	//	ht.put(null, "testnull");
	//	ht.put(444, null);
		ht.put(777, "jme");
		ht.put(744,"jme");
		ht.put(944, "jeee");
		//ht.put(144, null);
		//ht.put(244, null);
		
		System.out.println("ht = "+ht);
		
		System.out.println(ht.get(744));
		System.out.println(ht.get(1));
		
		System.out.println(ht.containsKey(777));
		System.out.println(ht.containsKey(7771));
		
		System.out.println(ht.containsValue("vinay"));
		System.out.println(ht.containsValue("jme"));
		
		System.out.println(ht.size());
		
		ht.remove(121);
		System.out.println(ht);
		
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		System.out.println("Iterating map using keySet()");
		Set<Integer> set=ht.keySet();
		for(Integer i:set) {
			System.out.println("key is "+i+" value is "+ht.get(i));
		}
		
		System.out.println("Iterating map using entrySet()");
		for(Entry<Integer, String> e:ht.entrySet()) {
			if(e.getValue().equals("jme")) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue().toUpperCase());
			}
		}
		

	}

}