package com.wwl.sys.user.mapper;

import com.wwl.sys.user.domain.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author WangWenlong 2021/6/18
 */
@Repository
public interface UserMapper {
    /**
     * 123
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 123
     * @param user
     * @return
     */
    int insert(User user);
}
