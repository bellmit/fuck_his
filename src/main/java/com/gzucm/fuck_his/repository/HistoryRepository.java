package com.gzucm.fuck_his.repository;

import com.gzucm.fuck_his.entity.History;
import com.gzucm.fuck_his.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

/**
 * @author tianyi
 * @date 2018-10-19 10:31
 */
public interface HistoryRepository extends JpaRepository<History,Integer> {

    /**
     * TODO 欠完善包含医生表的双嵌套查询
     * @return
     */
    @Query("SELECT h.id,p.name,h.doctorId,h.judge,h.mainTold,h.medicines,h.isPaid,h.price FROM History h JOIN Patient p ON h.patientId=p.id")
    public Collection<Object> findAllSafe();
}
