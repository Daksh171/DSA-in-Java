class mergeinterval{
    public static int[][] Merge(int intervals[][]){
        int arr[][]= new int [intervals.length][intervals[0].length];
        arr[0]=intervals[0];
        int index=0;
        for(int i=1;i<intervals.length;i++){
            if(arr[index][0]<=intervals[i][0]){
                arr[index][1]=Math.min(arr[index][1],intervals[i][1]);
            }
            if(arr[index][1]>=intervals[i][0]){
                arr[index][1]=Math.max(arr[index][1],intervals[i][1]);
            }else{
                index++;
                arr[index]=intervals[i];
            }
        }
        int ans[][]= new int[index+1][2];
        for(int i=0;i<=index;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
        // System.out.println(intervals.length);
        // System.out.println(intervals[0].length);
        print(Merge(intervals));
    }
}