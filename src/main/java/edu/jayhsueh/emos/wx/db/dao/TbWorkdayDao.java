package edu.jayhsueh.emos.wx.db.dao;

import edu.jayhsueh.emos.wx.db.pojo.TbWorkday;

public interface TbWorkdayDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbWorkday record);

    int insertSelective(TbWorkday record);

    TbWorkday selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbWorkday record);

    int updateByPrimaryKey(TbWorkday record);
}