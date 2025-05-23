package project.doa.solidario.modals;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import project.doa.solidario.modals.enums.Categoria;
import project.doa.solidario.modals.enums.EstadoConservacao;
import project.doa.solidario.modals.enums.Situacao;

import java.time.LocalDateTime;

@Entity
public class Item extends EntityId{

    // ATRIBUTOS

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private LocalDateTime data_cadastro;

    @Column(nullable = false)
    private Long quantidade;

    @Column(nullable = false)
    private Long valor;

    @Column(nullable = false)
    private Boolean caminhao;

    @Column(nullable = false)
    private String anexo;


    // ENUMS

    @Column(nullable = false)
    private Categoria categoria;

    @Column(nullable = false)
    private EstadoConservacao estadoConservacao;

    @Column(nullable = false)
    private Situacao situacao;


    // GET AND SET


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Boolean getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Boolean caminhao) {
        this.caminhao = caminhao;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }


    // TOSTRING

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                ", data_cadastro=" + data_cadastro +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", caminhao=" + caminhao +
                ", anexo='" + anexo + '\'' +
                ", categoria=" + categoria +
                ", estadoConservacao=" + estadoConservacao +
                ", situacao=" + situacao +
                '}';
    }
}
