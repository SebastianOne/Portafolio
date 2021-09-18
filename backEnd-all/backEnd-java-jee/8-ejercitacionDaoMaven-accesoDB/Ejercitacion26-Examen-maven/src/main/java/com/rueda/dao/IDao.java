package com.rueda.dao;

import java.util.List;

public interface IDao<T>{

    public abstract List<T> readMany();
    public abstract T readOne(Integer id);
    public abstract Boolean update(T object);
    public abstract Boolean delete(Integer id);
    public abstract Boolean insert(T object);

}
