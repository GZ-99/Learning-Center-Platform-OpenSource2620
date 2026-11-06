package com.acme.hello.platform.learning.domain.model.valueobjects;

public record StudentPerformanceMetricSet(
        Integer totalCompletedCourses,
        Integer totalCompletedTutorials
) {
    public StudentPerformanceMetricSet() {
        this(0, 0);
    }
    public StudentPerformanceMetricSet {
        if (totalCompletedCourses == null || totalCompletedCourses < 0) {
            throw new IllegalArgumentException("Total completed courses cannot be null...");
        }
        if (totalCompletedTutorials == null || totalCompletedTutorials < 0) {
            throw new IllegalArgumentException("Total completed tutorials...");
        }
    }
}
