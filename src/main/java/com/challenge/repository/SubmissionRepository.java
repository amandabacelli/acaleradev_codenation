package com.challenge.repository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission, SubmissionId> {
    @Query(value = "select coalesce(max(s.score),0) from challenge ch\n" +
            "join submission s on ch.id = s.challenge_id\n" +
            "where ch.id = :challengeId", nativeQuery = true)
    BigDecimal findHigherScoreByChallengeId(@Param("challengeId") Integer challengeId);

    @Query(" select s from Submission s " +
            " join s.id.challenge cha " +
            " join cha.accelerations acc " +
            " where acc.id = :accelerationId and cha.id = :challengeId ")
    List<Submission> findByChallengeIdAndAccelerationId(@Param("challengeId") Integer challengeId, @Param("accelerationId") Integer accelerationId);

}
