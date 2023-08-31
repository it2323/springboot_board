package com.testboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testboard.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
	
	Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);
	
}
