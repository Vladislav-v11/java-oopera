package ru.practicum;

import java.util.ArrayList;

public class Show {
    private String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }


    public void printAllActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актеров принимающих участие в " + title + " пуст");
        } else {
            System.out.println("в " + title + " принимают участие: ");
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }

    void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер уже в списке");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " добавлен в список " + title);
        }
    }

    public void changeActor(Actor newActor, String surname) {
        boolean found = false;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println("Актер " + surname + " заменен на " + newActor.getSurname() + " в " + title);
                found = true;
                return;
            }
        }
        if (!found) {
            System.out.println("Актер с фамилией " + surname + " не участвует в " + title);
        }
    }

}
