import java.util.Objects;

public class Author {
    private final String firstName;
    private final String midlName;
    private final String lastName;

    public Author(String firstName, String midlName, String lastname) {
        this.firstName = firstName;
        this.midlName = midlName;
        this.lastName = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidlName() {
        return midlName;
    }

    public String getLastName() {
        return this.lastName;
    }
    // public String toString(){
    //    return "  Автор:   " + this. firstName + "  " + this. midlName + "  " + this. lastName;
    //}

    @Override
    public String toString() {
        return " Автор : " + firstName + " " + midlName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(midlName, author.midlName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, midlName, lastName);
    }
}
