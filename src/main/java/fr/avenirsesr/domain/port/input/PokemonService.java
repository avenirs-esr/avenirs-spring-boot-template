package fr.avenirsesr.domain.port.input;

import fr.avenirsesr.domain.model.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> findAllLegendary();
}
