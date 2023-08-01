package com.ProjectManagementBoard.ProjectManagementBoard.Repository;

import com.ProjectManagementBoard.ProjectManagementBoard.Model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {
}
