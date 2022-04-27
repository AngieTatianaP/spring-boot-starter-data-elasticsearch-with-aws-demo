package com.rnd.aws.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@Document(indexName = "ath", type = "_doc", createIndex = false)
public class AthDocument {

    private Date fecha;
    @Id
    private String id;
    private String referenciaPago;
    private String nura;
    private String convenio;
    private Integer txValor;
    private String estado;
    private String bancoAutorizador;
    private Integer medioPago;
    private String bancoAdquiriente;
    private String transaccion;
}
