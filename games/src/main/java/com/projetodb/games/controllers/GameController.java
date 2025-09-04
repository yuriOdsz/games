package com.projetodb.games.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projetodb.games.dto.GameRequest;
import com.projetodb.games.services.GameServico;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class GameController {
	
	final GameServico gameServico;
	
	public GameController(GameServico gameServico) {
		this.gameServico = gameServico;
	}
	
	@PutMapping("/register")
	public ResponseEntity<Object> register (@RequestBody GameRequest requisicao){
		String mensagemRetorno = gameServico.registerGame(requisicao);
		
		HttpStatus status = (mensagemRetorno.equals("CADASTRO REALIZADO COM SUCESSO!"))
				? HttpStatus.OK : HttpStatus.NOT_ACCEPTABLE;
		
		return ResponseEntity.status(status).body(mensagemRetorno);
	}

}
