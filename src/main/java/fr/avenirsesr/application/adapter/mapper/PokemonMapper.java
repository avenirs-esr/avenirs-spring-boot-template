package fr.avenirsesr.application.adapter.mapper;

import fr.avenirsesr.application.adapter.dto.PokemonDTO;
import fr.avenirsesr.domain.model.Pokemon;

public interface PokemonMapper {
    static PokemonDTO fromDomainToDto(Pokemon pokemon) {
        return new PokemonDTO(pokemon.getId(), pokemon.getName());
    }
}
