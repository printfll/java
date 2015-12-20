package Alg;

import java.util.ArrayList;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(-4);
		list.add(9);
		list.add(-3);
		list.add(5);
		list.add(-6);
		HeapSort h=new HeapSort();
		ArrayList<Integer> result=h.insert(list);
		
		for(int i=0;i<result.size();i++){
			System.out.print(result.get(i)+", ");
		}
		System.out.println("\n-----------");
		ArrayList<Integer> result2=h.remove(result);
		for(int i=0;i<result2.size();i++){
			System.out.print(result2.get(i)+", ");
		}
	}
	
	public ArrayList<Integer> insert(ArrayList<Integer> list){
		ArrayList<Integer> result=new ArrayList<Integer>();
		int pointer=0;
		for(int j=0;j<list.size();j++){
			
			result.add(list.get(j));
			pointer=j+1;
			while(true){
				if(pointer==1){
					break;
				}
				int parent=result.get(pointer/2-1);
				if(parent>result.get(pointer-1)){
					//System.out.println("old parent: "+parent+", child:"+result[pointer-1]);
					int tmp=result.get(pointer-1);
					result.set(pointer-1, parent);
					result.set(pointer/2-1, tmp);
					
					//System.out.println("new now parent: "+result[pointer/2-1]+", child:"+result[pointer-1]);
					pointer=pointer/2;
					
				}else{
					break;
				}
			}
			
			
		}
		return result;
	}
	
	
	public ArrayList<Integer> remove(ArrayList<Integer> list){
		ArrayList<Integer> result=new ArrayList<Integer>();
		while(list.size()>0){
			
			result.add(list.get(0));
			list.set(0, list.get(list.size()-1));
			list.remove(list.size()-1);
		
			if(list.size()>1){
				int parent=list.get(0);
				int pointer=1;
				while(true){
					if(2*pointer-1>list.size()-1){
						break;
					}
					
					int left=list.get(2*pointer-1);
					int right;
					if(2*pointer>list.size()-1){
						right=Integer.MAX_VALUE;
					}else{
						right=list.get(2*pointer);
					}
					 
				
					if(left<right){
						
						if(parent>left){
							
							list.set(2*pointer-1, parent);
							list.set(pointer-1, left);
							pointer=2*pointer;
						}else{
							break;
						}
					}else{
						if(parent>right){
							
							list.set(2*pointer, parent);
							list.set(pointer-1, right);
							pointer=2*pointer+1;
						}else{
							break;
						}
					}
				}
				
			}else{
				
			}
			
		}
		
		return result;
	}

}


