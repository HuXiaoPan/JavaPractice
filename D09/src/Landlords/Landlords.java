package Landlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Landlords {
	public static String[] points = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
	public static String[] colors = {"♠","♥","♣","♦"};
	
	public static void main(String[] args) {
		HashMap<Integer,String> poker = new HashMap<Integer ,String>();
		ArrayList<Integer> pokerNum = new ArrayList<Integer>();

		poker.put(0, "大王");
		pokerNum.add(0);
		poker.put(1, "小王");
		pokerNum.add(1);
		
		int index = 2;
		for (String point : points) {
			for (String color : colors) {
				poker.put(index, color+point);
				pokerNum.add(index);
				index++;
			}
		}
		System.out.println(poker);
		
		Collections.shuffle(pokerNum);
		System.out.println(pokerNum);
		
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> library = new ArrayList<Integer>();
		
		for (int i = 0; i < pokerNum.size()-3; i++) {
			switch (i%3) {
			case 0:
				player1.add(pokerNum.get(i));
				break;
			case 1:
				player2.add(pokerNum.get(i));
				break;
			case 2:
				player3.add(pokerNum.get(i));
				break;
			default:
				break;
			}
		}
		for (int i = 51; i < pokerNum.size(); i++) {
			library.add(pokerNum.get(i));	
		}
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(library);
		
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		Collections.sort(library);
		
		System.out.println("=================================发牌并排序=============================");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(library);
		
		System.out.println("=================================看牌=============================");
		lookPoker(player1,poker);
		lookPoker(player2,poker);
		lookPoker(player3,poker);
		lookPoker(library,poker);
		
	}
	
	public static void lookPoker(ArrayList<Integer> arr, HashMap<Integer,String> poker) {
		ArrayList<String> playerPokers = new ArrayList<String>();
		for (Integer key : arr) {
			playerPokers.add(poker.get(key));
		}
		System.out.println(playerPokers);
	}
}
