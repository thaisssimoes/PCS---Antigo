/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.requerimento;

import java.time.LocalDate;

/**
 *
 * @author RafaelSalazarStavale
 */
public class AtualizacaoDeCadastro extends Requerimento {

    public AtualizacaoDeCadastro(String requerente, String areaResponsavel, String status, String descricao, LocalDate dataCriacao, LocalDate dataSolucao, String feedback) {
        super(requerente, areaResponsavel, status, descricao, dataCriacao, dataSolucao, feedback);
    }

}
