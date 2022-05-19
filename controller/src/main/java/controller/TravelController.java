package controller;

import service.CountryService;

public class TravelController implements TravelControllerAbstract{

    private CountryService countryService = new CountryService();


    @Override
    public void getAllTours() {
        countryService.getAllTours();
    }

    @Override
    public void getTourByTourType(String tourType) {
        countryService.getTourByTourType(tourType);
    }

    @Override
    public void getTourByNutritionType(String nutritionType) {
        countryService.getTourByNutritionType(nutritionType);
    }

    @Override
    public void getTourByTransportingType(String transportingType) {
        countryService.getTourByTransportingType(transportingType);
    }

    @Override
    public void getTourByTourDuration(int tourDuration) {
        countryService.getTourByTourDuration(tourDuration);
    }

    @Override
    public void getTourByCost(int tourCost) {
        countryService.getTourByCost(tourCost);
    }
}
