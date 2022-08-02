public class Main {
    public static void main(String[] args) {
        //Задача 1
        int i = 1;
        while (i<=10){
            System.out.print(i + " ");
            i++;
        }
        i=10;
        System.out.println();
        while (i>0){
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        // Задача 2
        int firstFriday = 1;
        for(int day = firstFriday; day<=31 ; day+=7){
            System.out.println("Сегодня пятница " + day + "-е число, Необходимо приготовить отчет");
        }
        System.out.println();
        //Задача 3
        int thisYear = 2022;
        for(int cometYearCounter = 0; cometYearCounter <= thisYear+100; cometYearCounter +=79){
            if (cometYearCounter>=thisYear -200 && cometYearCounter<= thisYear + 100){
                System.out.println(cometYearCounter);
            }
        }



    }
}