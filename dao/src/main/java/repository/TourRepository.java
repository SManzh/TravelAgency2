package repository;

import entity.Tour;
import entity.Country;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TourRepository implements CountryRepositoryAbstract{

    private List<Tour> tourList;

    private List<Tour> ClientTourList;

    private Country country;

    public TourRepository() {
        tourList = new ArrayList<>(Arrays.asList(
                new Tour(1, "relax", "all inclusive", "train", 3, 340),
                new Tour(2, "excursion", "2", "flight", 6, 810),
                new Tour(3, "shopping", "all inclusive", "flight", 7, 520),
                new Tour(4, "relax", "1", "bus", 6, 490),
                new Tour(5, "shopping", "3", "train", 3, 210),
                new Tour(6, "healing", "1", "flight", 11, 1570),
                new Tour(7, "healing", "1", "bus", 9, 1100)
        ));
        country.setCountryTours(tourList);

    }


    @Override
    public void getAllTours() {

    }

    @Override
    public void getTourByTourType(String tourType) {

    }

    @Override
    public void getTourByNutritionType(String nutritionType) {

    }

    @Override
    public void getTourByTransportingType(String transportingType) {

    }

    @Override
    public void getTourByTourDuration(int tourDuration) {

    }

    @Override
    public void getTourByCost(int tourCost) {

    }
}
