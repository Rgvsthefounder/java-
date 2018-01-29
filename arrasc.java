
public class arrasc {

	public static void main(String args[]){
        int arr[]={1,0,1,1,0,0,1,0};
     int size=arr.length;
     
        for(int i=1;i<size;i++)
        {
           int ele=arr[i];
            int j=i-1;
            
            
            while(j>=0 && arr[j]>ele)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=ele;
        }
        
        for(int j=0;j<size;j++)
System.out.print(" "+arr[j]);
}
}