
import java.util.Scanner;

public class DailyPlanner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresá un número de día (1 = lunes, 7 = domingo):");
        int day = scanner.nextInt();
        System.out.println("Ingresá la hora actual (0 a 23):");
        int time = scanner.nextInt();

        switch (day) {
         case 1:
            System.out.println("Hoy es Lunes");
            break;
         case 2:
            System.out.println("Hoy es Martes");
            break;
         case 3:
            System.out.println("Hoy es Miercoles");
            break;
         case 4:
            System.out.println("Hoy es Jueves");
            break;
         case 5:
            System.out.println("Hoy es Viernes");
            break;
         case 6:
            System.out.println("Hoy es Sabado");
            break;
         case 7:
            System.out.println("Hoy es Domingo");
            break;
         default:
            System.out.println("Número de día inválido");
            System.out.println("No se puede sugerir actividad: el día ingresado no es válido.");
        }

      if (day >= 1 && day <= 5) {
         if (time >= 24 || time < 0) {
            System.out.println("No se puede sugerir actividad: hora inválida");
         }else if ((day == 1 || day == 3 || day == 5) && time >= 20 && time <= 22) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: A Programar");  
         } else if (time >= 8 && time <= 10 ) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Arrancá el dia con matecito");
         } else if (time >= 11 && time < 19) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: A trabajar"); 
         } else if (time >= 19 && time < 20) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Merienda");          
         } else if (time >= 20 && time <= 22) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Tiempo libre, mirá una serie o salí a caminar");
         } else {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Es hora de dormir"); 
         }

      if (day == 6 || day == 7) {
       if (time >= 24 || time < 0) {
         System.out.println("No se puede sugerir actividad: hora inválida");
         }else if (time >= 8 && time <= 10 ) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Arrancá el dia con matecito");
         } else if (time >= 11 && time <= 13) { 
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Preparar almuerzo");
         } else if (time >= 14 && time <= 17) {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Tiempo libre: juegos, hobbies.");
         } else if (time >= 18 && time <= 22) { 
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Encontrate con amigos o familia.");
         } else {
            System.out.println("Son las " + time + " horas");
            System.out.println("Actividad sugerida: Dormí tranquilo, es fin de semana.");
         }
       } 
       scanner.close();
      }
   }
}  
   