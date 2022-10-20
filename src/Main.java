import clases.cocheCRUDImpl;
import interfaces.CocheCRUD;

public class Main {
    public static void main(String[] args) {

        CocheCRUD miCocheCrud = new cocheCRUDImpl();
        miCocheCrud.save();
        miCocheCrud.finAll();
        miCocheCrud.delete();
    }
}