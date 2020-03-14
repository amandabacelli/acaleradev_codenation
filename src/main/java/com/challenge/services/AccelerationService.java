package com.challenge.services;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AccelerationService {

    @Autowired(required=false)
    private AccelerationRepository repository;

    public Optional<Acceleration> findById(Integer id) {
        return repository.findById(id);
    }

    public List<Acceleration> findByCompanyId(Integer companyId) {
        return repository.findByCompanyId(companyId);
    }

    public Acceleration save(Acceleration object) {
        return repository.save(object);
    }
}
