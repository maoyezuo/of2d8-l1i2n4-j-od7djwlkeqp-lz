package dao;

import dao.pojo.TFavoritePlayer;
import dao.pojo.TFavoritePlayerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFavoritePlayerMapper {
    long countByExample(TFavoritePlayerExample example);

    int deleteByExample(TFavoritePlayerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFavoritePlayer record);

    int insertSelective(TFavoritePlayer record);

    List<TFavoritePlayer> selectByExample(TFavoritePlayerExample example);

    TFavoritePlayer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFavoritePlayer record, @Param("example") TFavoritePlayerExample example);

    int updateByExample(@Param("record") TFavoritePlayer record, @Param("example") TFavoritePlayerExample example);

    int updateByPrimaryKeySelective(TFavoritePlayer record);

    int updateByPrimaryKey(TFavoritePlayer record);
}