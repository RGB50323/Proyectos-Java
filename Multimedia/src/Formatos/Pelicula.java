package Formatos;

import Multimedia.Formato;
import Multimedia.Multimedia;

public class Pelicula extends Multimedia {

    private String mainActor;
    private String mainActress;

    public Pelicula(String mainActor, String mainActress, String title, String author, int minute, int second, Formato formato){
        super(title, author, minute, second, formato);
        this.mainActor = mainActor;
        this.mainActress = mainActress;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getMainActress() {
        return mainActress;
    }

    public void setMainActress(String mainActress) {
        this.mainActress = mainActress;
    }

    @Override
    public String toString() {
        return "Pelicula | " +
                "mainActor = " + mainActor + '\'' +
                ", mainActress = " + mainActress + '\'' +
                '|' + "\n" + super.toString();
    }
}
