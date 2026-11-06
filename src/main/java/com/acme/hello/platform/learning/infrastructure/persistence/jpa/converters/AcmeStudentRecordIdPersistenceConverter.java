package com.acme.hello.platform.learning.infrastructure.persistence.jpa.converters;

import com.acme.hello.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class AcmeStudentRecordIdPersistenceConverter implements AttributeConverter<AcmeStudentRecordId, String> {
    @Override
    public String convertToDatabaseColumn(AcmeStudentRecordId attribute) {
        return attribute == null ? null : attribute.StudentRecordId();
    }

    @Override
    public AcmeStudentRecordId convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new AcmeStudentRecordId(dbData);
    }
}
