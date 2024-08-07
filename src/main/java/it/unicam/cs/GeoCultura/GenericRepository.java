package it.unicam.cs.GeoCultura;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class GenericRepository<T> implements IRepository<T>{
    private final Vector<T> vector = new Vector<>();

    private String getId(T item) {
        try {
            return (String) item.getClass().getMethod("getID").invoke(item);
        } catch (Exception e) {
            throw new IllegalArgumentException("Errore: impossibile accedere al metodo getID dell'oggetto", e);
        }
    }

    @Override
    public void add(T item) {
        vector.add(item);
    }

    @Override
    public T findById(String id) {
        return vector.stream()
                .filter(item -> getId(item).equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<T> findAll() {
        return new Vector<>(vector);
    }

    @Override
    public void update(T item) {
        String id = getId(item);
        Optional<T> existingItem = vector.stream()
                .filter(it -> getId(it).equals(id))
                .findFirst();
        existingItem.ifPresent(it -> {
            vector.remove(it);
            vector.add(item);
        });
    }

    @Override
    public void delete(T item) {
        vector.remove(item);
    }
}
