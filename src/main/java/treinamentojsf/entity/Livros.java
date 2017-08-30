package treinamentojsf.entity;

/**
 * Created by Lais Lodi on 28/08/2017.
 */
public class Livros {
    private static int id;
    private String nome;
    private String genero;
    private String resumo;
    private String dataPublicacao;
    private boolean disponivel;

    public Livros(int id, String nome, String genero, String resumo, String dataPublicacao, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.resumo = resumo;
        this.dataPublicacao = dataPublicacao;
        this.disponivel = disponivel;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenre() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getPublicationDate() {
        return dataPublicacao;
    }
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    public boolean getDisponivel(){
        return this.disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "nome: '" + nome + '\'' +
                ", genero: '" + genero + '\'' +
                ", resumo: '" + resumo + '\'' +
                ", data de publicacao: '" + dataPublicacao + '\'';
    }
}
