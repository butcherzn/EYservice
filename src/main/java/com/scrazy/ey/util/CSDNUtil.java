package com.scrazy.ey.util;

public class CSDNUtil {
	
	 public static int GetPageNum(String str){
		String[] sub = str.split("共");
		String[] subtoken = sub[1].split("页");
		System.out.println();
		return Integer.valueOf(subtoken[0]);
	}
}
