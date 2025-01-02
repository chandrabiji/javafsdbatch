package arrays;

public class SingleDimStaticArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//normal for loop
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------");
		//forEach
		for(int k:arr) {
			System.out.println(k);
		}

	}

}
