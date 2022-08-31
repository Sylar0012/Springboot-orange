package site.metacoding.orange.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDao extends JpaRepository<Board, Integer>{
	
	

}
