import java.util.Date;

/**
 * Created by Lais Lodi on 28/08/2017.
 */
public class Lending {
    private int id;
    private int bookId;
    private Date lendingDate;

    public Lending(int id, int bookId, Date lendingDate) {
        this.id = id;
        this.bookId = bookId;
        this.lendingDate = lendingDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public Date getLendingDate() {
        return lendingDate;
    }
    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }
}
