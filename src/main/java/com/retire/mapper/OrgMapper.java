package com.retire.mapper;

import com.retire.pojo.Org;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrgMapper {
    int deleteByPrimaryKey(Short orgId);

    int insert(Org record);

    Org selectByPrimaryKey(Short orgId);

    List<Org> selectAll(@Param("tax_month") String tax_month, @Param("org_code_list")List<String> org_code_list);

    int updateByPrimaryKey(Org record);
}