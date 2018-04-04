package dao;

import dao.pojo.TTransfer;
import dao.pojo.TTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTransferMapper {
    long countByExample(TTransferExample example);

    int deleteByExample(TTransferExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TTransfer record);

    int insertSelective(TTransfer record);

    List<TTransfer> selectByExample(TTransferExample example);

    TTransfer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TTransfer record, @Param("example") TTransferExample example);

    int updateByExample(@Param("record") TTransfer record, @Param("example") TTransferExample example);

    int updateByPrimaryKeySelective(TTransfer record);

    int updateByPrimaryKey(TTransfer record);
}