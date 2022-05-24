package repository;

import entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TourRepository extends JpaRepository {

    Optional<Tour> findOneById(Long id);

//    void getAllTours();
//
//    void getTourByTourType(String tourType);
//
//    void getTourByNutritionType(String nutritionType);
//
//    void getTourByTransportingType(String transportingType);
//
//    void getTourByTourDuration(int tourDuration);
//
//    void getTourByCost(int tourCost);
}
