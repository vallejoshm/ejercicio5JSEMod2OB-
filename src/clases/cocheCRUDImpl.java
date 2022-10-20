package clases;

import interfaces.CocheCRUD;

public class cocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save");
    }

    @Override
    public void finAll() {
        System.out.println("Método finAll");

    }

    @Override
    public void delete() {
        System.out.println("Método delete");

    }
}
