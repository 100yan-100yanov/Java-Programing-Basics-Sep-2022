package L03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int examTime = (examHour * 60) + examMinute;   //време на изпит конвертирано в минути
        int arriveTime = (arriveHour * 60) + arriveMinute;   ////време на пристигане конвертирано в минути
        String status = "";
        String statement = "";
        int hourDif = 0;  //разлика в часовете
        int minuteDif = 0;  //разлика в минутите

        if (arriveTime > examTime) {       //Закъснял
            if (arriveTime - examTime < 60) {
                status = "Late";
                statement = "minutes after the start";
                minuteDif = arriveTime - examTime;
            } else {
                status = "Late";
                statement = "hours after the start";
                hourDif = (arriveTime - examTime) / 60;
                minuteDif = (arriveTime - examTime) % 60;
            }
        } else if (arriveTime <= examTime && arriveTime >= (examTime - 30)) {     //Навреме
            status = "On time";
            statement = "minutes before the start";
            minuteDif = examTime - arriveTime;

        } else if (arriveTime < (examTime - 30)) {      //Подранил
            if (examTime - arriveTime < 60) {
                status = "Early";
                statement = "minutes before the start";
                minuteDif = examTime - arriveTime;
            } else {
                status = "Early";
                statement = "hours before the start";
                hourDif = (examTime - arriveTime) / 60;
                minuteDif = (examTime - arriveTime) % 60;
            }
        }
        System.out.println(status);

        switch (status) {
            case "Late":
            case "Early":
                if ((arriveTime - examTime) < 60 && (arriveTime - examTime) >= 1
                        || (examTime - arriveTime) < 60 && (examTime - arriveTime) >= 1) {
                    System.out.printf("%d %s,", minuteDif, statement);
                } else {
                    if (minuteDif < 10) {
                        System.out.printf("%d:0%d %s", hourDif, minuteDif, statement);
                    } else {
                        System.out.printf("%d:%d %s", hourDif, minuteDif, statement);
                    }
                }
                break;
            case "On time":
                if (minuteDif <= 30 && minuteDif >= 1) {
                    System.out.printf("%d %s,", minuteDif, statement);
                }
                break;
        }
    }
}

