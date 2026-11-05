package com.acme.hello.platform.learning.domain.repositories;

import com.acme.hello.platform.learning.domain.model.aggregate.Student;
import com.acme.hello.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import com.acme.hello.platform.learning.domain.model.valueobjects.ProfileId;

import java.util.Optional;

public interface StudentRepository extends ICrudRepository<Student, Long> {
    //Optional<Student> findById(String id);
    Optional<Student> findByAcmeStudentRecordId(AcmeStudentRecordId id);
    Optional<Student> findByProfileId(ProfileId profileId);
    //Student save(Student student);
    boolean existsByAcmeStudentRecordId(AcmeStudentRecordId id);
    boolean existsByProfileId(ProfileId profileId);
}
