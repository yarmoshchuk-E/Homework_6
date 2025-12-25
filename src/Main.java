public class Main
{
    public static void main(String[] args)
    {

        //Задача_1
        System.out.println("Task_1");
        byte age = 25;
        if (age >= 18) {
            System.out.println("Если человеку " + age + " лет, то он совершеннолетний.\n");
        } else {
            System.out.println("Если человеку " + age + " лет, то он не достиг совершеннолетия, нужно немного подождать.\n");
        }

        //Задача_2
        System.out.println("Task_2");
        byte outdoorTemperature = 8;
        if (outdoorTemperature <= 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть шапку.\n");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки.\n");
        }

        //Задача_3
        System.out.println("Task_3");
        short speed = 75;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно.\n");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то придется заплатить штраф.\n");
        }

        //Задача_4
        System.out.println("Task_4");
        byte howOldAreYou = 33;
        if (howOldAreYou >= 2 && howOldAreYou < 7) {
            System.out.println("Если возраст человека равен " + howOldAreYou + ", то ему нужно ходить в детский сад.\n");
        }
        if (howOldAreYou >= 7 && howOldAreYou <= 17) {
            System.out.println("Если возраст человека равен " + howOldAreYou + ", то ему нужно ходить в школу.\n");
        }
        if (howOldAreYou > 17 && howOldAreYou <= 24) {
            System.out.println("Если возраст человека равен " + howOldAreYou + ", то ему нужно ходить в университет.\n");
        }
        if (howOldAreYou > 24) {
            System.out.println("Если возраст человека равен " + howOldAreYou + ", то ему нужно ходить на работу.\n");
        }

        //Задача_5
        System.out.println("Task_5");
        byte childAge = 9;
        if (childAge <= 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.\n");
        }
        if (childAge > 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.\n");
        }
        if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.\n");
        }

        //Задача_6
        System.out.println("Task_6");
        int passengers = 43;         //количество пассажиров
        byte capacityTrainVan = 102;  //вместимость вагона
        byte sittingPositions = 60;   //количество сидячих мест в вагоне
        if (passengers >= 0 && passengers < sittingPositions) {
            System.out.println("В вагоне есть " + (capacityTrainVan - passengers) + " свободных мест, из них " + (sittingPositions - passengers) + " сидячие места.\n");
        } else if (passengers >= sittingPositions && passengers < capacityTrainVan) {
            System.out.println("В вагоне есть " + (capacityTrainVan - passengers) + " свободных мест. Сидячих мест нет.\n");
        } else {
            System.out.println("Вагон полон. Свободных мест нет.\n");
        }

        //Задача_7
        System.out.println("Task_7");
        int one = 5421;
        int two = 5421;
        int three = 42;
        if (one >= two && one >= three) {
            System.out.println("Среди чисел " + one + "; " + two + "; " + three + "; наибольшим является: " + one + ".\n");
        } else if (two >= three) {
            System.out.println("Среди чисел " + one + "; " + two + "; " + three + "; наибольшем является: " + two + ".\n");
        } else {
            System.out.println("Среди чисел " + one + "; " + two + "; " + three + "; наибольшим является: " + three + ".\n");
        }


    }
}