package com.gzucm.fuck_his.repository;

import com.gzucm.fuck_his.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.gzucm.fuck_his.entity.Apartment;
import java.util.Collection;

/**
 * @author tianyi
 * @date 2018-10-19 10:30
 */
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
    public Doctor findByPhonenumber(String phonenumber);

    @Query("SELECT d.apartmentId,d.id,d.name,d.phonenumber,d.isMan,d.level,a.apartmentName,d.introduction,d.workKind,d.monthPeople FROM Doctor d JOIN Apartment a ON d.apartmentId=a.apartmentId")
    public Collection<Object> findAllSafe();

    @Query("SELECT d.id,d.name,d.phonenumber,d.isMan,d.level,a.apartmentName,d.introduction,d.workKind,d.monthPeople FROM Doctor d JOIN Apartment a ON d.apartmentId=a.apartmentId AND d.id=?1")
    public Object findOneByIdSafe(int doctorId);
}
