import java.util.*;
public class LinearSearch{
    public static int search(int n, int a[], int k){
        for(int i=0; i<n; i++){
            if(a[i]==k){
                System.out.print("Yes");
                return 0;
            }
        }
        System.out.print("No");
        return 0;
    } 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        search(n, a, k);
        sc.close();
    }
}