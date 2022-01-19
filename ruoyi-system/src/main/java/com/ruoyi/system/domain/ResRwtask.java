package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 任务对象 res_rwtask
 * 
 * @author chenhaihao
 * @date 2021-03-26
 */
public class ResRwtask extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 任务id */
    private Long rwtaskId;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String rwname;

    /** 任务类型 */
    @Excel(name = "任务类型")
    private String rwtype;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endtime;

    /** 帐号状态（0正常 1停用） */
    @Excel(name = "账号状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setRwtaskId(Long rwtaskId) 
    {
        this.rwtaskId = rwtaskId;
    }

    public Long getRwtaskId() 
    {
        return rwtaskId;
    }
    public void setRwname(String rwname) 
    {
        this.rwname = rwname;
    }

    public String getRwname() 
    {
        return rwname;
    }
    public void setRwtype(String rwtype) 
    {
        this.rwtype = rwtype;
    }

    public String getRwtype() 
    {
        return rwtype;
    }
    public void setEndtime(Date endtime) 
    {
        this.endtime = endtime;
    }

    public Date getEndtime() 
    {
        return endtime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rwtaskId", getRwtaskId())
            .append("rwname", getRwname())
            .append("rwtype", getRwtype())
            .append("endtime", getEndtime())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
