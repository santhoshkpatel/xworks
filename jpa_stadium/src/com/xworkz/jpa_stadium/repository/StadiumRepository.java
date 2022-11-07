package com.xworkz.jpa_stadium.repository;

import java.util.Optional;

import com.xworkz.jpa_stadium.entity.StadiumEntity;

public interface StadiumRepository {
  boolean save(StadiumEntity entity);
  Optional<StadiumEntity> findByIds(int id);
  
}
