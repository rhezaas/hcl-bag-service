package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
        nullable = false
    )
    private String firstname;

    @Column(
        nullable = false
    )
    private String lastname;

    @Column(
        nullable = false
    )
    private String phone;
}
