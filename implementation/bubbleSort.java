package Alg;

import java.util.ArrayList;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(-2);
		list.add(25);
		list.add(16);
		list.add(15);
		
		bubbleSort s=new bubbleSort();
		s.bubble_Sort(list);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+", ");
		}
	}
	
	public void bubble_Sort(ArrayList<Integer> lists){
		for(int i=0;i<lists.size()-1;i++){
			for(int j=i+1;j<lists.size();j++){
				if(lists.get(i)>=lists.get(j)){
					int tmp=lists.get(i);
					lists.set(i, lists.get(j));
					lists.set(j, tmp);
					
				}
			}
			
		}
		
	}
	
	

}
