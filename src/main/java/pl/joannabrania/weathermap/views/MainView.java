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

    public void makeNewLine(){
        System.out.println();
    }

    public void showWeather(String weatherText){
        System.out.println(weatherText);
    }

}
