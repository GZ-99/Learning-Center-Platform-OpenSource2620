package com.acme.hello.platform.learning.domain.repositories;

import com.acme.hello.platform.learning.domain.model.aggregate.Course;

public interface CourseRepository extends ICrudRepository<Course, Long> {
    //Logica especifica de la entidad Course, si es necesario, se puede agregar aquí. Por ejemplo, métodos de búsqueda específicos para Course.

}
