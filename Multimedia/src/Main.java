//import Multimedia.Formato;
//import Multimedia.Multimedia;
//import Formatos.Pelicula;

import Multimedia.Multimedia;
import Multimedia.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Multimedia> multimediaList = new ArrayList<>();

//        Multimedia multimedia = new Multimedia("Rafa", "RGB",3, 30, Formato.mp3);
//        Multimedia multimedia1 = new Multimedia("Andres", "AEME", 4, 15, Formato.midi);
//        Multimedia multimedia2 = new Multimedia("RAFA", "RAFA", 5, 55, Formato.cdAudio);
//
//        Pelicula movie = new Pelicula("Sam Worthington", "Zoe Saldaña", "AVATAR 3", "James Cameron",240, 30, Formato.mov);
//
//        System.out.println("----------------------------------");
//        System.out.println(multimedia);
//        System.out.println(multimedia.equalsAuthorTitle());
//        System.out.println("----------------------------------");
//        System.out.println(multimedia1);
//        System.out.println(multimedia1.equalsAuthorTitle());
//        System.out.println("----------------------------------");
//        System.out.println(multimedia2);
//        System.out.println(multimedia2.equalsAuthorTitle());
//        System.out.println("----------------------------------");
//        System.out.println("\n");
//        System.out.println(movie);

        int opcion = 0;

        do {

            try{

                mainMenu();
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion){
                    case 1:
                        System.out.println("----------- LISTA DE ELEMENTOS MULTIMEDIA -----------");
                        multimediaList();
                        break;
                    case 2:
                        System.out.println("----------- AÑADIR ELEMENTO A LA LISTA -----------");
                        addElement();

                        Multimedia multimedia = new Multimedia(addElement());
                        multimediaList.add(multimedia);

                        System.out.println("Element add correctly to the list");

                        break;
                }

            }catch (InputMismatchException e){

                System.out.println("Por favor escriba un dato valido");
                sc.nextLine();
            }

        }while(opcion != 8);

    }


    public static void mainMenu(){

        System.out.println("---------- MENU -----------");
        System.out.println("1- Tamaño de la lista");
        System.out.println("2- Añadir elemento a la lista");
        System.out.println("3- Identificar un elemento por la posicion");
        System.out.println("4- Informacion de un elemento");
        System.out.println("5- Lista completa");
        System.out.println("6- Elminar un elemento de la lista");
        System.out.println("7- Modificar un elemento de la lista");
        System.out.println("8- Salir");
        System.out.print("Escoja una opcion: ");
    }

    public static void multimediaList(){

    }

    public static void addElement(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Agregue los datos del objeto:\n");
        System.out.print("Escriba el titulo: ");
        String title = sc.nextLine();
        System.out.print("Escriba el autor: ");
        String author = sc.nextLine();
        System.out.print("Escriba la duracion : ");
        String duration = sc.nextLine();
        System.out.print("Escoja el formato (wav, mp3, midi, avi, mov, mpg, cdAudio, dvd): ");
        String format = sc.nextLine();
        System.out.print("Escriba quien es el actor principal: ");
        String actor = sc.nextLine();
        System.out.print("Escriba quien es la actriz principal: ");
        String actress = sc.nextLine();
    }

}
