package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ResRwtask;

/**
 * 任务Service接口
 * 
 * @author ruoyi
 * @date 2021-03-26
 */
public interface IResRwtaskService 
{
    /**
     * 查询任务
     * 
     * @param rwtaskId 任务ID
     * @return 任务
     */
    public ResRwtask selectResRwtaskById(Long rwtaskId);

    /**
     * 查询任务列表
     * 
     * @param resRwtask 任务
     * @return 任务集合
     */
    public List<ResRwtask> selectResRwtaskList(ResRwtask resRwtask);

    /**
     * 新增任务
     * 
     * @param resRwtask 任务
     * @return 结果
     */
    public int insertResRwtask(ResRwtask resRwtask);

    /**
     * 修改任务
     * 
     * @param resRwtask 任务
     * @return 结果
     */
    public int updateResRwtask(ResRwtask resRwtask);

    /**
     * 批量删除任务
     * 
     * @param rwtaskIds 需要删除的任务ID
     * @return 结果
     */
    public int deleteResRwtaskByIds(Long[] rwtaskIds);

    /**
     * 删除任务信息
     * 
     * @param rwtaskId 任务ID
     * @return 结果
     */
    public int deleteResRwtaskById(Long rwtaskId);
}
