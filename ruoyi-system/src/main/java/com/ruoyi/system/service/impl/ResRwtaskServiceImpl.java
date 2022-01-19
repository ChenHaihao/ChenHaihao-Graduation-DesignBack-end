package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ResRwtaskMapper;
import com.ruoyi.system.domain.ResRwtask;
import com.ruoyi.system.service.IResRwtaskService;

/**
 * 任务Service业务层处理
 * 
 * @author chenhaihao
 * @date 2021-03-26
 */
@Service
public class ResRwtaskServiceImpl implements IResRwtaskService 
{
    @Autowired
    private ResRwtaskMapper resRwtaskMapper;

    /**
     * 查询任务
     * 
     * @param rwtaskId 任务ID
     * @return 任务
     */
    @Override
    public ResRwtask selectResRwtaskById(Long rwtaskId)
    {
        return resRwtaskMapper.selectResRwtaskById(rwtaskId);
    }

    /**
     * 查询任务列表
     * 
     * @param resRwtask 任务
     * @return 任务
     */
    @Override
    public List<ResRwtask> selectResRwtaskList(ResRwtask resRwtask)
    {
        return resRwtaskMapper.selectResRwtaskList(resRwtask);
    }

    /**
     * 新增任务
     * 
     * @param resRwtask 任务
     * @return 结果
     */
    @Override
    public int insertResRwtask(ResRwtask resRwtask)
    {
        resRwtask.setCreateTime(DateUtils.getNowDate());
        return resRwtaskMapper.insertResRwtask(resRwtask);
    }

    /**
     * 修改任务
     * 
     * @param resRwtask 任务
     * @return 结果
     */
    @Override
    public int updateResRwtask(ResRwtask resRwtask)
    {
        resRwtask.setUpdateTime(DateUtils.getNowDate());
        return resRwtaskMapper.updateResRwtask(resRwtask);
    }

    /**
     * 批量删除任务
     * 
     * @param rwtaskIds 需要删除的任务ID
     * @return 结果
     */
    @Override
    public int deleteResRwtaskByIds(Long[] rwtaskIds)
    {
        return resRwtaskMapper.deleteResRwtaskByIds(rwtaskIds);
    }

    /**
     * 删除任务信息
     * 
     * @param rwtaskId 任务ID
     * @return 结果
     */
    @Override
    public int deleteResRwtaskById(Long rwtaskId)
    {
        return resRwtaskMapper.deleteResRwtaskById(rwtaskId);
    }
}
