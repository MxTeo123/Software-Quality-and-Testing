package Solid.D;
public class MobileClient implements Notifier{

    @Override
    public void alertWeatherConditions(String weatherConditions) {
        if(weatherConditions =="rainy");
        System.out.println("it is rainy");
    }
}