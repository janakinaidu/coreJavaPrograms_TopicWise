package arrayExamples;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateElemetsUsingHashMap {

	public static void main(String[] args) {
		
		int inputArray[] = {1,2,3,1,4,2,5,2};
		
			findDuplicateElements(inputArray);
	}

	public static void findDuplicateElements(int[] elementArray) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int element:elementArray){
			
			if(map.get(element)==null){
				map.put(element, 1);
			}else{
				map.put(element, map.get(element)+1);
			}
			
		}
		System.out.println(map);
		for(Entry<Integer,Integer> entry:map.entrySet()){
			if(entry.getValue()>1){
				System.out.println("Duplicate elements are:"+entry.getKey()+"found in "+entry.getValue()+"  times");
			}
		}
	}

}
