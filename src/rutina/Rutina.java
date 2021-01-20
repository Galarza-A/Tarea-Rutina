package rutina;

/**
 *
 * @author angeles
 */
public class Rutina {
    public static void main(String[] args) {
        String diasDeLaSemana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        
        String actividades[] = {"|7:50AM:Despertarme y mirar mi celular |\n |8:30AM : Levantarme de mi cama |\n| 8:30-9:00AM : Preparar mi desayuno y desayunar |\n "
            + "|9:00-10:30 AM: Veo mi serie de TV The bing bang theory|\n |10:30AM-12:00PM : Ayudar a la limpieza de la casa |\n"
            + "|12:00PM-2:00PM : Ver videos de clase de ingles en youtube| \n |2:00-2:30PM : Comer| \n |2:30-4:00PM: Jugar videojuegos|\n|4:00-7:00PM: Ir a casa de mi novia para visitarla(Ver series,jugar,etc..) |\n"
            + "|7:00-9:00PM: Ver videos ya sean de entretenimiento o educativos|\n |9:00-9:30PM: Cenar|\n| 9:30-10:30PM:Tiempo muerto lo utilizo para ver mi celular,checar redes y de vez en cuando realizar actividades de dualingo|\n"
            + "|10:30-10:50PM: Bañarme|\n |11:00PM:Dormir|",
            
            "|7:50AM:Despertarme y mirar mi celular |\n |8:10AM : Levantarme de mi cama |\n| 8:10-9:00AM: Salir a correr o andar en bici |\n "
            + "|9:30-10:00 AM: Prepara mi desayuno y desayunar|\n |10:00AM-12:00PM : Ayudar a la limpieza de la casa |\n"
            + "|12:00PM-2:00PM : Ver series en netflix| \n |2:00-2:30PM : Comer| \n |2:30-5:00PM: Jugar videojuegos|\n|5:00-7:30PM:Ver videos ya sean de entretenimiento,educativos, etc|\n"
            + "|7:30-9:00PM:Hacer actividades en Dualingo|\n |9:00-9:30PM: Cenar|\n| 9:30-10:30PM:Tiempo muerto lo utilizo para ver mi celular,checar redes y de vez en cuando realizar actividades de dualingo|\n"
            + "|10:30-10:50PM: Bañarme|\n |11:00PM:Dormir|",
            
            "|7:50AM:Despertarme y mirar mi celular |\n |8:20AM : Levantarme de mi cama |\n| 8:20-9:35AM : Preparar mi desayuno y desayunar |\n "
            + "|9:35-10:30 AM:Salir a trotar o andar en bici|\n |10:30AM-12:00PM : Ayudar a la limpieza de la casa |\n"
            + "|12:00PM-2:00PM : Ver videos de clase de ingles en youtube| \n |2:00-2:30PM : Comer| \n |2:30-4:00PM:Salir a comprar despensa para el hogar|\n|4:00-7:00PM: Ir a casa de mi novia para visitarla(Ver series,jugar,etc..) |\n"
            + "|7:00-9:00PM: Ver videos ya sean de entretenimiento o educativos|\n |9:00-9:30PM: Cenar|\n| 9:30-10:30PM:Tiempo muerto lo utilizo para ver mi celular,checar redes y de vez en cuando realizar actividades de dualingo|\n"
            + "|10:30-10:50PM: Bañarme|\n |11:00PM:Dormir|",
            
            "|7:50AM:Despertarme y mirar mi celular |\n |8:10AM : Levantarme de mi cama |\n| 8:10-9:00AM: Salir a correr o andar en bici |\n "
            + "|9:30-10:00 AM: Prepara mi desayuno y desayunar|\n |10:00AM-12:00PM : Ayudar a la limpieza de la casa |\n"
            + "|12:00PM-2:00PM : Ver mi serie de TV| \n |2:00-2:30PM : Comer| \n |2:30-5:00PM: Jugar videojuegos|\n|5:00-7:30PM:Ver videos ya sean de entretenimiento,educativos, etc|\n"
            + "|7:30-9:00PM:Hacer actividades en Dualingo|\n |9:00-9:30PM: Cenar|\n| 9:30-10:30PM:Tiempo muerto lo utilizo para ver mi celular,checar redes y de vez en cuando realizar actividades de dualingo|\n"
            + "|10:30-10:50PM: Bañarme|\n |11:00PM:Dormir|",
            
            "|7:50AM:Despertarme y mirar mi celular |\n |8:30AM : Levantarme de mi cama |\n| 8:30-9:00AM : Preparar mi desayuno y desayunar |\n "
            + "|9:00-10:30 AM: Veo mi serie de TV The bing bang theory|\n |10:30AM-12:00PM : Ayudar a la limpieza de la casa |\n"
            + "|12:00PM-2:00PM : Ver videos de clase de ingles en youtube| \n |2:00-2:30PM : Comer| \n |2:30-4:00PM: Jugar videojuegos|\n|4:00-7:00PM: Ir a casa de mi novia para visitarla(Ver series,jugar,etc..) |\n"
            + "|7:00-9:00PM: Ver videos ya sean de entretenimiento o educativos|\n |9:00-9:30PM: Cenar|\n| 9:30-10:30PM:Tiempo muerto lo utilizo para ver mi celular,checar redes y de vez en cuando realizar actividades de dualingo|\n"
            + "|10:30-10:50PM: Bañarme|\n |11:00PM:Dormir|",
            
            "|8:50AM:Despertarme y mirar mi celular |\n |9:30AM : Levantarme de mi cama |\n| 9:30-10:00AM : Preparar mi desayuno y desayunar |\n "
            + "|9:00-11:30 AM: Veo mi serie de TV The bing bang theory|\n |11:30AM-1:00PM : Ayudar a la limpieza de la casa(Regar el jardin,barrer,trapear,etc) |\n"
            + "|1:00PM-3:00PM : Ver la TV| \n |3:00-3:30PM : Comer| \n |3:30-5:00PM:Investigar sobre trabajos|\n|4:00-7:00PM: Salir con primos y amigos a jugar futbool|\n"
            + "|7:00-9:00PM: Ver videos ya sean de entretenimiento o educativos|\n |9:00-9:30PM: Cenar|\n| 9:30-11:30PM:Jugar videojuegos|\n"
            + "|11:30-12:50PM: Bañarme|\n |12:00PM:Dormir|",
            
            "|8:50AM:Despertarme y mirar mi celular |\n |9:30AM : Levantarme de mi cama |\n| 9:30-10:00AM : Preparar mi desayuno y desayunar |\n "
            + "|9:00-11:30 AM: Veo mi serie de TV The bing bang theory|\n |11:30AM-1:00PM : Ayudar a la limpieza de la casa(tender mi cama,barrer,trapear,lavar los trastes,etc) |\n"
            + "|1:00PM-3:00PM : Ver la TV| \n |3:00-3:30PM : Comer| \n |3:30-5:00PM:Investigar sobre trabajos|\n|4:00-7:00PM: Jugar videojuegos|\n"
            + "|7:00-9:00PM: Ver videos ya sean de entretenimiento o educativos|\n |9:00-9:30PM: Cenar|\n| 9:30-10:30PM:Tiempo muerto lo utilizo para ver mi celular,checar redes y de vez en cuando realizar actividades de dualingo|\n"
            + "|10:30-10:50PM: Bañarme|\n |11:00PM:Dormir|"};

        for (int k = 1; k <= 4; k++) {
            for (int i = 0; i < diasDeLaSemana.length; i++) {               
                System.out.println("\n----------------------------------------");
                for (int j = 0; j < actividades.length; j++) {
                    if (i == j) {
                        System.out.print(" |" + diasDeLaSemana[i] + "| " + "semana numero " + k + " | " + "\n " + actividades[j] + "\n ");
                    }
                }
            }
            System.out.println("\n----------------------------------------");
        }
    }

}
