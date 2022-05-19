package service;

import repository.CountryRepository;

public class CountryService implements CountryServiceAbstract{


    private CountryRepository countryRepository = new CountryRepository();


    @Override
    public void getAllTours() {
        countryRepository.getAllTours();
    }

    @Override
    public void getTourByTourType(String tourType) {
        countryRepository.getTourByTourType(tourType);
    }

    @Override
    public void getTourByNutritionType(String nutritionType) {
        countryRepository.getTourByNutritionType(nutritionType);
    }

    @Override
    public void getTourByTransportingType(String transportingType) {
        countryRepository.getTourByTransportingType(transportingType);
    }

    @Override
    public void getTourByTourDuration(int tourDuration) {
        countryRepository.getTourByTourDuration(tourDuration);
    }

    @Override
    public void getTourByCost(int tourCost) {
        countryRepository.getTourByCost(tourCost);
    }
}
