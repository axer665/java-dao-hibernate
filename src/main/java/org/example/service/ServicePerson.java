package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.RepositoryPerson;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicePerson {
    private final RepositoryPerson repository;

    public List getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
