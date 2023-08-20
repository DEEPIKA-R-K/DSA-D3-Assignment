import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int n=arr.length;
	    int count=0,maincount=0;
	    for(int i=0;i<n;i++){
	        int m=arr[i];
	    for(int j=1;j<=m;j++){
	        if(arr[i]%j==0)
	        count++;
	    }
	    if(count<=2){
	    maincount++;
	    }
	    count=0;
	    }
		System.out.println(maincount);
	}
}
