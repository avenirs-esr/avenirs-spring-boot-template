package fr.avenirsesr.domain.model;

import fr.avenirsesr.domain.enums.PokemonType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {
    private Long id;
    private String name;
    private PokemonType pokemonType;

    public Pokemon(Long id, String name, PokemonType pokemonType) {
        this.id = id;
        this.name = name;
        this.pokemonType = pokemonType;
    }
}
