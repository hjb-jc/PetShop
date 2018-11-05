package com.nf2.Pet_dome.dao;

import com.nf2.Pet_dome.entity.POrder;
import java.util.List;

public interface POrderMapper {
    int deleteByPrimaryKey(Integer o_Id);

    int insert(POrder record);

    POrder selectByPrimaryKey(Integer o_Id);

    List<POrder> selectAll();

    int updateByPrimaryKey(POrder record);
}