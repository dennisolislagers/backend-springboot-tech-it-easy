package nl.novi.backendspringboottechiteasy.repositories;

import nl.novi.backendspringboottechiteasy.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository <Speaker, Long> {

        }
