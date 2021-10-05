
public class Main
{
	public static void main(String[] args) {
		int arr[] = {0,2,2,1,0,0,2,1};
		
		int a, i = 0, j=0, k=0;
		for(a=0; a< arr.length; a++)
		{
		    if(arr[a]==0) i++;
		    else if(arr[a] == 1) j++;
		    else k++;
		}
		for(a = 0; a < arr.length; a++){
	        if(i > 0) {
	            i--;
	            arr[a] = 0;
	        }
	        else if(j > 0) {
	            j--;
	            arr[a] = 1;
	        }
	        else if(k > 0) {
	            k--;
	            arr[a] = 2;
	        }
		}
		for(a=0; a < arr.length; a++){
		    System.out.println(arr[a]);
		}
	}
}
