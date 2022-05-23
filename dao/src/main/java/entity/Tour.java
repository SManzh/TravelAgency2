package entity;

import lombok.*;

import javax.persistence.*;


@Table
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
