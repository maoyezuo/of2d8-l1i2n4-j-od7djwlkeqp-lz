package dao;

import dao.pojo.TBallTeam;
import dao.pojo.TBallTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBallTeamMapper {
    long countByExample(TBallTeamExample example);

    int deleteByExample(TBallTeamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBallTeam record);

    int insertSelective(TBallTeam record);

    List<TBallTeam> selectByExample(TBallTeamExample example);

    TBallTeam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBallTeam record, @Param("example") TBallTeamExample example);

    int updateByExample(@Param("record") TBallTeam record, @Param("example") TBallTeamExample example);

    int updateByPrimaryKeySelective(TBallTeam record);

    int updateByPrimaryKey(TBallTeam record);
}