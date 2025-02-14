package ent1.eja.e8;

public class Time {
    //ZONA DE ATRIBUTOS
    private int hour;
    private int minute;
    private int second;

    //ZONA DE METODOS
        //constructores
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

        //getters y setters
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

        //otros
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString() {
        return (hour < 10 ? "0" + hour : hour) + ":" +
                (minute < 10 ? "0" + minute : minute) + ":" +
                (second < 10 ? "0" + second : second);
    }
    public Time nextSecond(){
        setSecond(getSecond() + 1);
        if (second == 60) {
            second = 0;  // Reiniciamos los segundos
            minute++;    // Sumamos 1 minuto

            if (minute == 60) {
                minute = 0;  // Reiniciamos los minutos
                hour++;      // Sumamos 1 hora

                if (hour == 24) {
                    hour = 0; // Reiniciamos la hora a 00 si es 24
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        setSecond(getSecond() - 1);
        if (second == -1) {
            second = 59;  // Si bajamos de 0 segundos, pasamos a 59
            minute--;     // Restamos 1 minuto

            if (minute == -1) {
                minute = 59; // Si bajamos de 0 minutos, pasamos a 59
                hour--;      // Restamos 1 hora

                if (hour == -1) {
                    hour = 23; // Si bajamos de 0 horas, pasamos a 23
                }
            }
        }
        return this;
    }
}
