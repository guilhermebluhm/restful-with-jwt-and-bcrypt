package br.userauthjwt.authjwt.repository;

import br.userauthjwt.authjwt.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface studentRepository extends JpaRepository<student, Integer> {

    Optional<student> findByEmail(String email);

}
