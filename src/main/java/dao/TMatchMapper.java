package dao;

import dao.pojo.TMatch;
import dao.pojo.TMatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMatchMapper {
    long countByExample(TMatchExample example);

    int deleteByExample(TMatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMatch record);

    int insertSelective(TMatch record);

    List<TMatch> selectByExample(TMatchExample example);

    TMatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMatch record, @Param("example") TMatchExample example);

    int updateByExample(@Param("record") TMatch record, @Param("example") TMatchExample example);

    int updateByPrimaryKeySelective(TMatch record);

    int updateByPrimaryKey(TMatch record);
}