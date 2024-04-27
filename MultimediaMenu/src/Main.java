import PackMultimedia.Multimedia;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Multimedia> multimediaList = new ArrayList<>();

        int opcion = 0;

        do {

            try{

                mainMenu();
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion){
                    case 1:
                        System.out.println("----------- LISTA DE ELEMENTOS MULTIMEDIA -----------");
                        multimediaTotalList(multimediaList);
                        break;
                    case 2:
                        System.out.println("----------- AÑADIR ELEMENTO A LA LISTA -----------");
                        addElement(multimediaList);
                        break;
                    case 3:
                        System.out.println("----------- DATOS DE UN ELEMENTO -----------");
                        detailsElement(multimediaList);
                        break;
                    case 4:
                        System.out.println("----------- ELIMINAR ELEMENTO -----------");
                        deleteElement(multimediaList);
                        break;
                    case 5:
                        System.out.println("----------- MODIFICAR ELEMENTO -----------");
                        modifyElement(multimediaList);
                        break;
                    case 6:
                        System.out.println("Ha salido del programa");
                        break;
                    default:
                        System.out.println("Escoja una opcion valida por favor");
                        break;
                }

            }catch (InputMismatchException e){

                System.out.println("Por favor escriba un dato valido");
                sc.nextLine();
            }

        }while(opcion != 6);

    }


    public static void mainMenu(){

        System.out.println("---------- MENU -----------");
        System.out.println("1- Multimedia list");
        System.out.println("2- Add element to the list");
        System.out.println("3- Element's Details");
        System.out.println("4- Elminar un elemento de la lista");
        System.out.println("5- Modificar un elemento de la lista");
        System.out.println("6- Salir");
        System.out.print("Escoja una opcion: ");
    }

    public static void multimediaTotalList(ArrayList<Multimedia> multimediaList){

        for (Multimedia multimedia : multimediaList){
            System.out.println("----------------------------------------");
            System.out.println("Movie title :" + multimedia.getTitle());
            System.out.println("Movie author :" + multimedia.getAuthor());
            System.out.println("Duration: " + multimedia.getTime());
            System.out.println("Movie format: " + multimedia.getFormato());
            System.out.println("----------------------------------------");
        }

    }

    public static void addElement(ArrayList<Multimedia> multimediaList){

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

        Multimedia multimedia = new Multimedia(title, author, duration, format);
        multimediaList.add(multimedia);
        System.out.println("Element add correctly to the list");

    }

    public static void detailsElement(ArrayList<Multimedia> multimediaList){

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the element's title: ");
        String title = sc.nextLine();

        for (Multimedia multimedia : multimediaList){

            if (multimedia.getTitle().equals(title)){

                System.out.println("----------------------------------------");
                System.out.println("Movie title :" + multimedia.getTitle());
                System.out.println("Movie author :" + multimedia.getAuthor());
                System.out.println("Duration: " + multimedia.getTime());
                System.out.println("Movie format: " + multimedia.getFormato());
                System.out.println("----------------------------------------");
            }

        }

    }

    public static void deleteElement(ArrayList<Multimedia> multimediaList){

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the element's title: ");
        String title = sc.nextLine();

        for (Multimedia multimedia : multimediaList){

            if (multimedia.getTitle().equals(title)){

                multimediaList.remove(multimedia);
                System.out.println("Element delete correctly");

            }

        }

    }

    public static void modifyElement(ArrayList<Multimedia> multimediaList) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the element's title to modify it: ");
        String title = sc.nextLine();

        for (Multimedia multimedia : multimediaList){

            if (multimedia.getTitle().equals(title)){

                try{

                    optionToModify();
                    int opc = sc.nextInt();
                    switch (opc){

                        case 1:
                            System.out.println("----------- MODIFY TITLE -----------");
                            modifyTitle(multimediaList);
                            break;
                        case 2:
                            System.out.println("----------- MODIFY AUTHOR -----------");
                            break;
                        case 3:
                            System.out.println("----------- MODIFY DURATION -----------");
                            break;
                        case 4:
                            System.out.println("----------- MODIFY FORMAT -----------");
                            break;
                        default:
                            System.out.println("Escoja una opcion valida");
                            break;
                    }

                }catch (InputMismatchException e){

                    System.out.println("Choose a valid option to this format");

                }
            }

        }

    }

    public static void optionToModify(){

        Scanner sc = new Scanner(System.in);

        System.out.println("----------- LISTA DE POSIBLES MODIFICACIONES -----------");
        System.out.println("1. Title");
        System.out.println("2. Author");
        System.out.println("3. Duration");
        System.out.println("4. Format");
        System.out.println("Choose an option: ");

    }

    public static void modifyTitle(ArrayList<Multimedia> multimediaList) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type element's title: ");
        String title = sc.nextLine();

        for (Multimedia multimedia : multimediaList) {

            if (multimedia.getTitle().equals(title)) {

                System.out.println("We found an element with that name");
                System.out.print("Type the new title: ");
                String newTitle = sc.nextLine();

                multimedia.setTitle(newTitle);

                System.out.println("New element's title: " + newTitle);

            } else {
                System.out.println("We don't have an element with that name");
            }
        }
    }
}