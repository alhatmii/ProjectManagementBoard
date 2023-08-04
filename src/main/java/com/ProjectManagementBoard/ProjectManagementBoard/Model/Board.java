package com.ProjectManagementBoard.ProjectManagementBoard.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Map;
// To auto generate Getter & Setter for Properties
@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")// This is used to define the mapping between a Java entity class & database table
public class Board extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    private String title;
// to convert to the column use the hash map to convert
    @Convert(converter = CardConverter.class)
    private Map<Integer, String> columns = Map.of(
            1, "To do",
            2, "In progress",
            3, "Done"
    );

    @OneToMany(mappedBy = "board")
    private List<Cards> cards;

}
