package app.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(
    schema = "bag",
    name = "user"
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(
        nullable = false
    )
    private long account_id;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String firstname;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String lastname;

    @Column(
        nullable = false,
        columnDefinition = "varchar(15)"
    )
    private String phone;

    // RELATION
    @OneToMany(mappedBy = "user")
    private Set<Bag> bags;

    @OneToMany(mappedBy = "user")
    private Set<Address> addresses;
}
