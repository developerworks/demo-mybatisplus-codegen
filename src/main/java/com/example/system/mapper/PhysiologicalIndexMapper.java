package com.example.system.mapper;

import com.example.system.entity.PhysiologicalIndex;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 创伤评分生理指标包含(现场,急救)两个方面,  检查的指标都是一样的, 是否需要标记来源?  Mapper 接口
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
public interface PhysiologicalIndexMapper extends BaseMapper<PhysiologicalIndex> {

}
