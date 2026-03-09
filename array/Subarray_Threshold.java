public class Subarray_Threshold {
    public  static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int count=0;
        if((sum/k)>=threshold){
                count++;
            }
        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            if((sum/k)>=threshold){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={11,13,17,23,29,31,7,5,2,3};
        int k=3;
        int threshold=5;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }   
}
