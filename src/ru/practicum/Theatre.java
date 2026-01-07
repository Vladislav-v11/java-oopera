package ru.practicum;

public class Theatre {

    static void main(String[] args) {

        System.out.println("Поехали!");
        Actor bale = new Actor("Кристиан", "Бейл", Gender.MALE, 175);
        Actor pitt = new Actor("Бред", "Питт", Gender.MALE, 180);
        Actor diana = new Actor("Диана", "Крюгер", Gender.FEMALE, 170);

        Director nolan = new Director("Кристофер", "Нолан", Gender.MALE, 10);
        Director fincher = new Director("Дэвид", "Финчер", Gender.MALE, 5);

        Person chaikovskiy = new Person("Петр", "Чайковский", Gender.MALE);
        Person ivanov = new Person("Лев", "Иванов", Gender.MALE);

        Show garden = new Show("Вишневый сад",100, nolan);
        Opera onegin = new Opera("Евгений Онегин", 120, fincher, chaikovskiy,
                "Лирическая опера по роману  Пушкина", 20);
        Ballet nutcracker = new Ballet("Щелкунчик", 90, nolan, chaikovskiy,
                "Повесть-сказка Эрнста Теодора Амадея Гофмана", ivanov);

        garden.addNewActor(bale);
        garden.addNewActor(diana);

        onegin.addNewActor(pitt);
        onegin.addNewActor(bale);

        nutcracker.addNewActor(diana);
        nutcracker.addNewActor(bale);

        garden.printAllActors();
        onegin.printAllActors();

        garden.changeActor(pitt,"Бейл");
        garden.printAllActors();

        nutcracker.printAllActors();
        nutcracker.changeActor(pitt, "Форд");

        onegin.getLibrettoText();
        nutcracker.getLibrettoText();
    }
}
