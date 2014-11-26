package interfaces;

public interface StringMatcherInterface {
	
	public void add_exact_match(String exact_str,int val);
	
	public void add_prefix_match(String prefix_str,int val);
	
	public int lookup(String input);
	
	public boolean delete_exact_match(String exact_str);
	
	public boolean delete_prefix_match(String prefix_str);	

}
