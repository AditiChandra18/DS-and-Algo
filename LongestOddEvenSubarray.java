
public class Main
{
    public static void LongestEOS(int[] arr, int n){
        int c=1;
        int c1=0;
        for(int i=1;i<n;i++){
            if(arr[i]-arr[i-1] == 1){
                c++;
                if(c>c1) c1=c;
            }
            else{
                c=1;
            }
        }
        
        System.out.print(c1);
    }
    
	public static void main(String[] args) {
		int arr[]={2,3,7,8,9,0};
		int n=arr.length;
		
		LongestEOS(arr,n);
	}
}
