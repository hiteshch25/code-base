class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0,g=0;
        for(int i=0;i<accounts.length;i++){
            s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
                if(s>g)
                    g=s;
            }           
        }
        return g;
    }
}