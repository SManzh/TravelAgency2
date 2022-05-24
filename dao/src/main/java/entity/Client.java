package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 30, name = "name")
    private String name;

    @Column(length = 30, name = "surname")
    private String surname;

    @Column(length = 30, name = "surname")
    private int phone;

    //------------------------------------------------------------------------------------------------------------------

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;

}
