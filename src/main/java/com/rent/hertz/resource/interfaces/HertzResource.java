package com.rent.hertz.resource.interfaces;

import java.util.List;
import java.util.Optional;

public interface HertzResource<T> {

	T save(final T t);

	T update(final T t);

	Optional<T> findById(final String s);

	List<T> findAll();

	void delete(final String t);
}