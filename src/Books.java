/**
 * Created by Lais Lodi on 28/08/2017.
 */
public class Books {
    private static int id;
    private String name;
    private String genre;
    private String resume;
    private String publicationDate;
    private boolean isAvailable;

    public Books(int id, String name, String genre, String resume, String publicationDate, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.resume = resume;
        this.publicationDate = publicationDate;
        this.isAvailable = isAvailable;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    public boolean getAvailable(){
        return this.isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "nome: '" + name + '\'' +
                ", genero: '" + genre + '\'' +
                ", resumo: '" + resume + '\'' +
                ", data de publicacao: '" + publicationDate + '\'';
    }
}
