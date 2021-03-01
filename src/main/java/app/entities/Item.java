package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(
    schema = "bag",
    name = "item"
)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String brand;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String product;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String size;

    @Column(
        nullable = false,
        columnDefinition = "varchar(10)"
    )
    private String color;

    @Column(
        nullable = false,
        columnDefinition = "int(5)"
    )
    private int quantity;

    @Id
    private long bag_id;

    @Column(
        nullable = true
    )
    private long shipment_id;

    // RELATION
    @ManyToOne
    @JoinColumn(
        name = "bag_id"
    )
    private Bag bag;
}
