package com.czz.test.repo;


import com.czz.test.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : czz
 * @version : 1.0.0
 * @create : 2020-08-15 18:00:00
 * @description :
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
