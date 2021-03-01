package algorithms;

import java.util.ArrayList;
import java.util.List;

public class SumOfValue {

	public static List<String> pairSumFastest(int[] data, int sum) {
	    ArrayList<String> results = new ArrayList<String>();

	    int low = 0;
	    int high = data.length - 1;
	    while (low < high) {
	        while (low < high && data[low] + data[high] < sum) {
	            low++;
	        }
	        while (low < high && data[low] + data[high] > sum) {
	            high--;
	        }
	        if (low < high &&  data[low] + data[high] == sum ) {
	            results.add( data[low] + " and " + data[high]);
	            low++;
	            high--;
	        }
	    }

	    return results;
	}
	
	public static void main(String[] args) {
		int data[] = {1, 3, 4, 5, 7, 9, 10, 13, 17, 19};
		int sum = 15;
		for(String s: pairSumFastest(data, sum)) {
			System.out.println(s);
		}
	}
}
