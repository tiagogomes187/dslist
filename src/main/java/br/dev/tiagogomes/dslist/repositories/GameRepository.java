package br.dev.tiagogomes.dslist.repositories;

import br.dev.tiagogomes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
