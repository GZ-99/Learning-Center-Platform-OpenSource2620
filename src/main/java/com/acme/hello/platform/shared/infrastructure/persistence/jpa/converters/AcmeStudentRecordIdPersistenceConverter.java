package com.acme.hello.platform.shared.infrastructure.persistence.jpa.converters;

import com.acme.hello.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import jakarta.persistence.AttributeConverter;

public class AcmeStudentRecordIdPersistenceConverter implements AttributeConverter<AcmeStudentRecordId, String> {
    @Override
    public String convertToDatabaseColumn(String dbData) {
        return dbData != null ? attribute.getValue() : null;
    }

    @Override
    public AcmeStudentRecordId convertToEntityAttribute(String dbData) {
        return dbData != null ? new AcmeStudentRecordId(dbData) : null;
    }
}
