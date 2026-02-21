import java.util.Objects;

class Actor extends Person {
    int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Проверка Имени и Фамилии в классе Person
        Actor actor = (Actor) o;
        return height == actor.height; // Проверка роста
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        // Дополняем toString() Имя и Фамилия определены в классе Person
        return "Actor{ " + super.toString() + " (" + height + ")" + "}";
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }
}
