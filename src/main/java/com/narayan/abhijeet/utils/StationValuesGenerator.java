package com.narayan.abhijeet.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
 * Randomly generates 100 station codes
 * each having 3 capital letters
 */
public class StationValuesGenerator {

	private static char[] chars = {'A','B','C','D','E','F', 'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public static void main(String[] args) {
		Set<Character[]> codes = new HashSet<Character[]>();
		Random rnd = new Random();
		
		for(int i =1;i<100;i++) {
			Character[] code = new Character[3];
			code[0] = chars[rnd.nextInt(26)];
			code[1] = chars[rnd.nextInt(26)];
			code[2] = chars[rnd.nextInt(26)];
			codes.add(code);
		}
		
		for(Character[] code: codes) {
			System.out.print(""+code[0]+code[1]+code[2]+ ",");
		}
	}
}
