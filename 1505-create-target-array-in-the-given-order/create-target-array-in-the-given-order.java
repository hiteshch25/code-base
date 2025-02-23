class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target=new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=target.get(i);
        }
        return nums;
    }
}