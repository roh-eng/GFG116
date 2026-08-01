class Solution {
    public int countOccurence(int[] arr, int k) {
        // code here
        int n=arr.length;
        int f=n/k;
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(int value:res.values()){
            if(value>f){
                count++;
            }
        }
        return count;
    }
}