package br.dev.tiagogomes.dslist.controllers;

import br.dev.tiagogomes.dslist.dto.GameListDTO;
import br.dev.tiagogomes.dslist.dto.GameMinDTO;
import br.dev.tiagogomes.dslist.services.GameListService;
import br.dev.tiagogomes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll () {
		return gameListService.findAll ();
	}
	
	@GetMapping (value = "/{listId}/games")
	public List<GameMinDTO> findGames (@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByGameList (listId);
		return result;
	}
}
