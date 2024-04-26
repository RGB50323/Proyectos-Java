import SubClases.Fecha;
import SubClases.Hora;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");

        Examen exam1 = new Examen("Math", "2A", 23, 9, 2024, 9, 45);
        Examen exam2 = new Examen("POO", "D27", 25, 5, 2024, 11, 30);

        System.out.println(exam1);
        System.out.println(exam2);

        System.out.println("-----------------------------------");

        Examen newExam2 = new Examen("POO", "D27", new Fecha(30, 9, 2024), new Hora(10, 15));
        System.out.println("Changes in schedule: " + newExam2);

        System.out.println("-----------------------------------");

    }

}
