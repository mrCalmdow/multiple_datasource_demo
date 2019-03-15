package com.flchen.multiple_datasource_demo.repo.mysql;

import com.flchen.multiple_datasource_demo.entity.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author feilongchen
 * @since 2019-01-29 4:12 PM
 */
@Repository
public interface UserAutoRepo extends JpaRepository<UserDO, Long> {

}
