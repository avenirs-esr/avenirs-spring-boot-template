package fr.avenirsesr.domain.service;

import fr.avenirsesr.domain.model.Pokemon;
import fr.avenirsesr.domain.port.input.PokemonService;
import fr.avenirsesr.domain.port.output.PokemonRepository;

import java.util.List;

public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonServiceImpl(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public List<Pokemon> findAllLegendary() {
        return pokemonRepository.findAllLegendary();
    }
}