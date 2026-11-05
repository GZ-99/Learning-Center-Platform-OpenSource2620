package com.acme.hello.platform.learning.infrastructure.persistence.jpa.repositories;

import com.acme.hello.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import com.acme.hello.platform.learning.domain.model.valueobjects.ProfileId;
import com.acme.hello.platform.learning.infrastructure.persistence.jpa.entities.StudentPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentPersistenceRepository extends JpaRepository<StudentPersistenceEntity, Long> {
    Optional<StudentPersistenceEntity> findByAcmeStudentRecordId(AcmeStudentRecordId id);
    Optional<StudentPersistenceEntity> findByProfileId(ProfileId id);
    Boolean existsByAcmeStudentRecordId(AcmeStudentRecordId id);
    Boolean existsByProfileId(ProfileId id);
}
