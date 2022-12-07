package gr.codelearn.moviesandtvseries.repository;


import jakarta.transaction.Transactional;

import java.util.List;

public interface Repository<T, K> {
    T create(T t);


    T get(K id);

    List<T> findAll();

    boolean delete(K id);



}
