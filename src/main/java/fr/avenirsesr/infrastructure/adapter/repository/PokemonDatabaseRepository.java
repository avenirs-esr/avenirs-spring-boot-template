package fr.avenirsesr.infrastructure.adapter.repository;

import fr.avenirsesr.domain.model.Pokemon;
import fr.avenirsesr.domain.port.output.PokemonRepository;
import fr.avenirsesr.infrastructure.adapter.model.PokemonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PokemonDatabaseRepository implements PokemonRepository {

    private final PokemonJpaRepository jpaRepository;

    @Override
    public Pokemon save(Pokemon pokemon) {
        PokemonEntity entity = modelToEntity(pokemon);
        return entityToModel(
                jpaRepository.save(entity)
        );
    }

    @Override
    public List<Pokemon> findAllLegendary() {
        return null;
    }

    private PokemonEntity modelToEntity(Pokemon pokemon) {
        return new PokemonEntity(
            pokemon.getId(),
            pokemon.getName(),
            pokemon.getPokemonType()
        );
    }

    private Pokemon entityToModel(PokemonEntity entity) {
        return new Pokemon(
            entity.getId(),
            entity.getName(),
            entity.getPokemonType()
        );
    }
}
