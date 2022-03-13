package com.jb.array.arraylist;

import java.util.List;
import java.nio.FloatBuffer;
import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		List<Float> al = new ArrayList<Float>();

		al.add((float) 10.0);
        al.add((float) 20.0);
        al.add((float) 30.0);
        al.add((float) 40.0);
  
        float[] arr = al.stream().collect(() -> FloatBuffer.allocate(al.size()), FloatBuffer::put, 
        		(left, right) -> {
        			throw new UnsupportedOperationException("only be called in parallel stream");}).array();

        for (float f : arr)
            System.out.print(f + " ");
        
 	}
	
}
