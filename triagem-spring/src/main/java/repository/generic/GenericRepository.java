package repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import model.generic.AbstractEntity;

public interface GenericRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}