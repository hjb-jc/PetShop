package com.nf2.Pet_dome.dao;

import com.nf2.Pet_dome.entity.PUser;
import java.util.List;

public interface PUserMapper {
    int deleteByPrimaryKey(Integer u_Id);

    int insert(PUser record);

    PUser selectByPrimaryKey(Integer u_Id);

    List<PUser> selectAll();

    int updateByPrimaryKey(PUser record);

    PUser selByName(String name,String pwd);
}