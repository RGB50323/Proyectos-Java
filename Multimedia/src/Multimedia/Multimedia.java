package Multimedia;

import javax.xml.datatype.Duration;

public class Multimedia {

    private final Formato formato;
    private String title;
    private String author;
    private duration time;


    public Multimedia(String title, String author, int minute, int second, Formato formato ) {
        this.title = title;
        this.author = author;
        this.time = new duration(minute, second);
        this.formato = formato;
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


    public duration getTime() {
        return time;
    }

    public void setTime(duration time) {
        this.time = time;
    }

    public Formato getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Datos -> " + " title ='" + title + '\'' +
                ", author = '" + author + '\'' +
                ", duration = '" + time + '\'' +
                ", formato ----> '" + formato + '\'' +
                '}';
    }

    public String equalsAuthorTitle() {
        if (getAuthor().equals(getTitle())){
            return "Author and title are the same";
        } else {
            return "Different author and title";
        }
    }

}
