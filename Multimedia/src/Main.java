import Multimedia.Formato;
import Multimedia.Multimedia;
import Formatos.Pelicula;

public class Main {

    public static void main(String[] args) {


        Multimedia multimedia = new Multimedia("Rafa", "RGB",3, 30, Formato.mp3);
        Multimedia multimedia1 = new Multimedia("Andres", "AEME", 4, 15, Formato.midi);
        Multimedia multimedia2 = new Multimedia("RAFA", "RAFA", 5, 55, Formato.cdAudio);

        Pelicula movie = new Pelicula("Sam Worthington", "Zoe Saldaña", "AVATAR 3", "James Cameron",240, 30, Formato.mov);

        System.out.println("----------------------------------");
        System.out.println(multimedia);
        System.out.println(multimedia.equalsAuthorTitle());
        System.out.println("----------------------------------");
        System.out.println(multimedia1);
        System.out.println(multimedia1.equalsAuthorTitle());
        System.out.println("----------------------------------");
        System.out.println(multimedia2);
        System.out.println(multimedia2.equalsAuthorTitle());
        System.out.println("----------------------------------");
        System.out.println("\n");
        System.out.println(movie);



    }

}
