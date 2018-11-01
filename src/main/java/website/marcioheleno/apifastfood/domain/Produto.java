package website.marcioheleno.apifastfood.domain;

import javax.persistence.*;
import java.util.List;

/**
 * The type Produto.
 */
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduto;

    private String nomeProduto;

    private String descricaoProduto;

    private int valorProduto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "compra")
    private Compra compra;


    /**
     * Instantiates a new Produto.
     */
    public Produto() {}

    /**
     * Instantiates a new Produto.
     *
     * @param nomeProduto      the nome produto
     * @param descricaoProduto the descricao produto
     * @param valorProduto     the valor produto
     */
    public Produto(String nomeProduto, String descricaoProduto, int valorProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    /**
     * Instantiates a new Produto.
     *
     * @param nomeProduto      the nome produto
     * @param descricaoProduto the descricao produto
     * @param valorProduto     the valor produto
     * @param compra           the compra
     */
    public Produto(String nomeProduto, String descricaoProduto, int valorProduto, Compra compra) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
        this.compra = compra;
    }

    /**
     * Gets compra.
     *
     * @return the compra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * Sets compra.
     *
     * @param compra the compra
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    /**
     * Gets id produto.
     *
     * @return the id produto
     */
    public Long getIdProduto() {
        return idProduto;
    }

    /**
     * Sets id produto.
     *
     * @param idProduto the id produto
     */
    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * Gets nome produto.
     *
     * @return the nome produto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Sets nome produto.
     *
     * @param nomeProduto the nome produto
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * Gets descricao produto.
     *
     * @return the descricao produto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * Sets descricao produto.
     *
     * @param descricaoProduto the descricao produto
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * Gets valor produto.
     *
     * @return the valor produto
     */
    public int getValorProduto() {
        return valorProduto;
    }

    /**
     * Sets valor produto.
     *
     * @param valorProduto the valor produto
     */
    public void setValorProduto(int valorProduto) {
        this.valorProduto = valorProduto;
    }
}
