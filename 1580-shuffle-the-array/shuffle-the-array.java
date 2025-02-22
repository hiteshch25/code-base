class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] temp=new int[n*2];
        for(int i=0;i<n;i++){
            temp[i*2]=nums[i];
            temp[i*2+1]=nums[n+i];
        }
        return temp;
    }
}