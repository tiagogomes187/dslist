package br.dev.tiagogomes.dslist.services;

import br.dev.tiagogomes.dslist.dto.GameMinDTO;
import br.dev.tiagogomes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll () {
		var result = gameRepository.findAll ();
		return result.stream ().map (x -> new GameMinDTO (x)).toList ();
	}
}
