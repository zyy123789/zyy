package com.zyy.utils;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * ①获取最小最大区间的随机数；
 * ②获取最 小最大区间多个不重复随机数
 * ③获取 1 个 1-9,a-Z 之间的随机字符；
 * ④返回参数指定个数的随机字符串(应用场景如：验证码)。
 * @author Dell
 *
 */
public class Randomutil {

	//①获取最小最大区间的随机数
	public static int getRandomNum(int min, int max) {
		int i = (int)(Math.random()*(max-min)+min);
		if (i == min || i == max) {
			i = (int)(Math.random()*(max-min)+min);
		}
		return i;
	}
//	@Test
//	public void getRandomNum() {
//		int i = (int)(Math.random()*(10-1)+1);
//		if (i == 1 || i == 10) {
//			i = (int)(Math.random()*(10-1)+1);
//		}
//		System.out.println(i);
//	}
	//②获取最 小最大区间多个不重复随机数
	public static Set<Integer> getRandomNum(int min, int max, int num) {
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != num) {
			set.add((int)Math.random()*(max-min)+min);
		}
		return set;
	}
//	@Test
//	public void getRandomNum1() {
//		Set<Integer> set = new HashSet<Integer>();
//		
//		while (set.size() != 10) {
//			set.add((int)(Math.random()*(20-1)+1));
//		}
//		System.out.println(set);
//	}
	//③获取 1 个 1-9,a-Z 之间的随机字符；
//	@Test
//	public void getRandomChar() {
//		String str = "123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
//		char[] charArray = str.toCharArray();
//		int index = 0;
//		for (int i = 0; i < charArray.length; i++) {
//			index = (int)(Math.random()*(str.length()-0)+0);
//		}
//		System.out.println(charArray[index]);
//	}
	public static char getRandomChar() {
		String str = "123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		char[] charArray = str.toCharArray();
		int index = 0;
		for (int i = 0; i < charArray.length; i++) {
			index = (int)(Math.random()*(str.length()-0)+0);
		}
		return charArray[index];
	}
	//④返回参数指定个数的随机字符串(应用场景如：验证码)
//	@Test
//	public void getRandomString() {
//		String result = "";
//		while (result.length() != 5) {
//			result += getRandomChar();
//		}
//		System.out.println(result);
//	}
	public static String getRandomString(int num) {
		String result = "";
		while (result.length() != num) {
			result += getRandomChar();
		}
		return result;
	}
}
