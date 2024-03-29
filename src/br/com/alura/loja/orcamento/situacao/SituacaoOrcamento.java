package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);

    public void aprovar(Orcamento orcamento) throws DomainException{
        throw new DomainException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) throws DomainException{
        throw new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) throws DomainException{
        throw new DomainException("Orcamento nao pode ser finalizado!");
    }

}
