import java.util.Scanner;
public class BinarySearchRecursion {
    public static int search(int l,int r, int a[], int k){
        if(r>l){
            System.out.println("Not found");
            return 0; 
        } 
        int mid=(l+r)/2;
        if(a[mid]==k){
            System.out.print("found");
            return 0;
        }
        else if(k<a[mid]){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
        search(l, r, a, k);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        int k=sc.nextInt();
        int l=0, r=n-1;
        search(l,r, a, k);
        sc.close();
    }
}
