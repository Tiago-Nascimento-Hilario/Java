package com.clinicamedica.api.endereco;

public record DadosEndereco(
    String logradouro, 
    String bairro, 
    String cep, 
    String cidade, 
    String uf, 
    String numero){
    
}
