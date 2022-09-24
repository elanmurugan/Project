package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		
		List<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(1);
		a.add(20);
		
		for (int i = 0; i < a.size(); i++) {
			
			if ((i%2)==0) {
				
				System.out.println("even number");
				
			}
			else {
				
				

			}
			
		}
		
		System.out.println(a.get(0));
		
		
	}

}
