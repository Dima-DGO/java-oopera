import java.util.ArrayList;

class Show {
    String title;   //Название
    int duration;   //длительность


    Director director; //Режисер

    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    // Добавляем актера в список если его нет в списке
    public void setActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Такой актер уже есть в списке");
        }
    }

    // Распечатываем список актеров
    public void printActors() {
        for (Actor act : listOfActors) {
            System.out.println(act); // toString() переопределен в классе Actor
        }
    }

    // Распечатываем режиссера
    public void printDirector() {
        System.out.println(director); // toString() переопределен в классе Director и Person
    }

    // Меняем актера. nameActor - это фамилия актера которого меняем на другого актера
    public void changeActor(Actor actor, String nameActor) {
        int j = 0;
        int index = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(nameActor)) {
                j++;
                index = i;
            }
        }
        if (j == 1) {
            listOfActors.set(index, actor);
        } else if (j == 0) {
            System.out.println("Замена актера не возможна. Такого актера не существует");
        } else if (j > 1) {
            System.out.println("Замена актера не возможна. Актеров с такой фамилией больше одного в списке");
        }
    }
}
