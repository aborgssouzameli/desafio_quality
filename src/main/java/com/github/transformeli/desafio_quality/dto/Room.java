package com.github.transformeli.desafio_quality.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @NotBlank(message = "O nome da propriedade não pode estar vazio.")
    @Pattern(regexp = "\"([A-Z]|[0-9])[\\\\s|[0-9]|A-Z|a-z|ñ|ó|í|á|é|ú|Á|Ó|É|Í|Ú]*$\"", message = "O nome do cômodo deve comecar com uma letra maíuscula.")
    @Size(max= 30, message = "O comprimento do nome não pode exceder trinta caracteres.")
    private String name;
    @NotBlank(message = "O comprimento do cômodo não pode estar vazio.")
    @DecimalMax(value = "33.0", message = "O comprimento máximo permitido por cômodo é de 33 metros.")
    private Double length;
    @NotBlank(message = "A largura do cômodo não pode estar vazio.")
    @DecimalMax(value = "25.0", message = "A largura máxima permitida por cômodo é de 25 metros.")
    private Double width;
}
