class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        ArrayList<Integer> res= new ArrayList<>();
        for(int num:a) res.add(num);
        for(int num:b) res.add(num);
        Collections.sort(res);
        int mid=res.size()/2;
        if(res.size()%2==0){
            return ((res.get(mid)+res.get(mid-1))/2.0);
        }else{
            return (res.get(mid));
        }
    }
}