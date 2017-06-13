/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *    |_MelonGenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author    : Kimminhyeong
 * @version   : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> list1 = new ArrayList<Music>();
		list1.add(new Music("팔레트","아이유"));
		
		List<Music> list2 = new ArrayList<Music>();
		list2.add(new Music("I LUV IT","PSY"));
		list2.add(new Music("맞지?","언니쓰"));
		
		System.out.println("--<<멜론 장르별 챠트>>--");
		map.put("발라드", list1);
		map.put("댄스",list2);
		printMap(map);
		System.out.println();
		
		System.out.println("--<<댄스 2위 곡 변경>>--");
		list2.set(1,new Music("SIGNAL","트와이스"));
		map.put("댄스",list2);
		printMap(map);
		System.out.println();
		
		System.out.println("--<<댄스 1위 곡 삭제>>--");
		list2.remove(1);
		map.put("댄스",list2);
		printMap(map);
		System.out.println();
		
		System.out.println("--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);

	}
	public static void printMap(Map<String, List<Music>> map){
		for(String Key : map.keySet()){
			System.out.println("["+Key+"]");
			int cnt=0;
			for(Music Key2 : map.get(Key)){
				cnt++;
				System.out.println(cnt+". "+Key2);
			}
		}
	}

}
