package com.student.dao;

import java.io.Serializable;
import java.util.List;

import com.student.bean.UserForm;

public interface BaseDao<T, PK extends Serializable> {
	public void save(T entity);

	public void delete(T entity);
	
	public void deleteById(Class<T> entityClass, PK id);
	
	public void saveOrUpdate(T entity);
	
	public void update(T entity);
	
	public List<T> findAll(Class<T> entityClass);
	
	public List<T> findByProperty(Class<T> entityClass, String propertyName,
			Object value, int type);
	
	public T findById(Class<T> entityClass, PK id);
	
	public List<T> findByTwoProperty(Class<T> entityClass, String propertyName1,
			Object value1, String propertyName2, Object value2, int type);
	
	public List findByHql(String hql);
	
	public List findBySql(String sql);
   //用户登录
	public List<UserForm> userFormLogin(UserForm userForm);
	
	
}
