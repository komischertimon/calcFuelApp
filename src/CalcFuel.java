import static java.lang.Math.ceil;

public class CalcFuel {

    public int raceDistance;
    public double consumption;

    public CalcFuel(int raceDistance, double consumption){
        this.raceDistance = raceDistance;
        this.consumption = consumption;
    }

    public int calcualte(){
        return (int)Math.ceil(raceDistance*consumption+(Math.round(consumption*0.4)));
    }

}
