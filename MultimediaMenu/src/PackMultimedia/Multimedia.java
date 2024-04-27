package PackMultimedia;

public class Multimedia {

    private String formato;
    private String title;
    private String author;
    private String time;


    public Multimedia(String title, String author, String time, String format) {
        this.title = title;
        this.author = author;
        this.time = time;
        this.formato = format;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}