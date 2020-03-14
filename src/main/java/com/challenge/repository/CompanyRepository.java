package com.challenge.repository;

import com.challenge.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query(value = "select distinct cp.* from company cp\n" +
            "join candidate c on cp.id = c.company_id\n" +
            "join acceleration a on c.acceleration_id = a.id where a.id = :accelerationId", nativeQuery = true)
    List<Company> findByAccelerationId(@Param("accelerationId") Integer accelerationId);

    @Query(value = "select cp.* from company cp\n" +
            "join candidate c on cp.id = c.company_id\n" +
            "join users u on c.user_id = u.id where u.id = :userId", nativeQuery = true)
    List<Company> findByUserId(@Param("userId") Integer userId);
}
