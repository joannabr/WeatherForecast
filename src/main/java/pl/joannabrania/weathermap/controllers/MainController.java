package pl.joannabrania.weathermap.controllers;

import pl.joannabrania.weathermap.models.DownloadWeatherService;
import pl.joannabrania.weathermap.models.WeatherParameters;
import pl.joannabrania.weathermap.views.MainView;

import java.util.Scanner;

public class MainController {

    private MainView mainView;
    private Scanner scanner;
    private DownloadWeatherService downloadWeatherService = DownloadWeatherService.getInstance();

    public MainController(){
        mainView = new MainView();
        scanner = new Scanner(System.in);
    }

    public void start() {
        mainView.showWelcomeText();
        createMainLoop();
    }

    private void createMainLoop() {
        String userAnswerCity;
        String userAnswerCountry;
        int choice;

        do{
        mainView.showCityRequestText();
        userAnswerCity = scanner.nextLine();

        mainView.showCountryRequestText();
        userAnswerCountry = scanner.nextLine();

        mainView.showMenu();
        choice = Integer.parseInt(scanner.nextLine());

        if(choice == 1 ){
            String text = downloadWeatherService.getWeatherOneDay(userAnswerCity,userAnswerCountry);
            mainView.showWeather(text);
        }

        else if(choice == 2 ) {
            String text = "";
            for (WeatherParameters weatherParameters : downloadWeatherService.getWeatherFiveDays(userAnswerCity, userAnswerCountry)) {
                text += weatherParameters.getTemp() + " / " + weatherParameters.getLocalDateTime() + "\n";
            }
            mainView.showWeather(text);
        }
        else if(choice == 3){
                System.exit(0);
            }
        }while (choice != 3);
    }
}
