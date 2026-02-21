import java.util.Objects;

// Изменен модификатор доступа класса Person и его полей
class Person {
    String name;
    String surname;
    Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // Переопределение equals и hashCode. Сравнивают Имя и Фамилию.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    // Переопределение toString Выводим Имя и Фамилию класса Person
    @Override
    public String toString() {
        return "Person{ name= " + name + " surname= " + surname + "}";
    }

    public String getSurname() {
        return surname;
    }
}
