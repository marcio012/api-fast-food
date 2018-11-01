package website.marcioheleno.apifastfood.domain;

import javax.persistence.*;
import java.util.List;


/**
 * The type Cliente.
 */
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private String sobrenome;

    private Integer idade;

    @Column(nullable = true)
    private String endereco;

    private Character sexo;

    // relacionamento n => 1
    //
    @OneToMany(cascade = CascadeType.ALL, mappedBy="cliente")
    private List<Compra> compras;

    /**
     * Instantiates a new Cliente.
     */
    public Cliente() {}

    /**
     * Instantiates a new Cliente.
     *
     * @param nome      the nome
     * @param sobrenome the sobrenome
     * @param idade     the idade
     * @param endereco  the endereco
     * @param sexo      the sexo
     */
    public Cliente(String nome, String sobrenome, Integer idade, String endereco, Character sexo) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.sexo = sexo;
    }


    /**
     * Instantiates a new Cliente.
     *
     * @param nome      the nome
     * @param sobrenome the sobrenome
     * @param idade     the idade
     * @param endereco  the endereco
     * @param sexo      the sexo
     * @param compras   the compras
     */
    public Cliente(String nome, String sobrenome, Integer idade, String endereco, Character sexo, List<Compra> compras) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.sexo = sexo;
        this.compras = compras;
    }

    /**
     * Gets cars.
     *
     * @return the cars
     */
    public List<Compra> getCars() {
        return compras;
    }

    /**
     * Sets cars.
     *
     * @param compras the cars
     */
    public void setCars(List<Compra> compras) {
        this.compras = compras;
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
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets sobrenome.
     *
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Sets sobrenome.
     *
     * @param sobrenome the sobrenome
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Gets idade.
     *
     * @return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * Sets idade.
     *
     * @param idade the idade
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * Gets endereco.
     *
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Sets endereco.
     *
     * @param endereco the endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Gets sexo.
     *
     * @return the sexo
     */
    public Character getSexo() {
        return sexo;
    }

    /**
     * Sets sexo.
     *
     * @param sexo the sexo
     */
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
}
