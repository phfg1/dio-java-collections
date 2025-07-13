package Set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String name;
    private int number;

    public Contato(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" + name + "," + number + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getName(), contato.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
