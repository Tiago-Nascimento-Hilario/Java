package com.clinicamedica.api.medico;

import com.clinicamedica.api.endereco.DadosEndereco;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(

    @NotBlank
    String nome,

    @NotBlank
    @Email
    String email,
    
    @Pattern(regexp = "\\d{4,6}")
    String crm, 

    @NotBlank
    Especialidade especialidade, 
    DadosEndereco endereco) {

}
