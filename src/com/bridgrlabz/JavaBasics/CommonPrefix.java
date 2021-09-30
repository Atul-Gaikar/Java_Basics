package com.bridgrlabz.JavaBasics;

public class CommonPrefix {
	public static void main(String[] args) {
		String[] words = { "flower", "flow", "flight" };
		String prefix = commonPrefix(words);
		System.out.println(prefix);

	}

	private static String commonPrefix(String[] words) {
		int counter = 0;
		external: for (int i = 0; i < words[0].length(); i++) {
			char letter = words[0].charAt(i);
			for (int j = 1; j < words.length; j++) {
				if (words[j].length() <= i || letter != words[j].charAt(i)) {
					break external;
				}
			}
			counter++;
		}
		return words[0].substring(0, counter);
	}

}
