package com.acme.hello.platform.learning.infrastructure.persistence.jpa.entities;

import com.acme.hello.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import com.acme.hello.platform.shared.infrastructure.persistence.jpa.entities.AuditableAbstractPersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
public class StudentPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Column(name = "acme_student_record_id", nullable = false, unique = true)
    private AcmeStudentRecordId acmeStudentRecordId;
}
