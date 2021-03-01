package app.entities;

import app.utils.constants.BAG_STATUSES;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(
    schema = "bag",
    name = "bag"
)
public class Bag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(
        nullable = false,
        columnDefinition = "default now()"
    )
    private Timestamp created_at;

    @Enumerated(EnumType.STRING)
    private BAG_STATUSES status;

    @Column(
        nullable = false
    )
    private long user_id;

    // RELATION
    @ManyToOne
    @JoinColumn(
        name = "user_id"
    )
    private User user;

    @OneToMany(mappedBy = "bag")
    private Set<Item> items;
}
