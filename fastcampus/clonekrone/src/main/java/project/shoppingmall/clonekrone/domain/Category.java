package project.shoppingmall.clonekrone.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String classification1;

    @Column(length = 50, nullable = false)
    private String classification2;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
