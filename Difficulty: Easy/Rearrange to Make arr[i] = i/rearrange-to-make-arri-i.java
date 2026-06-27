class Solution {
    public static void modifyArray(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr){
            if(x!=-1){
                set.add(x);
            }
        }
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(set.contains(i)){
                arr[i]=i;
            }else{
                arr[i]=-1;
            }
        }
        
    }
}