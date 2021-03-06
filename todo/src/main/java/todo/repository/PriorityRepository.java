package todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.entity.Priority;

@Repository
public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
