public class Theatre {
    public static void main(String[] args) {

        // Создаем трех актеров
        Actor actor1 = new Actor("Марина", "Виноградова", Gender.FEMALE, 165);
        Actor actor2 = new Actor("Юрий", "Вьюшкин", Gender.MALE, 175);
        Actor actor3 = new Actor("Зоя", "Лирова", Gender.FEMALE, 168);

        // Создаем двух режисеров
        Director director1 = new Director("Константин", "Богомолов", Gender.MALE, 20);
        Director director2 = new Director("Генриетта", "Яновская", Gender.FEMALE, 15);

        // Создаем автора музыки
        Person musicAuthor = new Person("Сергей", "Рахманинов", Gender.MALE);

        // Создаем хореографа
        Person choreographer = new Person("Татьяна", "Баганова", Gender.FEMALE);

        // Создаем обычный спектакль
        MusicalShow musicalShow = new MusicalShow("Обычный спектакль", 60, director1,
                musicAuthor, "Ж. Бизе «Кармен»");

        // Добавляем актеров в спектакль
        musicalShow.setActor(actor1);
        musicalShow.setActor(actor2);

        // Печатаем информацию о режиссере спектакля с описанием объекта класса. Метод toString() переопределен в
        // классе Director и Person
        System.out.println("Обычный спектакль.");
        musicalShow.printDirector();

        // Печатаем список актеров в спектакле. Метод toString() переопределен в классе Actor и Person.
        // В скобках указан рост актера.
        musicalShow.printActors();

        // Создаем баллет. Добавляем актеров в балет. Печатаем режиссера, список актеров и либретто
        Ballet ballet = new Ballet("Балет", 90, director2,
                musicAuthor, "М. Петипа по мотивам сказки Гофмана", choreographer);
        ballet.setActor(actor1);
        ballet.setActor(actor3);
        System.out.println('\n' + "Баллет.");
        ballet.printDirector();
        ballet.printActors();
        ballet.printLibretto(); // Печатаем либретто к баллету

        // Создаем оперу.
        Opera opera = new Opera("Опера", 120, director1,
                musicAuthor, "К опере Николая Римского-Корсакова «Садко» ", 30);
        opera.setActor(actor2);
        opera.setActor(actor3);
        System.out.println('\n' + "Опера.");
        opera.printDirector();
        opera.printActors();
        opera.printLibretto(); // Печатаем либретто к опере

        // Меняем актера "Лирова" в опере на другого актера
        System.out.println(" ");
        System.out.println("Меняем актера Лирова в опере на другого актера");
        opera.changeActor(actor1, "Лирова");
        System.out.println("Теперь в опере актеры.");
        opera.printActors();

        // Меняем актера "Иванов" (такого актера не существует) на другого актера
        System.out.println(" ");
        ballet.changeActor(actor2, "Иванов");
        System.out.println("В баллете актеры.");
        ballet.printActors();

    }
}
