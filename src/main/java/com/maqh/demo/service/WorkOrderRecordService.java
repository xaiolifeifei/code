package com.maqh.demo.service;

import com.maqh.demo.entity.WorkOrderRecord;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * <p>
 * 工单记录 服务类
 * </p>
 *
 * @author liyonli
 * @since 2023-05-29
 */
public interface WorkOrderRecordService extends IService<WorkOrderRecord> {

    /**
     * 查询工单记录分页数据
     *
     * @param page      页码
     * @param pageCount 每页条数
     * @return IPage<WorkOrderRecord>
     */
    IPage<WorkOrderRecord> findListByPage(Integer page, Integer pageCount);

    /**
     * 添加工单记录
     *
     * @param workOrderRecord 工单记录
     * @return int
     */
    int add(WorkOrderRecord workOrderRecord);

    /**
     * 删除工单记录
     *
     * @param id 主键
     * @return int
     */
    int delete(Long id);

    /**
     * 修改工单记录
     *
     * @param workOrderRecord 工单记录
     * @return int
     */
    int updateData(WorkOrderRecord workOrderRecord);

    /**
     * id查询数据
     *
     * @param id id
     * @return WorkOrderRecord
     */
    WorkOrderRecord findById(Long id);
}
