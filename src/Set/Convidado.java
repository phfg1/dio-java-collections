package Set;

import java.util.Objects;

public class Convidado {
    private String name;
    private int inviteCode;

    public Convidado(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public String getName() {
        return name;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getInviteCode() == convidado.getInviteCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getInviteCode());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", inviteCode=" + inviteCode +
                '}';
    }
}
