package pl.joannabrania.weathermap.views;

public class MainView {

    public void showWelcomeText(){
        System.out.println("Witaj w WeatherMap!");
    }

    public void showCityRequestText(){

        System.out.print("Podaj miasto: ");
    }

    public void showCountryRequestText(){

        System.out.print("Podaj kraj: ");
    }

    public void showWeather(String weatherText){

        System.out.println(weatherText);
    }

    public void showMenu() {
        System.out.println("1. Pogoda na dzisiaj.");
        System.out.println("2. Pogoda na kolejne 5 dni.");
        System.out.println("3. Wyjście z aplikacji");
        System.out.println("Twój wybór: ");
    }
}
