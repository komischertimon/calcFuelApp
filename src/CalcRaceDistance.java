public class CalcRaceDistance {
    private int raceDistance;
    private int lapTime;
    private boolean pitstop;

    public CalcRaceDistance (int raceDistance, int lapTime, boolean pitstop){
        this.raceDistance = raceDistance;
        this.lapTime = lapTime;
        this.pitstop = pitstop;

    }
    public double[] calculateDistance () {
        int raceDistanceSec = raceDistance * 60;
        double dbl_distanceLaps;
        int int_distanceLaps;
        double diff;
        double[] resultArray = new double[2];

        if(pitstop == true) {
            dbl_distanceLaps = (double) (raceDistanceSec - 44)/ lapTime;
        } else {
            dbl_distanceLaps = (double) raceDistanceSec / lapTime;
        }

        int_distanceLaps = (int) (raceDistanceSec / lapTime);
        diff = dbl_distanceLaps - int_distanceLaps;

        resultArray[0] = dbl_distanceLaps;


        if (diff >= 0.7) {
            resultArray[1] = int_distanceLaps += 2;
            return resultArray;
        } else {
            resultArray[1] = int_distanceLaps += 1;
            return resultArray;
        }
    }
}
