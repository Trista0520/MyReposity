package com.trista.dao;

import com.trista.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    private User user = new User(16,"aaa","ddd");

    public List<User> getUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        insert(user);  //检测事物一致性
        delete(16);
        return mapper.getUser();
    }

    public int insert(User user) {
        return getSqlSession().getMapper(UserMapper.class).insert(user);
    }

    public int delete(int id) {
        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
