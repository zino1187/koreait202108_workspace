package com.koreait.project0826.colletion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//컬렌션 프레임웍이 지원하는 객체 중  key-value의 쌍으로 구성된 집합을 제어하는 Map계열을 학습한다
public class MapStudy {
	
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		
		map.put("name1" ,"Smith");
		map.put("name2" ,"Scott");
		map.put("name3" ,"King");
		
		//String s=(String)map.get("name1");
		//System.out.println(s);
		
		Set<String> keySet= map.keySet(); //명단만 끄집어 내서 Set에 담았다!!
		Iterator<String> it=keySet.iterator(); //명단을 일렬로 늘어뜨림...
		
		while(it.hasNext()) { //true인 동안 이터레이터를 돌림
			String key=it.next();
			String data=map.get(key);
			System.out.println(data);
		}
		
	}
}








