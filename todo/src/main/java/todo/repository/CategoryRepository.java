package todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
