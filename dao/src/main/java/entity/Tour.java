package entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@SuppressWarnings("PMD")
@Entity
@Table(name = "tour")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tour_id", insertable = false, updatable = false)
    private long id;

    @Column(length = 30, name = "country")
    private String country;

    @Column(length = 20, name = "type")
    private String tourType;

    @Column(length = 20, name = "nutrition")
    private String nutritionType;

    @Column(length = 20, name = "transportation")
    private String transportingType;

    @Column(length = 3, name = "duration")
    private int tourDuration;

    @Column(length = 10, name = "cost")
    private double tourCost;

}
