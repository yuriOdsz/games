package com.projetodb.games.models;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_games")
public class GameModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title", length = 255, nullable = false)
	private String title;

	@Column(name = "game_year", length = 4, nullable = false)
	private Integer gameYear;

	@Column(name = "genre", length = 255, nullable = false)
	private String genre;

	@Column(name = "plataforms", length = 255, nullable = false)
	private String plataforms;

	@Column(name = "score", length = 255, nullable = false)
	private Double score;

	@Column(name = "urlImg", length = 255, nullable = false)
	private String urlImg;

	@Column(name = "shortDescription", length = 255, nullable = false)
	private String shortDescription;

	@Column(name = "longDescription", length = 255, nullable = false)
	private String longDescription;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getGameYear() {
		return gameYear;
	}

	public void setGameYear(Integer gameYear) {
		this.gameYear = gameYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlataforms() {
		return plataforms;
	}

	public void setPlataforms(String plataforms) {
		this.plataforms = plataforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gameYear, genre, id, longDescription, plataforms, score, shortDescription, title, urlImg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameModelo other = (GameModelo) obj;
		return Objects.equals(gameYear, other.gameYear) && Objects.equals(genre, other.genre)
				&& Objects.equals(id, other.id) && Objects.equals(longDescription, other.longDescription)
				&& Objects.equals(plataforms, other.plataforms) && Objects.equals(score, other.score)
				&& Objects.equals(shortDescription, other.shortDescription) && Objects.equals(title, other.title)
				&& Objects.equals(urlImg, other.urlImg);
	}

}
