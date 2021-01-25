package com.retire.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.retire.mapper.OrgMapper;
import com.retire.pojo.Org;
import com.retire.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgMapper orgMapper;

    public  PageInfo<Org>  selectAll(String tax_month, List<String> org_code_list){
        PageHelper.startPage(1, 50);
        List<Org> Org = orgMapper.selectAll(tax_month,org_code_list);
        PageInfo<Org> pageInfo = new PageInfo<>(Org);

        return pageInfo;
    }
}
