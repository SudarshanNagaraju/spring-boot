package hello.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		
		List<HashMap<String, String>> list=new ArrayList<>();
		
		
		HashMap<String , String> map=new HashMap<String,String>();
		
		
		map.put("DOB", "ONE");
		map.put("AGE", "20");
		map.put("HI", "Hello");
		
		
		list.add(map);
		
		map=new HashMap<String,String>();
		for(int i=0;i<list.size();i++) {
			
			map=list.get(i);
			
			for(String key:map.keySet()) {
			System.out.println("Value"+map.get(key));
			}
			
			
		}
		

	}

}
