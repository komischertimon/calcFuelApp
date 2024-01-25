public class CalcRaceDistance {
    private int raceDistance;
    private int lapTime;
    private boolean pitstop;

    public CalcRaceDistance (int raceDistance, int lapTime, boolean pitstop){
        this.raceDistance = raceDistance;
        this.lapTime = lapTime;
        this.pitstop = pitstop;

    }
    public int calculateDistance () {
        int raceDistanceSec = raceDistance * 60;
        double dbl_distanceLaps;
        int int_distanceLaps;
        double diff;

        if(pitstop == true) {
            dbl_distanceLaps = (raceDistanceSec - 44)/ lapTime;
        } else {
            dbl_distanceLaps = raceDistanceSec / lapTime;
        }

        int_distanceLaps = (int) (raceDistanceSec / lapTime);
        diff = dbl_distanceLaps - int_distanceLaps;

        if (diff >= 0.7) {
            return int_distanceLaps += 2;
        } else {
            return int_distanceLaps += 1;
        }
    }
}
