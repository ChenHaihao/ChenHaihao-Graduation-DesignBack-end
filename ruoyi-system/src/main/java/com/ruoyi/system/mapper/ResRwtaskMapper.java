package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ResRwtask;

/**
 * 任务Mapper接口
 * 
 * @author chenhaihao
 * @date 2021-03-26
 */
public interface ResRwtaskMapper 
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
     * 删除任务
     * 
     * @param rwtaskId 任务ID
     * @return 结果
     */
    public int deleteResRwtaskById(Long rwtaskId);

    /**
     * 批量删除任务
     * 
     * @param rwtaskIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteResRwtaskByIds(Long[] rwtaskIds);
}
