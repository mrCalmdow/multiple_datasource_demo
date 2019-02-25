package com.flchen.multiple_datasource_demo.dao.mongo.shop;

import com.flchen.multiple_datasource_demo.entity.shop.operation.entity.SharedDO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author feilongchen
 * @since 2019-02-20 5:17 PM
 */
@Repository
public interface SharedAutoRepo extends MongoRepository<SharedDO, String> {


}
