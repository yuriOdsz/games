package com.projetodb.games.repositories;

import java.util.Optional;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetodb.games.models.GameModelo;

@Repository
public interface GameRepositorio extends JpaRepository<GameModelo, Id> {
	
	public Optional<GameModelo> findByTitle(String title);
	
}
