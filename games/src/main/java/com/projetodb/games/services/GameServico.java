package com.projetodb.games.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projetodb.games.dto.GameRequest;
import com.projetodb.games.models.GameModelo;
import com.projetodb.games.repositories.GameRepositorio;

import jakarta.transaction.Transactional;

@Service
public class GameServico {
	
	final GameRepositorio gameRepositorio;
	
	public GameServico(GameRepositorio gameRepositorio){
		this.gameRepositorio = gameRepositorio;
	}
	
	public Optional<GameModelo> findByTitle(String title){
		return gameRepositorio.findByTitle(title);
	}
	
	
@Transactional
public String registerGame(GameRequest gameRequest) {
	
	Optional<GameModelo> contaModelOptional = findByTitle(gameRequest.title);
	
	System.out.println("contaModelOptional:");
	System.out.println(contaModelOptional.isEmpty());
	
	if(contaModelOptional.isEmpty()) {
		GameModelo game = new GameModelo();
		
		game.setGameYear(gameRequest.gameYear);
		game.setGenre(gameRequest.genre);
		game.setLongDescription(gameRequest.longDescription);
		game.setPlataforms(gameRequest.plataforms);
		game.setScore(gameRequest.score);
		game.setShortDescription(gameRequest.shortDescription);
		game.setTitle(gameRequest.title);
		game.setUrlImg(gameRequest.urlImg);
		
		gameRepositorio.save(game);
		
		return "CADASTRO REALIZADO COM SUCESSO!";
	}
	return null;
	
}
	

}
