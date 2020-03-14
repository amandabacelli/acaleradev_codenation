package com.challenge.repository;

import com.challenge.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select  u.* from users u\n" +
            "join candidate c on u.id = c.user_id\n" +
            "join acceleration a on c.acceleration_id = a.id\n" +
            "where a.name = :name", nativeQuery = true)
    List<User> findByAccelerationName(@Param("name") String name);

    @Query(value = "select  u.* from users u\n" +
            "join candidate c on u.id = c.user_id\n" +
            "join company cp on c.company_id = cp.id\n" +
            "where cp.id = :companyId", nativeQuery = true)
    List<User> findByCompanyId(@Param("companyId") Integer companyId);
}
