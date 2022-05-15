package com.dessima.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dessima.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
