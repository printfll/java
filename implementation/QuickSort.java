package Alg;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort q=new QuickSort();
		int []list={0,5,1,-2,56,12,-23,18,23,44,4};
		q.start(list);
		for(int i=0;i<list.length;i++){
			System.out.print(list[i]+", ");
		}
	}
	
	public void start(int []list){
		quickSort(list,0,list.length-1);
	}
	
	public void quickSort(int[] list, int first, int last){
		if(last>first){
			int pivot=partition(list,first,last);
			quickSort(list,first,pivot-1);
			quickSort(list,pivot+1,last);
			
		}
	}
	
	public int partition(int []list,int first, int last){
		int pivot=list[first];
		int low=first+1;
		int high=last;
		
		while(low<high){
			while(low<=high&&list[low]<=pivot){
				low++;
			}
			while(low<=high&&list[high]>=pivot){
				high--;
			}
			if(high>low){
				int temp=list[low];
				list[low]=list[high];
				list[high]=temp;
			}
		}
		
		while(high>first&&list[high]>=pivot){
			high--;
		}
		if(pivot>list[high]){
			list[first]=list[high];
			list[high]=pivot;
			return high;
		}else{
			return first;
		}
		
		
	}

}
