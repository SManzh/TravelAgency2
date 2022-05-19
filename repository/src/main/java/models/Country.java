package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Country {

    private String name;

    private List<Tour> countryTours;

    private List<Tour> clientTours;

}
