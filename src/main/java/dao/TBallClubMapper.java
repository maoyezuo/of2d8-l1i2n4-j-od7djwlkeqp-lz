package dao;

import dao.pojo.TBallClub;
import dao.pojo.TBallClubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBallClubMapper {
    int countByExample(TBallClubExample example);

    int deleteByExample(TBallClubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TBallClub record);

    int insertSelective(TBallClub record);

    List<TBallClub> selectByExample(TBallClubExample example);

    TBallClub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TBallClub record, @Param("example") TBallClubExample example);

    int updateByExample(@Param("record") TBallClub record, @Param("example") TBallClubExample example);

    int updateByPrimaryKeySelective(TBallClub record);

    int updateByPrimaryKey(TBallClub record);
}