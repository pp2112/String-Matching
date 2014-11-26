package demo;

import concrete_implementation.StringMatcher;

public class Demo {
	
	public static void main(String[] args){
		StringMatcher matcher = new StringMatcher();
		matcher.add_exact_match("abc", 908);
		matcher.add_prefix_match("fas",907);
		matcher.add_prefix_match("abc",901);
		
		System.out.println(matcher.lookup("abc"));
		System.out.println(matcher.lookup("fast"));
		System.out.println(matcher.delete_exact_match("abc"));
		System.out.println(matcher.lookup("abc"));
		System.out.println(matcher.delete_prefix_match("abc"));
	}

}
