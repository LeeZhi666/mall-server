package com.mmall.dao;

import com.mmall.pojo.AlarmMsg;
import com.mmall.pojo.Shipping;
import com.mmall.vo.AlarmMsgVo;
import com.mmall.vo.CaveatVo;
import com.mmall.vo.SingleStatisticsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlarmMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlarmMsg record);

    int insertSelective(AlarmMsg record);

    AlarmMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlarmMsg record);

    int updateByPrimaryKey(AlarmMsg record);


    List<AlarmMsg> getNewest();
    List<AlarmMsgVo> getTodayList();
    List<AlarmMsgVo> selectList();
//    List<AlarmMsg> selectByTime(@Param("timeNumber") Integer timeNumber,@Param("sortType") Integer sortType);
//    List<AlarmMsg> getListByMonth(@Param("timeNumber") Integer timeNumber,@Param("sortType") Integer sortType);
//    List<AlarmMsg> getListByYear(@Param("timeNumber") Integer timeNumber,@Param("sortType") Integer sortType);
    List<SingleStatisticsVo> getListByHour(@Param("timeNumber") Integer timeNumber,@Param("sortType") Integer sortType);
    List<SingleStatisticsVo> getListByTime(@Param("timeNumber") Integer timeNumber,@Param("sortType") Integer sortType);
    List<SingleStatisticsVo> getListByMonth(@Param("timeNumber") Integer timeNumber,@Param("sortType") Integer sortType);
    List<SingleStatisticsVo>  getListByYear(@Param("timeNumber") Integer timeNumber, @Param("sortType") Integer sortType);
    List<CaveatVo>  getCaveatByDay(@Param("timeNumber") Integer timeNumber);
    List<CaveatVo>  getCaveatByMonth(@Param("timeNumber") Integer timeNumber);
    List<CaveatVo>  getCaveatByYear(@Param("timeNumber") Integer timeNumber);
}