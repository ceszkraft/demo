package com.example.demo.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "tb_mapfre")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MAPFREModel {

    // @Column(name = "num_convenio", length = 7, nullable = false)
    private Integer numConvenio; // int(9)

    // @Column(name = "num_carteira", length = 255, nullable = false) //carteira 17
    private short numCarteira;

    // @Column(name = "num_variacao_carteira", length = 255, nullable = false) //
    // Valor Numérico maior que zeros
    private short numVariacaoCarteira;

    // @Column(name = "num_modalidade", length = 1, nullable = false)
    /*
     * 1 = CARTEIRA-SIMPLES
     * 4 = VINCULADA
     * 6 = DESCONTADA
     * 8 = VENDOR
     */
    private short numModalidade;

    // @Column(name = "dat_emissao_titulo", length = 255, nullable = false)
    /*
     * - Não pode ser anterior a 365 dias
     * - Não pode ser maior que a data atual
     * - Não pode ser maior que a “DATA DE VENCIMENTO DO TÍTULO”
     */
    private LocalDateTime datEmissaoTitulo; // DateTime documentação

    // @Column(name = "dat_vencimento_titulo", length = 255, nullable = false)
    /*
     * ‘AAAA-MM-DDTHH:mm:ss’
     * - Deve estar entre a DATA MÍNIMA e a DATA MÁXIMA permitida para
     * a modalidade informada
     */
    private LocalDate datVencimentoTitulo;

    // @Column(name = "val_original_titulo")
    // Tem que ser maior que o “VALOR DO DESCONTO DO TÍTULO” mais o
    // “VALOR DO ABATIMENTO DO TÍTULO” informados
    private BigDecimal valOriginalTitulo; // Decimal(17,2)

    // @Column(name = "ctp_desconto_titulo", length = 1, nullable = false)
    /*
     * 0 = SEM-DESCONTO
     * 1 = DESCONTO-VALOR
     * 2 = DESCONTO-PERCENTUAL
     * 3 = POR-DIA-ANTECIPACAO
     */
    private short ctpDescontoTitulo;

    // @Column(name = "dat_desconto_titulo", length = 255, nullable = false) //leng
    // 19
    // Campo Condicional
    private LocalDate datDescontoTitulo;

    // @Column(name = "pct_desconto_titulo", length = 255, nullable = false)
    // //Decimal(5,2)
    // campo condicional
    private BigDecimal pctDescontoTitulo;

    // @Column(name = "val_desconto_titulo", length = 255, nullable = false) //true?
    // campo condicional
    private BigDecimal valDescontoTitulo;

    // @Column(name = "val_abatimento_titulo", length = 255, nullable = true)
    private BigDecimal valAbatimentoTitulo;

    // @Column(name = "num_convenio", length = 255, nullable = true)
    private short numDiasProtesto;

    // @Column(name = "num_juros_mora", length = 1, nullable = false)
    /*
     * 0 = JUROS-DISPENSAR
     * 2 = JUROS-VALOR
     * 3 = JUROS-FACP
     */
    private short numJurosMora;

    // @Column(name = "pct_juros_mora", length = 255, nullable = false)//
    // Decimal(5,2)
    // campo condicional
    private BigDecimal pctJurosMora;

    // @Column(name = "val_juros_mora", length = 255, nullable = false)
    // //Decimal(17,2)
    // campo condicional
    private BigDecimal valJurosMora;

    // @Column(name = "ctp_multa", length = 1, nullable = false)
    /*
     * 0 = MULTA-DISPENSAR
     * 1 = MULTA-PERCENTUAL
     * 2 = MULTA-VALOR
     */
    private short ctpMulta;

    // @Column(name = "dat_multa_titulo", length = 10, nullable = false)
    // campo condicional
    // AAAA-MM-DDTHH:mm:ss
    private String datMultaTitulo;

    // @Column(name = "pct_multa_titulo", length = 255, nullable = false)
    // Decimal(5,2)
    // campo condicional
    private BigDecimal pctMultaTitulo;

    // @Column(name = "val_multa_titulo", length = 255, nullable = false)
    // Campo Condicional
    // Decimal(17,2)
    private BigDecimal valMultaTitulo;

    // @Column(name = "cod_aceite", length = 1, nullable = false)
    // A = ACEITE
    // N = NAO-ACEITE
    private String codAceite;

    // @Column(name = "ctp_aceite_titulo", length = 2, nullable = false)
    private short ctpAceiteTitulo;

    // @Column(name = "num_convenio", length = 30, nullable = true)
    private String desTipoTitulo;

    // @Column(name = "flg_permissao_recebimento_parcial", length = 5, nullable =
    // false)
    private boolean flgPermissaoRecebimentoParcial;

    // @Column(name = "des_numero_titulo_beneficiario", length = 15, nullable =
    // true)
    private String desNumeroTituloBeneficiario;

    // @Column(name = "des_observacao_beneficiario", length = 25, nullable = true)
    private String desObservacaoBeneficiario;

    // @Column(name = "ctp_conta_caucao", length = 5, nullable = false)
    private short ctpContaCaucao;

    // @Column(name = "des_numero_titulo_cliente", length = 20, nullable = false)
    private String desNumeroTituloCliente;

    // @Column(name = "des_mensagem_ocorrencia", length = 220, nullable = false)
    private String desMensagemOcorrencia;

    // @Column(name = "ctp_inscricao_srf_pagador", length = 1, nullable = false)
    private short ctpInscricaoSrfPagador;

    // @Column(name = "num_cpf_cnpj_pagador", length = 15, nullable = true)
    private Long numCpfCnpjPagador;

    // @Column(name = "nam_pagador", length = 60, nullable = false)
    private String namPagador;

    // @Column(name = "num_convenio", length = 60, nullable = false)
    private String desEnderecoPagador;

    // @Column(name = "num_cep_pagador", length = 255, nullable = false)
    private Integer numCepPagador; // Int(8)

    // @Column(name = "nam_municipio_pagador", length = 20, nullable = false)
    private String namMunicipioPagador;

    // @Column(name = "nam_bairro_pagador", length = 20, nullable = false)
    private String namBairroPagador;

    // @Column(name = "abr_uf_pagador", length = 2, nullable = false)
    private String abrUfPagador;

    // @Column(name = "des_telefone_pagador", length = 12, nullable = true)
    private String desTelefonePagador;

    // @Column(name = "ctp_inscricao_avalista", length = 1, nullable = false)
    private short ctpInscricaoAvalista;

    // @Column(name = "num_convenio", length = 20, nullable = true) // len 15
    private Long numInscricaoAvalista;

    // @Column(name = "num_convenio", length = 60, nullable = true)
    private String namAvalista;

    // @Column(name = "num_convenio", length = 8, nullable = true)
    private String codChaveUsuairo;

    // @Column(name = "ctp_canal_solicitacao", length = 1, nullable = false)
    private short ctpCanalSolicitacao;

    // --------------------------------- ??

    // //@Column(name = "abr_mensagem_sistema", length = 3, nullable = true)
    // private String abrMensagemSistema;

    // //@Column(name = "num_retorno_programa", length = 255, nullable = true)
    // private short numRetornoPrograma;

    // //@Column(name = "nam_nome_programa_erro", length = 8, nullable = false)
    // private String namNomeProgramaErro;

}
