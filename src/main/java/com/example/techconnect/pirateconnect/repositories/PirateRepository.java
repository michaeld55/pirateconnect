package com.example.techconnect.pirateconnect.repositories;
import com.example.techconnect.pirateconnect.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {


}

