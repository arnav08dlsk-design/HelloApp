import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Enter the number of elements in the array:"); 
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();     
        }
        System.out.println("The elements of the array are:");
     for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    } 
}