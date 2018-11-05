package com.nf2.Pet_dome.dao;

import com.nf2.Pet_dome.entity.PPet;
import java.util.List;

public interface PPetMapper {
    int deleteByPrimaryKey(Integer p_Id);

    int insert(PPet record);

    PPet selectByPrimaryKey(Integer p_Id);

    List<PPet> selectAll();

    int updateByPrimaryKey(PPet record);
}