package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CandidateRepository  extends JpaRepository<Candidate, CandidateId> {
    @Query(value = "select * from candidate where user_id = :userId and company_id = :companyId and acceleration_id = :accelerationId", nativeQuery = true)
    Optional<Candidate> findById(@Param("userId") Integer userId, @Param("companyId") Integer companyId, @Param("accelerationId") Integer accelerationId);

    @Query(value = "select * from candidate where company_id = :companyId", nativeQuery = true)
    List<Candidate> findByCompanyId(@Param("companyId") Integer companyId);

    @Query(value = "select * from candidate where acceleration_id = :accelerationId", nativeQuery = true)
    List<Candidate> findByAccelerationId(@Param("accelerationId") Integer accelerationId);

}
