class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int first = findFirst(x, arr);
        int last = findLast(x, arr);
        
        if (first == -1) {
            res.add(-1);
            return res;
        }
        
        res.add(first);
        res.add(last);
        return res;
    }
    
    private int findFirst(int x, int arr[]) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                first = mid;       
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    
    private int findLast(int x, int arr[]) {
        int low = 0, high = arr.length - 1;
        int last = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                last = mid;        
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}