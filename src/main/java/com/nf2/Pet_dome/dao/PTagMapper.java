package com.nf2.Pet_dome.dao;

import com.nf2.Pet_dome.entity.PTag;
import java.util.List;

public interface PTagMapper {
    int deleteByPrimaryKey(Integer t_Id);

    int insert(PTag record);

    PTag selectByPrimaryKey(Integer t_Id);

    List<PTag> selectAll();

    int updateByPrimaryKey(PTag record);
}