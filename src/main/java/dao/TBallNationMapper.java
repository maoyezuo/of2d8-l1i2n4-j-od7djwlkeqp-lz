package dao;

import dao.pojo.TBallNation;
import dao.pojo.TBallNationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBallNationMapper {
    int countByExample(TBallNationExample example);

    int deleteByExample(TBallNationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TBallNation record);

    int insertSelective(TBallNation record);

    List<TBallNation> selectByExample(TBallNationExample example);

    TBallNation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TBallNation record, @Param("example") TBallNationExample example);

    int updateByExample(@Param("record") TBallNation record, @Param("example") TBallNationExample example);

    int updateByPrimaryKeySelective(TBallNation record);

    int updateByPrimaryKey(TBallNation record);
}