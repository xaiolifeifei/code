package com.maqh.demo.service.impl;

import com.maqh.demo.entity.WorkOrderRecord;
import com.maqh.demo.mapper.WorkOrderRecordMapper;
import com.maqh.demo.service.WorkOrderRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * <p>
 * 工单记录 服务实现类
 * </p>
 *
 * @author liyonli
 * @since 2023-05-29
 */
@Service
public class WorkOrderRecordServiceImpl extends ServiceImpl<WorkOrderRecordMapper, WorkOrderRecord> implements WorkOrderRecordService {

    @Override
    public  IPage<WorkOrderRecord> findListByPage(Integer page, Integer pageCount){
        IPage<WorkOrderRecord> wherePage = new Page<>(page, pageCount);
        WorkOrderRecord where = new WorkOrderRecord();

        return   baseMapper.selectPage(wherePage, Wrappers.query(where));
    }

    @Override
    public int add(WorkOrderRecord workOrderRecord){
        return baseMapper.insert(workOrderRecord);
    }

    @Override
    public int delete(Long id){
        return baseMapper.deleteById(id);
    }

    @Override
    public int updateData(WorkOrderRecord workOrderRecord){
        return baseMapper.updateById(workOrderRecord);
    }

    @Override
    public WorkOrderRecord findById(Long id){
        return  baseMapper.selectById(id);
    }
}
