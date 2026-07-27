class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            if(i==j){
            res.add(arr[i]);
                
            }else{
            
            res.add(arr[j]);
            res.add(arr[i]);
            
            }
            i++;
            j--;
            
        }
        return res;
    }
}
