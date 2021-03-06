package com.yhcoo.log.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yhcoo.log.model.entity.SysLog;
import com.yhcoo.log.model.query.SysLogQuery;

/**
 * <p>
 * 日志表 服务类
 * </p>
 */
public interface SysLogService extends IService<SysLog> {

    /**
     * 分页条件查询
     * @param query
     * @return
     */
    SysLogQuery pageByQuery(SysLogQuery query);

}
