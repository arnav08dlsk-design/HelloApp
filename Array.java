public class Array{

public static void main(String[] args){

int[] numbers = new int[5];
String str = new String("Hello World");// String object created in heap memory , 2 objects are created one in heap memory and another in string constant pool
String str2 = "Hello World"; // String literal , object is created in string constant pool
for(int i=0;i<numbers.length;i++){

numbers[i]=i+1;

}

for (int val: numbers){

System.out.println(”the value is ”+ val);

}

}}