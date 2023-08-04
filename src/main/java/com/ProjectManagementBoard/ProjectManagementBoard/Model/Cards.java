package com.ProjectManagementBoard.ProjectManagementBoard.Model;

import jakarta.persistence.*;
import lombok.*;
// To auto generate Getter & Setter for Properties
@Getter
@Setter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "card")

public class Cards extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;

    private String title;

    private String description;

    Integer section;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

}
