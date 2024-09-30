import java.util.*;
public class BinarySearch {
    public static int binSearch(int n, int[] arr, int k){
        int start = 0;
        int end = n-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] > k){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int index = binSearch(n,arr,k);
        sc.close();
        if(index != -1){
            System.out.println("The element found at "+index);
        }
        else{
            System.out.println("The element does not found");
        }
    }
}