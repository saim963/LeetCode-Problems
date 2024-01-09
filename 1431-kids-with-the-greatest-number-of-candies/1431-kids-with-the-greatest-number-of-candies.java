class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //need to create a Boolean[] responseArr;
        List<Boolean> response = new ArrayList<>();
        int greater = 0;
        Boolean isGreatest ;
        for(int i=0; i<candies.length; i++){
            candies[i] += extraCandies;
            isGreatest = true;
            for(int j=0; j<candies.length; j++){
                if(candies[i]<candies[j]){
                    isGreatest = false;
                    break;
                }
            }
            response.add(isGreatest);
            candies[i] -= extraCandies;
        }
        return response;
    }
}