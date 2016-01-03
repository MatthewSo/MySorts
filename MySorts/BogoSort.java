//Matthew So
//APCS pd 10
//2016-1-4


import java.util.*;
public class BogoSort{
    public static ArrayList<Integer> bogoSort(ArrayList<Integer> data){
	    while ( ! data.isSorted() ) {
		data.shuffle();
	    }
	    return data;}}
	
