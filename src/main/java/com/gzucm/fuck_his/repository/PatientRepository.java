package com.gzucm.fuck_his.repository;

import com.gzucm.fuck_his.DTO.PatientSafeDTO;
import com.gzucm.fuck_his.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

/**
 * @author tianyi
 * @date 2018-10-19 10:30
 */
public interface PatientRepository extends JpaRepository<Patient,Integer> {
    public List<Patient> findAllByPhonenumber(String phonenumber);

    @Query("SELECT p.id,p.birthday,p.name,p.phonenumber,p.isMan,p.height,p.weight,p.healthCardId,p.peopleCard,p.cureTimes FROM Patient p")
    public Collection<PatientSafeDTO> findAllSafe();

    @Query("SELECT p.id,p.birthday,p.name,p.phonenumber,p.isMan,p.height,p.weight,p.healthCardId,p.peopleCard,p.cureTimes FROM Patient p WHERE p.id=?1")
    public Collection<Object> findOneByIdSafe(int patientId);
}
