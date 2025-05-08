package fr.avenirsesr.infrastructure.adapter.model;

import fr.avenirsesr.domain.enums.PokemonType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonEntity {

    @Id
    Long id;
    String name;
    PokemonType pokemonType;

}
