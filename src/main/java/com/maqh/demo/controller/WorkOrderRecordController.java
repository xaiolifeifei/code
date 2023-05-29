package com.maqh.demo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.web.bind.annotation.*;
import com.maqh.demo.service.WorkOrderRecordService;
import com.maqh.demo.entity.WorkOrderRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.core.metadata.IPage;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 工单记录 前端控制器
 * </p>
 *
 * @author liyonli
 * @since 2023-05-29
 */
@Api(tags = {"工单记录"})
@RestController
@RequestMapping("api/tms/workOrderRecord")
public class WorkOrderRecordController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private WorkOrderRecordService workOrderRecordService;


    @ApiOperation(value = "新增工单记录")
    @PostMapping("/page")
    public int add(@RequestBody WorkOrderRecord workOrderRecord){
        return workOrderRecordService.add(workOrderRecord);
    }

    @ApiOperation(value = "删除工单记录")
    @PostMapping("/delete")
    public int delete(@PathVariable("id") Long id){
        return workOrderRecordService.delete(id);
    }

    @ApiOperation(value = "更新工单记录")
    @PostMapping("/update")
    public int update(@RequestBody WorkOrderRecord workOrderRecord){
        return workOrderRecordService.updateData(workOrderRecord);
    }

    @ApiOperation(value = "查询工单记录分页数据")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页码"),
        @ApiImplicitParam(name = "pageCount", value = "每页条数")
    })
    @PostMapping("/query")
    public IPage<WorkOrderRecord> findListByPage(@RequestParam Integer page,
                                   @RequestParam Integer pageCount){
        return workOrderRecordService.findListByPage(page, pageCount);
    }

    @ApiOperation(value = "id查询工单记录")
    @PostMapping("/getById")
    public WorkOrderRecord findById(@PathVariable Long id){
        return workOrderRecordService.findById(id);
    }

}
