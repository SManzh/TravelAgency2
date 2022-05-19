package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Tour {

    private int id;

    private String tourType;

    private String nutritionType;

    private String transportingType;

    private int tourDuration;

    private int tourCost;

}
