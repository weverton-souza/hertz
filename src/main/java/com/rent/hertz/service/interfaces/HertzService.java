package com.rent.hertz.service.interfaces;

import java.util.List;
import java.util.Optional;

public interface HertzService<T> {

	T save(final T t);

	T update(final T t);

	Optional<T> findById(final String id);

	List<T> findAll();

	void delete(final T s);
}
