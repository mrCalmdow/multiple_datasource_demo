package com.flchen.multiple_datasource_demo.dao.mongo.shop;

import com.flchen.multiple_datasource_demo.entity.shop.account.entity.UserAccountDO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author feilongchen
 * @since 2019-02-20 7:11 PM
 */
@Repository
public interface UserAccountAutoRepo extends MongoRepository<UserAccountDO, String> {

    UserAccountDO findByMobileAndEnableIsTrue(String mobile);
}
