package dao;

import dao.pojo.TBallLeague;
import dao.pojo.TBallLeagueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBallLeagueMapper {
    int countByExample(TBallLeagueExample example);

    int deleteByExample(TBallLeagueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBallLeague record);

    int insertSelective(TBallLeague record);

    List<TBallLeague> selectByExample(TBallLeagueExample example);

    TBallLeague selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBallLeague record, @Param("example") TBallLeagueExample example);

    int updateByExample(@Param("record") TBallLeague record, @Param("example") TBallLeagueExample example);

    int updateByPrimaryKeySelective(TBallLeague record);

    int updateByPrimaryKey(TBallLeague record);
}