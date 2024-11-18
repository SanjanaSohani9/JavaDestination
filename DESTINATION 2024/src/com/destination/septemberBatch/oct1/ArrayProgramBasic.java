package com.destination.septemberBatch.oct1;
import java.util.*;
public class ArrayProgramBasic {

	public static void main(String[] args) {
		int arr [] = {21,35,35,47,47,56};
		HashSet<Integer> hs=new HashSet<>();
		for(int i:arr)
		{
			if(hs.add(i))
			{
				System.out.print(i+" ");
			}
		}

	}

}
