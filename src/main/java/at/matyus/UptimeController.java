package at.matyus;

public class UptimeController {

    public String calculateUptime(){
        double minutesOfMonth = 60*24*30;
        double definedUptimeInPercent = 99.95/100;
        double uptimeInMinutes = minutesOfMonth * definedUptimeInPercent;
        return String.format("%.2f", uptimeInMinutes);
    }

}
