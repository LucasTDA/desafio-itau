package desafio.itau.springboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequest {

    @NotNull
    private double valor;

    @NotNull
    private OffsetDateTime dataHora;



    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora(){
        return dataHora;
    }


}
