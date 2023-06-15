package ch15;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map<String,Integer> map=new HashMap<>();
		Map<String,Integer> map=new Hashtable<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry수:"+map.size());
		System.out.println();
		
		String key="홍길동";
		int value=map.get(key);
		System.out.println(key+": "+value);
		System.out.println();
		Set<String> keySet=map.keySet();
		for(String s:keySet) {
			System.out.println(s+":"+map.get(s));
		}
//		Iterator<String> it=keySet.iterator();
//		while(it.hasNext()) {
//			String k=it.next();
//			int v=map.get(k);
//			System.out.println(k+" : "+v);
//		}
		System.out.println();
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Entry<String, Integer>> it=entrySet.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry=it.next();
			String k=entry.getKey();
			int v=entry.getValue();
			System.out.println(k+":"+v);
		}
		System.out.println();
		map.remove("홍길동");
		System.out.println("총 Entry수:"+map.size());
		System.out.println();
		for(Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
	}

}
