package dao;

import dao.pojo.TBallPlayer;
import dao.pojo.TBallPlayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBallPlayerMapper {
    long countByExample(TBallPlayerExample example);

    int deleteByExample(TBallPlayerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBallPlayer record);

    int insertSelective(TBallPlayer record);

    List<TBallPlayer> selectByExample(TBallPlayerExample example);

    TBallPlayer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBallPlayer record, @Param("example") TBallPlayerExample example);

    int updateByExample(@Param("record") TBallPlayer record, @Param("example") TBallPlayerExample example);

    int updateByPrimaryKeySelective(TBallPlayer record);

    int updateByPrimaryKey(TBallPlayer record);
}