package com.clinicamedica.api.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarCadastroMedico(
    @NotNull
    Long id, 
    String nome){
    
}
