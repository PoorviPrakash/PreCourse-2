// Time Complexity : O(nlogn)
// Space Complexity : O(1)
class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        //Stopping condition
        if (r < l){
            return -1;
        }else{
            //Get the middle index
            int mid = (l+r)/2;
            //Check if element searched for is the middle element, return if true
            if(x==arr[mid])
                return mid;
            //Check if element searched for is the lesser than the middle element, the recursively call the binary search function from l to mid-1
            else if(x<arr[mid]){
                return binarySearch(arr,l,mid-1,x);
            }else{
                //Check if element searched for is the greater than the middle element, the recursively call the binary search function from mid+1 to r
                return binarySearch(arr,mid+1,r,x);
            }
        }
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
