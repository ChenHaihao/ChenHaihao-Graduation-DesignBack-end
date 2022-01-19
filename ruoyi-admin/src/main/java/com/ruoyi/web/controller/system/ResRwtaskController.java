package com.ruoyi.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.ResRwtask;
import com.ruoyi.system.service.IResRwtaskService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 任务Controller
 * 
 * @author chenhaihao
 * @date 2021-03-26
 */
@RestController
@RequestMapping("/system/rwtask")
public class ResRwtaskController extends BaseController
{
    @Autowired
    private IResRwtaskService resRwtaskService;

    /**
     * 查询任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:rwtask:list')")
    @GetMapping("/list")
    public TableDataInfo list(ResRwtask resRwtask)
    {
        startPage();
        List<ResRwtask> list = resRwtaskService.selectResRwtaskList(resRwtask);
        return getDataTable(list);
    }

    /**
     * 导出任务列表
     */
    @PreAuthorize("@ss.hasPermi('system:rwtask:export')")
    @Log(title = "任务", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(ResRwtask resRwtask)
    {
        List<ResRwtask> list = resRwtaskService.selectResRwtaskList(resRwtask);
        ExcelUtil<ResRwtask> util = new ExcelUtil<ResRwtask>(ResRwtask.class);
        return util.exportExcel(list, "rwtask");
    }

    /**
     * 获取任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:rwtask:query')")
    @GetMapping(value = "/{rwtaskId}")
    public AjaxResult getInfo(@PathVariable("rwtaskId") Long rwtaskId)
    {
        return AjaxResult.success(resRwtaskService.selectResRwtaskById(rwtaskId));
    }

    /**
     * 新增任务
     */
    @PreAuthorize("@ss.hasPermi('system:rwtask:add')")
    @Log(title = "任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ResRwtask resRwtask)
    {
        return toAjax(resRwtaskService.insertResRwtask(resRwtask));
    }

    /**
     * 修改任务
     */
    @PreAuthorize("@ss.hasPermi('system:rwtask:edit')")
    @Log(title = "任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ResRwtask resRwtask)
    {
        return toAjax(resRwtaskService.updateResRwtask(resRwtask));
    }

    /**
     * 删除任务
     */
    @PreAuthorize("@ss.hasPermi('system:rwtask:remove')")
    @Log(title = "任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rwtaskIds}")
    public AjaxResult remove(@PathVariable Long[] rwtaskIds)
    {
        return toAjax(resRwtaskService.deleteResRwtaskByIds(rwtaskIds));
    }
}
