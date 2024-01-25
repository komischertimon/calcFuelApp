public class Main {
    public static int raceDistance = 25;
    public static double laptime = 1.49;
    public static boolean pitstop = false;
    public static double consumption = 2.75;
    public static void main(String[] args) {
        CalcTime laptimeSec = new CalcTime(laptime);
        CalcRaceDistance drivenLaps = new CalcRaceDistance(raceDistance, laptimeSec.convert(), pitstop);
        CalcFuel fuelConsumption = new CalcFuel(drivenLaps.calculateDistance(), consumption);

        System.out.println("Dauer des Rennen: " + raceDistance);
        System.out.println("Rennrunden: "+ drivenLaps.calculateDistance());
        System.out.println("______");
        System.out.println("Rundenzeit in Sekunden: "+laptimeSec.convert());
        System.out.println("Tatsächliche Rundenanzahl: ");
        System.out.println("______");
        System.out.println("Benötigtes Kraftstoff: "+ fuelConsumption.calcualte());
    }
}