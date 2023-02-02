package com.clinicamedica.api.paciente;

import com.clinicamedica.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
    String nome,
    String email,
    String telefone,
    String cpf,
    DadosEndereco endereco
) {
    
}
