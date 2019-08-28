package fr.formation.inti.dao;

import java.util.List;

public interface IGenericDao<T, I extends Number> {

	
	public void persist(T e);
	
	public I save(T e);
	
	public void update(T e);
	
	public void delete(T e);
	
	public void deleteByID(I id,Class<?> persistClass);
	
	public T findById(I id,Class<?> persistClass);
	
	public void update(List<T> list);
	
	public List<T> getAll();

	
}
