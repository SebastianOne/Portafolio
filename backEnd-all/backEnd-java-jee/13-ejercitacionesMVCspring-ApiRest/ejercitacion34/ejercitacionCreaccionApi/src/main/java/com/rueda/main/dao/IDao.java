package com.rueda.main.dao;

import java.util.List;

public interface IDao <T>{
    public abstract List<T> readAll();
    public abstract T readOne(Integer id);
    public abstract T insert(T object);
    public abstract Boolean delete(Integer id);
    public abstract T update(T object);
}
