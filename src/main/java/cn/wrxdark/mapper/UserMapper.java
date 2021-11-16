package cn.wrxdark.mapper;

import cn.wrxdark.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{id}")
    User getById(@Param("id") long id);

    @Select("SELECT * FROM users LIMIT #{offset}, #{maxResults}")
    List<User> getAll(@Param("offset") int offset, @Param("maxResults") int maxResults);

    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO users (email, password, nickname, created_at) VALUES (#{user.email}, #{user.password}, #{user.nickname}, #{user.createdAt})")
    void insert(@Param("user") User user);

    @Update("UPDATE users SET nickname = #{user.nickname}, created_at = #{user.createdAt} WHERE id = #{user.id}")
    void update(@Param("user") User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteById(@Param("id") long id);
}
