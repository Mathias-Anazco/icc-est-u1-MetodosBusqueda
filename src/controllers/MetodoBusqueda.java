package controllers;
import views.ShowConsole;
import models.Persona;

public class MetodoBusqueda {

    private ShowConsole showConsole;
    private Persona[] people;

    public MetodoBusqueda(Persona[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }

    public int busquedalineal(int[] arreglo, int valor){

        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i] == valor) {
                return i;

        }
    }
    return -1;
    }

    public int findPersonByCode(int codigo){
        for (int i=0; i<people.length; i++){
            if(people[i].getCodigo() == codigo){
                return i;
            }

        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFine = showConsole.getCodigo();
        int indexPerson = findPersonByCode(codeToFine);
        if (indexPerson >= 1){
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona con codigo " + codeToFine + " no encontrado");
        }
    }
}