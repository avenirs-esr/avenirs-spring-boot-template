package fr.avenirsesr.infrastructure.adapter.repository;

import fr.avenirsesr.infrastructure.adapter.model.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonJpaRepository extends JpaRepository<PokemonEntity, Long> {

}