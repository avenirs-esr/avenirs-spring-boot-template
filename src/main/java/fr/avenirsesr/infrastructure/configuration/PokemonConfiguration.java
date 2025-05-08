package fr.avenirsesr.infrastructure.configuration;

import fr.avenirsesr.domain.port.input.PokemonService;
import fr.avenirsesr.domain.port.output.PokemonRepository;
import fr.avenirsesr.domain.service.PokemonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokemonConfiguration {

    @Bean
    PokemonService pokemonService(PokemonRepository pokemonRepository) {
        return new PokemonServiceImpl(pokemonRepository);
    }

}