package br.dev.tiagogomes.dslist.services;

import br.dev.tiagogomes.dslist.dto.GameDTO;
import br.dev.tiagogomes.dslist.dto.GameMinDTO;
import br.dev.tiagogomes.dslist.entities.Game;
import br.dev.tiagogomes.dslist.projections.GameMinProjection;
import br.dev.tiagogomes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional (readOnly = true)
	public GameDTO findById (Long id) {
		Game result = gameRepository.findById (id).get ();
		return new GameDTO (result);
	}
	
	@Transactional (readOnly = true)
	public List<GameMinDTO> findAll () {
		var result = gameRepository.findAll ();
		return result.stream ().map (x -> new GameMinDTO (x)).toList ();
	}
	
	@Transactional (readOnly = true)
	public List<GameMinDTO> findByGameList (Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList (listId);
		return games.stream ().map (GameMinDTO :: new).toList ();
	}
}
