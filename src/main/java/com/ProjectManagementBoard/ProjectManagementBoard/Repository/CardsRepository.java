package com.ProjectManagementBoard.ProjectManagementBoard.Repository;

import com.ProjectManagementBoard.ProjectManagementBoard.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository extends JpaRepository<Card, Long> {
}
