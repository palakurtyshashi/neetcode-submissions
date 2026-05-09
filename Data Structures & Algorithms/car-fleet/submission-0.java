class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        double[][] pair= new double[position.length][2];

        for(int i = 0; i<position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> Double.compare(b[0],a[0]));

        double prevTime = 0;
        int fleet = 0;
        for(double[] row: pair){
            double curTime = (double)(target-row[0])/row[1];
            if(curTime>prevTime){
                fleet++;
                prevTime = curTime;
            }
        }
        return fleet;
    }
}
