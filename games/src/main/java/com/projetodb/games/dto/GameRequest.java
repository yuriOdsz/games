package com.projetodb.games.dto;

import jakarta.validation.constraints.*;

public class GameRequest {
    
    @NotNull
    @Min(1970)
    @Max(2100)
    public Integer gameYear;

    @NotBlank
    @Size(max = 30)
    public String genre;

    @NotBlank
    @Size(max = 255) 
    public String longDescription;

    @NotBlank
    @Size(max = 100)
    public String plataforms;

    @NotBlank
    @Size(max = 100)
    public String shortDescription;

    @NotBlank
    @Size(max = 50)
    public String title;

    @NotBlank
    @Size(max = 255)
    public String urlImg;

    @DecimalMin(value = "0.0")
    @DecimalMax(value = "10.0")
    public Double score;

    
}
