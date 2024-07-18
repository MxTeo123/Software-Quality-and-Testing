package Solid.D;

public class EmailClient implements Notifier {
    @Override
    public void alertWeatherConditions(String weatherConditions) {
        if(weatherConditions.equals("sunny"))
        {
            System.out.println("it is sunny");
        }
    }
}