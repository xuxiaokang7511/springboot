package com.retire.controller;

import com.github.pagehelper.PageInfo;
import com.retire.conf.MyException;
import com.retire.pojo.Result;
import com.retire.service.OrgService;
import com.retire.until.ResultEnum;
import com.retire.until.ResultUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class OrgController {

    @Autowired
    private OrgService orgService;


    @ApiOperation(value="根据url获取信息", notes="根据url获取信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "method", value = "方法不能为空，随便填", required = true, dataType = "java.util.String"),
            @ApiImplicitParam(name = "access_token", value = "签名验证不能为空，随便填", required = true, dataType = "java.util.String"),
            @ApiImplicitParam(name = "tax_month", value = "时间2021-1-30", required = true, dataType = "java.util.String"),
            @ApiImplicitParam(name = "org_code_list", value = "信用代码集合1,2", required = true, dataType = "java.util.List")
    })
    @GetMapping("info")
    public Result getSelectAll(String method, String access_token,@RequestParam(value = "tax_month")String tax_month, @RequestParam(value = "org_code_list") List<String> org_code_list){
        if (StringUtils.isEmpty(method) || StringUtils.isEmpty(access_token)) {
            throw new MyException(ResultEnum.TokenException);
        }else{
            PageInfo list=orgService.selectAll(tax_month,org_code_list);
            return ResultUtil.getSuccess(list.getList(),list.getTotal());
        }
    }


    @ApiOperation(value="根据url获取信息", notes="根据url获取信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "method", value = "方法不能为空，随便填", required = true, dataType = "java.util.String"),
            @ApiImplicitParam(name = "access_token", value = "签名验证不能为空，随便填", required = true, dataType = "java.util.String"),
            @ApiImplicitParam(name = "tax_month", value = "时间2021-1-30", required = true, dataType = "java.util.String"),
            @ApiImplicitParam(name = "org_code_list", value = "信用代码集合1,2", required = true, dataType = "java.util.List")
    })
    @PostMapping("info")
    public Result postSelectAll(String method, String access_token,@RequestParam(value = "tax_month")String tax_month, @RequestParam(value = "org_code_list") List<String> org_code_list){
        if (StringUtils.isEmpty(method) || StringUtils.isEmpty(access_token)) {
            throw new MyException(ResultEnum.ParamException);
        }else {
            PageInfo list = orgService.selectAll(tax_month, org_code_list);
            return ResultUtil.getSuccess(list.getList(), list.getTotal());
        }
    }


}
