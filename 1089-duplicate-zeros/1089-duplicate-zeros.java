class Solution {
    public void duplicateZeros(int[] arr) {
        int possibleDuplicate = 0;
        int lastIndex = arr.length - 1;

        for(int i = 0 ; i <= lastIndex-possibleDuplicate; i++) {
            if(arr[i] == 0) {
                if(i == lastIndex - possibleDuplicate) {
                    arr[lastIndex--] = 0;
                    break;
                }
                possibleDuplicate++;
            }
        }

        int newLastIndex = lastIndex - possibleDuplicate;

        for(int i = newLastIndex; i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i + possibleDuplicate] = 0;
                possibleDuplicate--;
                arr[i + possibleDuplicate] = 0;
            }
            arr[i + possibleDuplicate] = arr[i];
        }
    }
}