package common.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public abstract class Main {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int first = Integer.parseInt(bf.readLine());
//		int second = Integer.parseInt(bf.readLine());
//		int sum = 0;
//		int result = 0;
//		int temp = 0;
//		int[] a = new int[second];
//
//		for (int i = 0; i < a.length; i++) {
//			a[i] = Integer.parseInt(bf.readLine());
//		}
//		System.out.println("first："+first);
//		System.out.println("second："+second);
//		
//		for(int j=0;j<a.length;j++) {
//			a[j] = a[j]+temp;
//			if(a[j]<=first) {
//				sum++;
//			}else {
//				temp = a[j]%first;
//				sum += a[j]/first;
//			}
//			if(j==(a.length-1)&&(temp>0)) {
//				sum+=1;
//			}
//			
//		}
//		result = sum;
//		System.out.println(result);
//	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = bf.readLine();
			System.out.println();
		} finally {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}	
	public static void length(String input) {
		String[] sub = input.split("");
		int lenth = 0;
		int lenth2 = 0;
	}
	abstract void method();
	
////		int first = Integer.parseInt(bf.readLine());
//
////		int[] a = new int[first];
//		for (int i = 0; i < a.length; i++) {
//			a[i] = Integer.parseInt(bf.readLine());
//		}
//
//		int second = Integer.parseInt(bf.readLine());



	



}
//public static int together(int[] a, int second) {
//	if (a == null || a.length < 2) {
//		return a.length;
//	}
//	int arr[] = new int[2];
//	int result = 0;
//	Map<Integer, Integer> map = new HashMap<>();
//
//	for (int i = 0; i < a.length; i++) {
//
//		if (map.containsKey(second - a[i])) {
//			result++;
//		}
//		map.put(i, a[i]);
//		System.out.println(map);
//	}
//	return result;
//}
//public static int sum(int[] a, int second) {
//	if (a == null || a.length < 2) {
//		return a.length;
//	}
//	int result = 0;
//	int size = a.length;
//	int arr[] = new int[size];
//	for (int i = 0; i < size; i++) {
//		arr[a[i] % size] = 1;
//	}
//	for (int i = 0; i < size; i++) {
//		int temp = second - a[i];
//		if ((temp > a[i]) && (arr[a[i] % size] == 1)) {
//			result++;
//		}
//	}
//	return result;
//}