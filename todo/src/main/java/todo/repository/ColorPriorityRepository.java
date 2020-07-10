package todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.entity.ColorPriority;

@Repository
public interface ColorPriorityRepository extends JpaRepository<ColorPriority, Long> {
}
