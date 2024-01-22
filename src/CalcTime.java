public class CalcTime {

    private double inputTime;

    public CalcTime (double inputTime){
        this.inputTime = inputTime;
    }

    public int convert(){
        int intTime = (int) inputTime;
        int min = intTime*60;
        double sec = (inputTime-intTime)*100;

        return (int)(min+sec);
    }


}
