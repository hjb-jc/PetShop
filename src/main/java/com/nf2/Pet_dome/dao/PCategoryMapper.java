package com.nf2.Pet_dome.dao;

import com.nf2.Pet_dome.entity.PCategory;
import java.util.List;

public interface PCategoryMapper {
    int deleteByPrimaryKey(Integer c_Id);

    int insert(PCategory record);

    PCategory selectByPrimaryKey(Integer c_Id);

    List<PCategory> selectAll();

    int updateByPrimaryKey(PCategory record);
}