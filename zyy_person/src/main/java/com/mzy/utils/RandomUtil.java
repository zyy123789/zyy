package com.mzy.utils;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class RandomUtil {

	//：①获取最小最大区间的随机数
	@Test
	public static int getRandom(int min, int max) {
		return (int)(Math.random()*(max-min)+min);
	}
	//②获取最 小最大区间多个不重复随机数
	@Test
	public static Set<Integer> getRandom(int min, int max, int num){
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() != num) {
			set.add((int)(Math.random()*(max-min)+min));
		}
		return set;
	}
	//③获取 1 个 1-9,a-Z 之间的随机字符
	public static char getRandomChar() {
		String str = "123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		char[] charArray = str.toCharArray();
		int index = 0;
		for (int i = 0; i < charArray.length; i++) {
			index = (int)(Math.random()*(charArray.length-0)+0);
		}
		return charArray[index];
	}
	//④返回参数指定个数的随机字符串(应用场景如：验证码)
	public static String getrandomString(int num){
		String result = "";
		while(result.length() != num) {
			result += getRandomChar();
		}
		return result;
	}
}
