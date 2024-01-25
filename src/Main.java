public class Main {
    public static int raceDistance = 25;
    public static double laptime = 1.49;
    public static boolean pitstop = false;
    public static double consumption = 2.75;
    public static void main(String[] args) {

        CalcTime laptimeSec = new CalcTime(laptime);
        CalcRaceDistance drivenLaps = new CalcRaceDistance(raceDistance, laptimeSec.convert(), pitstop);

        double[] distanceArray = drivenLaps.calculateDistance();

        CalcFuel fuelConsumption = new CalcFuel((int) distanceArray[1], consumption);

        System.out.println("Dauer des Rennen: " + raceDistance);
        System.out.println("Rennrunden: "+ distanceArray[1]);
        System.out.println("______");
        System.out.println("Rundenzeit in Sekunden: "+laptimeSec.convert());
        System.out.println("Tatsächliche Rundenanzahl: "+ distanceArray[0]);
        System.out.println("______");
        System.out.println("Benötigtes Kraftstoff: "+ fuelConsumption.calcualte());
    }
}