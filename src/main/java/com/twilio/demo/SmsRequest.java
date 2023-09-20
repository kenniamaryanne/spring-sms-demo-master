package com.twilio.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;

public class SmsRequest {

    @NotBlank
    private final int idAutovistoriado;

    @NotBlank
    private final String phoneNumber; // destination

    @NotBlank
    private final String message;

     
    

    public SmsRequest(@JsonProperty("phoneNumber") String phoneNumber,
                      @JsonProperty("message") String message,@JsonProperty("idAutovistoriado") int idAutovistoriado) {
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.idAutovistoriado = idAutovistoriado;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

     public int getIdAutovistoriado() {
        return idAutovistoriado;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber= ..." + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
