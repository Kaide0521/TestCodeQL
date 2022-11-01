package com.test.controller;

import com.github.pagehelper.PageInfo;
import com.test.model.AdviceVO;
import com.test.model.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.*;

@Api(value = "AdviceController RESTful", description = "")
@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {


    @ApiOperation(value = "query", notes = "")
    @GetMapping("/query")
    @RequiresPermissions("0105001")
    public ApiResult<PageInfo<AdviceVO>> conditionQuery(@RequestParam(value = "submiter", required = false) String submiter,
                                                        @RequestParam(value = "startDt", required = false) String startDt,
                                                        @RequestParam(value = "endDt", required = false) String endDt,
                                                        @RequestParam(value = "status", required = false) Integer status,
                                                        @RequestParam(value = "pageNum", required = false) Integer pageNum,
                                                        @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        PageInfo<AdviceVO> gueryResults = null;
        ApiResult<PageInfo<AdviceVO>> res = new ApiResult<>();

        return res;
    }
}
