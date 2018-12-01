package project.prototype.pat.PatProtoType.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "BookContent", nullable = false)
    private BookContent bookContent;

    @ManyToMany
    @JoinTable(name = "question_passage", //매핑(연결) 테이블의 이름
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "passage_id"))
    private Set<Passage> passages;

    @Column(nullable = false)
    private int bookNumber;

    @Column(nullable = false)
    private String query;
}
