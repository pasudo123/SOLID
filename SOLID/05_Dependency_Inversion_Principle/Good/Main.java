package Good;

/**********************
 * 
 * 작성일 : 2017 11 06
 * - DIP 의 좋은 예 
 * 
 *********************/

interface Notifier {
    public void alertWeatherConditions(String weatherConditions);
}

class EmailClient implements Notifier {
	@Override
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "sunny");
            System.out.print("It is sunny");
    }
}

class MobileDevice implements Notifier {
	@Override
	public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions == "rainy")
            System.out.print("It is rainy");
    }
}

class WeatherTracker {
    String currentConditions;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    public void notify(Notifier notifier) {
        notifier.alertWeatherConditions(currentConditions);
    }
}
