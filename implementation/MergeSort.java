package Alg;

import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int list[]={-2,16,10,3,9,26,25,-10,0};
		MergeSort s=new MergeSort();
		s.split(list);
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+", ");
		}
	}
	
	public void split(int[] list){
		int len=list.length;
		if(len>1){
			int firstHalf=len/2;
			int []firstArr=new int[firstHalf];
			System.arraycopy(list, 0, firstArr, 0, firstHalf);
			split(firstArr);
			
			int secHalf=len-firstHalf;
			int []secArr=new int[secHalf];
			System.arraycopy(list, firstHalf, secArr, 0, secHalf);
			split(secArr);
			
			int temp[]=merge(firstArr,secArr);
			System.arraycopy(temp, 0, list, 0, temp.length);
			System.out.println("split result: ");
			for(int i=0;i<temp.length;i++){
				System.out.print(temp[i]+", ");
			}
			System.out.println();
			
		}
		
		
	}
	
	public int[] merge(int[] list1,int[] list2){
		int result[]=new int[list1.length+list2.length];
		int point1=0;
		int point2=0;
		int i=0;
		while(point1<list1.length&&point2<list2.length){
			System.out.println("list1: "+list1[point1]+", list2: "+list2[point2]);
			if(list1[point1]<list2[point2]){
				result[i]=list1[point1];
				point1++;
				
			}else{
				result[i]=list2[point2];
				point2++;
			}
			i++;
		}
		while(point1<list1.length){
			result[i]=list1[point1];
			point1++;
			i++;
		}
		while(point2<list2.length){
			//System.out.println("list2.length:"+list2.length+", point2: "+point2+"list2[point2]: "+list2[point2]);
			result[i]=list2[point2];
			point2++;
			i++;
		}
		
		return result;
	}

}
