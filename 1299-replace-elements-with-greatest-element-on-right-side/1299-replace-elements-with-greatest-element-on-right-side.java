class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) arr[0] = -1;

        int n = arr.length - 1;
        int max = arr[n];
        arr[n] = -1;

        for(int i = n-1; i >= 0; i--) {
            if(arr[i] > max) {
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}