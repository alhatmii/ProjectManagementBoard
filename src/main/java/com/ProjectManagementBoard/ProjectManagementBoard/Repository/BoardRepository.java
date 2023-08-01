package com.ProjectManagementBoard.ProjectManagementBoard.Repository;

import com.ProjectManagementBoard.ProjectManagementBoard.Model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
