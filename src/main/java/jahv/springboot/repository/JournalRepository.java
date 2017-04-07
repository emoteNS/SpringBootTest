package jahv.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import jahv.springboot.domain.Journal;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {
}
