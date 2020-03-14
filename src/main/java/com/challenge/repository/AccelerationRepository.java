package com.challenge.repository;

import com.challenge.entity.Acceleration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccelerationRepository extends JpaRepository<Acceleration, Integer> {

    Acceleration findAccelerationByName(@Param("name") String name);

    @Query(value = "select acceleration.* from acceleration join candidate on acceleration.id = candidate.acceleration_id\n" +
            "join company on candidate.company_id = company.id\n" +
            "where company.id = :companyId", nativeQuery = true)
    List<Acceleration> findByCompanyId(@Param("companyId") Integer companyId);
}
