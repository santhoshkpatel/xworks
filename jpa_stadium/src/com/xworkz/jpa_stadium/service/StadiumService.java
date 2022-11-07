package com.xworkz.jpa_stadium.service;

import java.util.Optional;

import com.xworkz.jpa_stadium.entity.StadiumEntity;

public interface StadiumService {
 boolean validateAndSave(StadiumEntity entity);
 Optional<StadiumEntity> validatAndFindById(int id);
}
