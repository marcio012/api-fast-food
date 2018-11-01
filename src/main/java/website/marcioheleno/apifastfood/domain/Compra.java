package website.marcioheleno.apifastfood.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * The type Compra.
 */
@Entity
@Table(name = "compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int quantidade;

    private Double valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    @ManyToMany (mappedBy="compra")
    private Set<Produto> produto;

    /**
     * Instantiates a new Compra.
     *
     * @param quantidade the quantidade
     * @param valorTotal the valor total
     * @param produto    the produto
     */
    public Compra(int quantidade, Double valorTotal, Set<Produto> produto) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.produto = produto;
    }

    /**
     * Instantiates a new Compra.
     *
     * @param quantidade the quantidade
     * @param valorTotal the valor total
     * @param cliente    the cliente
     * @param produto    the produto
     */
    public Compra(int quantidade, Double valorTotal, Cliente cliente, Set<Produto> produto) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.produto = produto;
    }

    /**
     * Instantiates a new Compra.
     */
    public Compra() {}

    /**
     * Instantiates a new Compra.
     *
     * @param quantidade the quantidade
     * @param valorTotal the valor total
     */
    public Compra(int quantidade, Double valorTotal) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    /**
     * Instantiates a new Compra.
     *
     * @param quantidade the quantidade
     * @param valorTotal the valor total
     * @param cliente    the cliente
     */
    public Compra(int quantidade, Double valorTotal, Cliente cliente) {
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    /**
     * Gets produto.
     *
     * @return the produto
     */
    public Set<Produto> getProduto() {
        return produto;
    }

    /**
     * Sets produto.
     *
     * @param produto the produto
     */
    public void setProduto(Set<Produto> produto) {
        this.produto = produto;
    }

    /**
     * Gets cliente.
     *
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets cliente.
     *
     * @param cliente the cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets quantidade.
     *
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Sets quantidade.
     *
     * @param quantidade the quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Gets valor total.
     *
     * @return the valor total
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets valor total.
     *
     * @param valorTotal the valor total
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

 }

