
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	       int[] nums1={11, 9, 23, 87, 38, 22, 92, 10};
				  
				  
		   Sorting sort1 = new Sorting(nums1);
		   sort1.bubleSort();
		   sort1.printSortedData();
			

		   
		   System.out.println(" ");
		   System.out.println("-------------------------");
		   int[] nums2={25, 11, 45, 6, 87, 20, 78, 64};
			  
		   Sorting sort2 = new Sorting(nums2);
		   sort2.selectionSort();
		   sort2.printSortedData();
		   System.out.println(" ");
		   System.out.println("-------------------------");
		   
		   int[] nums3= {87, 11, 26, 35, 49, 85, 21, 46} ;
		   Sorting sort3 = new Sorting(nums3);
		   sort3.quicksort();
		   sort3.printSortedData();
		   System.out.println(" ");
		   System.out.println("-------------------------");
		
		
		   
	}

}
