class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean f=false;
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    res.add(arr[j]);
                    f=true;
                    break;
                }
                 
                
            }
            if(!f){
                res.add(-1);
            }
            
        }
        return res;
    }
}