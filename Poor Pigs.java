class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int period=minutesToTest/minutesToDie+1;
        return (int)Math.ceil(Math.log(buckets)/Math.log(period));
    }
}
