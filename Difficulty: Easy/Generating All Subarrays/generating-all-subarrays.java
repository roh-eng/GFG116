class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer> res_ = new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                res_.add(arr[j]);
            
            res.add(new ArrayList<>(res_));
        }}
        return res;
        
    }
}