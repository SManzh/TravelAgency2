package controller;

public interface TravelControllerAbstract {

    void getAllTours();

    void getTourByTourType(String tourType);

    void getTourByNutritionType(String nutritionType);

    void getTourByTransportingType(String transportingType);

    void getTourByTourDuration(int tourDuration);

    void getTourByCost(int tourCost);

}
