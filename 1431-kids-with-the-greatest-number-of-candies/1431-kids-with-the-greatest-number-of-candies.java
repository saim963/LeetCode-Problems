class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> response = new ArrayList<>();
        int maxCandies = candies[0];
        for(int i=0; i<candies.length; i++){
            if(candies[i]>maxCandies){
                maxCandies = candies[i];
            }
        }
        for(int j=0; j<candies.length; j++){
            response.add(candies[j]+extraCandies>=maxCandies);
        }
        return response;
    }
}