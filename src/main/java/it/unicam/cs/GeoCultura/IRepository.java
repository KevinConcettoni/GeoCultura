package it.unicam.cs.GeoCultura;

import java.util.List;


public interface IRepository<T> {
    void add(T item);
    T findById(String id);
    List<T> findAll();
    void update(T item);
    void delete(T item);
}
