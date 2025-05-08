package fr.avenirsesr.application.adapter.controller;

import fr.avenirsesr.application.adapter.dto.PokemonDTO;
import fr.avenirsesr.application.adapter.mapper.PokemonMapper;
import fr.avenirsesr.domain.port.input.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/capturable")
    List<PokemonDTO> findPokemon() {
        return pokemonService
                .findAllLegendary()
                .stream()
                .map(PokemonMapper::fromDomainToDto)
                .toList();
    }
}
