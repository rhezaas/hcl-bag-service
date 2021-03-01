package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(
    schema = "bag",
    name = "address"
)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String title;

    @Column(
        nullable = false,
        columnDefinition = "text"
    )
    private String address;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String subdistrict;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String city;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String province;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String zipcode;

    @Column(
        nullable = false
    )
    private long user_id;

    @ManyToOne
    @JoinColumn(
        name = "user_id"
    )
    private User user;
}
