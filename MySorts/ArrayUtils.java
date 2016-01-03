// Matthew So
// APCS1 pd 10
// HW27 -- Objectifying Your Array Tools
// 2015-11-09

//class
public class ArrayUtils{
    //To string float version
    public static String toString(float[] Aray){
	String ret = "";
	for (float i : Aray){
	    ret += ""+ i + " ";
	}
	return ret;}
    //To String int version
    public static String toString(int[] Aray){
	String ret = "";
	for (int i : Aray){
	    ret += ""+ i + " ";
	}
	return ret;}
    //To String String version
     public static String toString(String[] Aray){
	String ret = "";
	for (String i : Aray){
	    ret += ""+ i + " ";
	}
	return ret;}
    //To String populate with floats
    public static String Populate(float[] Aray, int min, int max){
	for (int i = 0 ; i < Aray.length; i++){
	    Aray[i]= ((int)(Math.random() * (max - min)) + min);
	      }
	return toString(Aray);}
    //to String populate with ints
    public static String Populate(int[] Aray, int min, int max){
	for (int i = 0 ; i < Aray.length; i++){
	    Aray[i]= ((int)(Math.random() * (max - min + 1)) + min);
	      }
	return toString(Aray);}
    //linSearch for ints
     public static int linSearch(int[] a, int target){
	int x = a.length;
	for (int i = 0; i < x; i++){
	    if (a[i] == target){
		return i;}}
	return -1;
	
    }
    //linSearch for Strings
    public static int linSearch(String[] a, String target){
	int x = a.length;
	for (int i = 0; i < x; i++){
	    if (a[i] == target){
		return i;}}
	return -1;
    }
    //Freq for ints
    public static int freq(int[] a, int target){
	 int ret = 0;
	for ( int i : a){
	    if (i == target){
		ret += 1;}
	}
	return ret;}
    //fre for strings
    public static int freq(String[] a, String target){
	int ret = 0;
	for ( String i : a){
	    if (i == target){
		ret += 1;}
	}
	return ret;}
    

    //tests
    public static void main(String[] args){
	int[] arr;
	arr = new int[3];
	arr[1]= 9;
	System.out.println(Populate(arr, 8 , 20));
	int[] a = {1,2,3,4,5,6,7,3,4};
	String[] b= {"hi","hello","how do you do"};
	System.out.println(freq(a,8));
	System.out.println(freq(b,"hi"));
	System.out.println(linSearch(b,"hello"));
	System.out.println(linSearch(a,3));
	System.out.println(freq(a,3));
	System.out.println(toString(a));
	System.out.println(toString(b));

    }}

