package fr.avenirsesr.domain.port.output;

import fr.avenirsesr.domain.model.Pokemon;

import java.util.List;

public interface PokemonRepository {

    Pokemon save(Pokemon pokemon);

    List<Pokemon> findAllLegendary();
}