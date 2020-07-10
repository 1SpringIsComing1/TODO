package todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.entity.PriorityType;

@Repository
public interface PriorityTypeRepository extends JpaRepository<PriorityType, Long> {
}
