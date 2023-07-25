package lesson;

import java.util.Scanner;

public class LinearSearch {
	public static int searchElement(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int arrElement[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			arrElement[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println(key+" is found at index:"+searchElement(arrElement,key));
		
	}

}
