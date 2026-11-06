package com.acme.hello.platform.learning.infrastructure.persistence.jpa.entities;

import com.acme.hello.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import com.acme.hello.platform.learning.domain.model.valueobjects.ProfileId;
import com.acme.hello.platform.learning.domain.model.valueobjects.StudentPerformanceMetricSet;
import com.acme.hello.platform.learning.infrastructure.persistence.jpa.converters.AcmeStudentRecordIdPersistenceConverter;
import com.acme.hello.platform.learning.infrastructure.persistence.jpa.converters.ProfileIdPersistenceConverter;
import com.acme.hello.platform.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="students")
@Getter
@Setter
@NoArgsConstructor
public class StudentPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Convert(converter = AcmeStudentRecordIdPersistenceConverter.class)
    @Column(name = "acme_student_record_id", nullable = false, unique = true)
    private AcmeStudentRecordId acmeStudentRecordId;

    @Convert(converter = ProfileIdPersistenceConverter.class)
    @Column(name = "profile_id", nullable = false)
    private ProfileId profileId;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "totalCompletedCourses", column =
            @Column(name = "total_completed_courses", nullable = false)),
            @AttributeOverride(name = "totalCompletedTutorials", column =
            @Column(name = "total_completed_tutorials", nullable = false))
    })
    private StudentPerformanceMetricSet performanceMetricSet;
}
