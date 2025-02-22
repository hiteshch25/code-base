class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> check=new ArrayList<>(candies.length);
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];  
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max)
                check.add(i,true);
            else
                check.add(i,false);
        }
        return check;
    }
}