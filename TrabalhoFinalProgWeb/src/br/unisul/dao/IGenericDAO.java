package br.unisul.dao;

import java.util.List;

public interface IGenericDAO<E> {
	public List<E> getList();
	public void save(E object);
	public void update(E object);
	public void delete(E object);
}