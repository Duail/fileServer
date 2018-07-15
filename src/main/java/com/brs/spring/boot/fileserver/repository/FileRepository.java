package com.brs.spring.boot.fileserver.repository;

import com.brs.spring.boot.fileserver.domain.File;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<File, String> {
}
