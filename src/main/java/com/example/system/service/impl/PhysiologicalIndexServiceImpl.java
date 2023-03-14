package com.example.system.service.impl;

import com.example.system.entity.PhysiologicalIndex;
import com.example.system.mapper.PhysiologicalIndexMapper;
import com.example.system.service.IPhysiologicalIndexService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 创伤评分生理指标包含(现场,急救)两个方面,  检查的指标都是一样的, 是否需要标记来源?  服务实现类
 * </p>
 *
 * @author developerworks
 * @since 2023-03-14
 */
@Service
public class PhysiologicalIndexServiceImpl extends ServiceImpl<PhysiologicalIndexMapper, PhysiologicalIndex> implements IPhysiologicalIndexService {

}
