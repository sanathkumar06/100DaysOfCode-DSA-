
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {10,2,1,4,3,3,5,7,8,9};
	    int n = 10;
	    int rep=0, miss=0;
	    int  temp[] = new int[10];
	    for(int i=0; i< n; i++){
	        if(temp[arr[i]-1] == 0) temp[arr[i]-1] = -1;
	        else if(temp[arr[i]-1] == -1) rep = arr[i];
	    }
	    
	    for(int i=0; i< n;i++){
	        if(temp[i] == 0)
	        {
	            miss = i+1;
	        }
	    }
	    
		System.out.println("Repeat: "+rep+" Missing: "+ miss);
	}
}
