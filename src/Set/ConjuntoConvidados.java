package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> invitedSet;

    public ConjuntoConvidados() {
        this.invitedSet = new HashSet<>();
    }

    public void addInvited(String name, int inviteCode){
        invitedSet.add(new Convidado(name, inviteCode));
    }

    public void removeInvitedByCode(int inviteCode){
        Convidado invitedToRemove = null;
        for(Convidado c : invitedSet) {
            if(c.getInviteCode() == inviteCode) {
                invitedToRemove = c;
                break;
            }
        }
        invitedSet.remove(invitedToRemove);
    }

    public int countInviteds(){
        return invitedSet.size();
    }

    public void showInviteds(){
        System.out.println(invitedSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.countInviteds() + " dentro da lista de Convidados\n");

        conjuntoConvidados.addInvited("Convidado 1", 1234);
        conjuntoConvidados.addInvited("Convidado 2", 1235);
        conjuntoConvidados.addInvited("Convidado 3", 1236);
        conjuntoConvidados.addInvited("Convidado 4", 1237);
        conjuntoConvidados.addInvited("Convidado 5", 1238);
        conjuntoConvidados.addInvited("Convidado 6", 1239);

        System.out.println("Existem " + conjuntoConvidados.countInviteds() + " dentro da lista de Convidados\n");

        conjuntoConvidados.showInviteds();

        conjuntoConvidados.removeInvitedByCode(1236);

        System.out.println("Existem " + conjuntoConvidados.countInviteds() + " dentro da lista de Convidados\n");

        conjuntoConvidados.showInviteds();
    }

}
