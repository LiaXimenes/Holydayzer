import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private static List<Holiday> holidays = new ArrayList<>();

    public Calendar(){
        holidays.add(new Holiday("01/01/2023", "Confraternização mundial"));
        holidays.add(new Holiday("21/02/2023", "Carnaval"));
        holidays.add(new Holiday("17/04/2023", "Páscoa"));
        holidays.add(new Holiday("21/04/2023", "Tiradentes"));
        holidays.add(new Holiday("01/05/2023", "Dia do trabalho"));
        holidays.add(new Holiday("08/06/2023", "Corpus Christi"));
        holidays.add(new Holiday("07/09/2023", "Independência do Brasil"));
        holidays.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        holidays.add(new Holiday("02/11/2023", "Finados"));
        holidays.add(new Holiday("15/11/2023", "Proclamação da República"));
        holidays.add(new Holiday("25/12/2023", "Natal"));
    }

    public void findHoliday(String date){
        for(int i = 0; i < holidays.size(); i++){
            if(holidays.get(i).getDate().equals(date)){
                System.out.println("Dia " + date + " é feriado de " + holidays.get(i).getName());
                return;
            }
        }

        System.out.println("Dia " + date + " não é um feriado");
    }

    public static void getAllHolidays(){
        System.out.println("LISTA DE FERIADOS");
        for(int i = 0; i < holidays.size(); i++){
            System.out.println(holidays.get(i).getDate() + " - " + holidays.get(i).getName());            
        }
    } 
}
