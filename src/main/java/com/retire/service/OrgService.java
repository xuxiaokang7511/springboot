package com.retire.service;

import com.github.pagehelper.PageInfo;
import com.retire.pojo.Org;

import java.util.List;

public interface OrgService {
    PageInfo<Org> selectAll(String tax_month, List<String> org_code_list);
}
