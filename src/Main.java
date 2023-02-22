public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        int wanted =2_459_000;
        int total=0;
        int save=15_000;
        int month=1;
       while(total<=wanted){
           month=month+1;
           total=total+save;
           System.out.println("Месяц " +month + " , сумма накоплений равна " + total + " рублей");
       }
    }
    public static void task2(){
        System.out.println("Задание 2");
        int i=0;
        while(i<=9){
            i=i+1;
            System.out.print(i +" ");
        }
        System.out.println();
        int o=10;
        for(;o>=1;o=o-1){
System.out.print(o+" ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задание 3");
        int countryY=12_000_000;
        int birthStatisticsForThousand=17;
        int deathStatisticsForThousand=8;
        int years=10;
        for(int year=1;year<=years;year=year+1){
            countryY=countryY+ countryY*birthStatisticsForThousand/1000 - countryY * deathStatisticsForThousand/1000;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
    }
    public static void task5(){
        System.out.println("Задание 5");
    }
    public static void task6(){
        System.out.println("Задание 6");
    }
    public static void task7(){
        System.out.println("Задание 7");
    }
    public static void task8(){
        System.out.println("Задание 8");
    }
}