import SubClases.Fecha;
import SubClases.Hora;

public class Examen {

    private String subjectName;
    private String room;
    private Fecha date;
    private Hora hour;


    public Examen(String subjectName, String room, int day, int month, int year, int hour, int minute){
        this.subjectName = subjectName;
        this.room = room;
        this.date = new Fecha(day, month, year);
        this.hour = new Hora(hour, minute);
    }

    public Examen(String subjectName, String room, Fecha fecha, Hora hour){
        this.subjectName = subjectName;
        this.room = room;
        this.date = fecha;
        this.hour = hour;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Fecha getDate() {
        return date;
    }

    public void setDate(Fecha date) {
        this.date = date;
    }

    public Hora getHour() {
        return hour;
    }

    public void setHour(Hora hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Details - Exam -> " +
                " subjectName = '" + subjectName + '\'' +
                ", room = " + room + '\'' +
                ", date = " + date +
                ", hour = " + hour;
    }
}
