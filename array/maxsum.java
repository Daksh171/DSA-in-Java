class  maxsum{
    public static int maxxx(int arr[]){
        int sum=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length-1;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){ 
                int end=j;
                int currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=arr[k];
                    if(currsum>sum){
                        sum=currsum;
                    }
                }
        }}
 
        return sum;
        
    }
    public static int maxx2(int arr[]){
        int perfix[]= new int[arr.length];
        perfix[0]=arr[0];
        int maxsum=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            perfix[i]=perfix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int st=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int currsum= st==0?perfix[end]:perfix[end]-perfix[st-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        return maxsum;
        }
        public static int kadanes(int arr[]){
            int maxsum=Integer.MIN_VALUE;
            int currsum=0;
            for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                if(currsum<0){
                    currsum=0;
                }
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
            if(maxsum==0 ){
                maxsum=Integer.MIN_VALUE;
                int cs=0;
                for(int i=0;i<arr.length;i++){
                        cs+=arr[i];
                        if(cs!=0 && maxsum<cs){
                            maxsum=cs;
                        }
                }
            }
            return maxsum;
        }
        public static int Trapping_water(int arr[]){
            int left[]=new int[arr.length];
            int right[]=new int[arr.length];
            left[0]=arr[0];
            right[arr.length-1]=arr[arr.length-1];
            for(int i=1;i<arr.length;i++){
                left[i]=Math.max(arr[i], left[i-1]);
            }
            for(int i=arr.length-2;i>=0;i--){
                right[i]=Math.max(arr[i],right[i+1]);
            }
            int trapwater=0;
            for(int i=0;i<arr.length;i++){
                int wl=Math.min(left[i], right[i]);
                trapwater+=(wl-arr[i]);
            }
            return trapwater;
        }
        public static int Most_water(int arr[]){
            int lp=0;
            int rp=arr.length-1;
            int area=1;
            int maxwater=0;
           while (lp<rp) {
            int width=rp-lp;
            area=width*Math.min(arr[lp],arr[rp]);
             maxwater=Math.max(maxwater, area);
                if(arr[rp]>arr[lp]){
                        lp++;   
                }else{
                    rp--;
                }
           }
              return maxwater;  
            }
            
        
        public static void main(String[] args) {
       int arr[]={1,8,6,2,5,4,8,3,7};
      System.out.println(Most_water(arr));
    }
}