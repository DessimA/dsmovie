package com.dessima.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dessima.dsmovie.entities.Score;
import com.dessima.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
