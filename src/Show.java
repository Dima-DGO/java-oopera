import java.util.ArrayList;

public class Show {
    String title;   //Название
    int duration;   //длительность


    Director director; //Режисер

    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    // Добавляем актера с проверкой наличия его в списке уже добавленных актеров
    public void setActor(Actor actor) {
        if (!listOfActors.isEmpty()) {
            for (Actor act : listOfActors) {
                if (act.name.equals(actor.name) && act.surname.equals(actor.surname) &&
                        act.height == (actor.height)) {
                    System.out.println("Актер " + actor.surname + " уже есть в списке.");
                    return;
                }
            }
            listOfActors.add(actor);

        } else {
            listOfActors.add(actor);
        }
    }

    // Распечатываем список актеров
    public void printActors() {
        for (Actor act : listOfActors) {
            System.out.println(act); // toString() переопределен в классе Actor
        }
    }

    // Меняем актера. nameActor - это фамилия актера которого меняем на другого актера
    public void changeActor(Actor actor, String nameActor) {
        int i = -1;
        for (Actor act : listOfActors) {
            i++;
            if (act.surname.equals(nameActor)) {
                System.out.println("Меняем актера " + nameActor + " на актера " + actor.surname + ".");
                listOfActors.remove(i);
                setActor(actor); // Сразу идет проверка актера на то, есть ли он уже в списке
                return;
            }

        }
        System.out.println("Замена невозможна. Актер " + nameActor + " в списке не найден.");
    }
}
