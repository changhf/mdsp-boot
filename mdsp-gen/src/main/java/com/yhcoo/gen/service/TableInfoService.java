package com.yhcoo.gen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhcoo.gen.model.entity.TableInfo;
import com.yhcoo.gen.model.query.TableInfoQuery;


public interface TableInfoService extends IService<TableInfo> {

    /**
     * 分页查询表信息
     * @param query
     * @return
     */
    TableInfoQuery pageByQuery(TableInfoQuery query);

    /**
     * 查询单个表信息
     * @param tableName
     * @return
     */
    TableInfo getOne(String tableName);

}
