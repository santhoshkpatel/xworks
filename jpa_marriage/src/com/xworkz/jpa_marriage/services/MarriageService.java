package com.xworkz.jpa_marriage.services;

import com.xworkz.jpa_marriage.entity.MarriageEntity;

public interface MarriageService {
boolean validateAndSave(MarriageEntity entity);
boolean validationFindNameById(int id);
boolean upDateNameById(int id,String name);
}
