package com.hialan.dm.repository;

import com.hialan.dm.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User: Alan
 * Email: houlong.yang@shuyun.com
 * Date: 12:54 AM 8/08/2017
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
