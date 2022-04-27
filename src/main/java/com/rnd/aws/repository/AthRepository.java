package com.rnd.aws.repository;

import com.rnd.aws.document.AthDocument;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface AthRepository extends ElasticsearchRepository<AthDocument, String> {

    @Query("{\"match\": {\"?0\": \"?1\"}}")
    List<AthDocument> findByUsingQuery(String key, String value);
}
