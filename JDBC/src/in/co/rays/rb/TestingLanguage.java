package in.co.rays.rb;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestingLanguage {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.rb.lang");
		System.out.println(rb.getString("greeting"));
		
		ResourceBundle rb1 = ResourceBundle.getBundle("in.co.rays.rb.lang",new Locale("hi"));
		System.out.println(rb1.getString("greeting"));

		ResourceBundle rb2 = ResourceBundle.getBundle("in.co.rays.rb.lang",new Locale("jp"));
		System.out.println(rb2.getString("greeting"));
	}
	
	
}

























