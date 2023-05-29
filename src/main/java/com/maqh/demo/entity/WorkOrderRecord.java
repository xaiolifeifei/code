package com.maqh.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 工单记录
 * </p>
 *
 * @author liyonli
 * @since 2023-05-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("work_order_record")
@ApiModel(value="WorkOrderRecord对象", description="工单记录")
public class WorkOrderRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "工单记录ID")
    @TableField("WOR_ID")
    private String worId;

    @ApiModelProperty(value = "运单ID")
    @TableField("SHIPMENT_ID")
    private String shipmentId;

    @ApiModelProperty(value = "运单GID")
    @TableField("SHIPMENT_GID")
    private String shipmentGid;

    @ApiModelProperty(value = "工单ID")
    @TableField("WO_ID")
    private String woId;

    @ApiModelProperty(value = "操作")
    @TableField("WOR_OPERATE")
    private String worOperate;

    @ApiModelProperty(value = "工单类型 I-拉截,C-沟通")
    @TableField("WOR_TYPE")
    private String worType;

    @ApiModelProperty(value = "工单一级类型")
    @TableField("WOR_FIRST_TYPE")
    private String worFirstType;

    @ApiModelProperty(value = "工单二级类型")
    @TableField("WOR_SECOND_TYPE")
    private String worSecondType;

    @ApiModelProperty(value = "操作用户角色ID")
    @TableField("WOR_PROCESSING_ROLE_ID")
    private String worProcessingRoleId;

    @ApiModelProperty(value = "操作用户角色")
    @TableField("WOR_PROCESSING_ROLE")
    private String worProcessingRole;

    @ApiModelProperty(value = "操作用户ID")
    @TableField("WOR_PROCESSING_BY_ID")
    private String worProcessingById;

    @ApiModelProperty(value = "操作用户名")
    @TableField("WOR_PROCESSING_BY")
    private String worProcessingBy;

    @ApiModelProperty(value = "提交成功时间")
    @TableField("WOR_SUBMMIT_TIME")
    private Date worSubmmitTime;

    @ApiModelProperty(value = "工单描述")
    @TableField("WOR_WO_DESC")
    private String worWoDesc;

    @ApiModelProperty(value = "处理描述")
    @TableField("WOR_DESC")
    private String worDesc;

    @ApiModelProperty(value = "补充说明")
    @TableField("WOR_SUPPLEMENT")
    private String worSupplement;

    @ApiModelProperty(value = "撤销原因")
    @TableField("WOR_CANCEL_RESON")
    private String worCancelReson;

    @TableField("WOR_ATTACHMENT_ID")
    private String worAttachmentId;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATED_BY")
    private String createdBy;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATED_DATE")
    private Date createdDate;

    @ApiModelProperty(value = "更新人")
    @TableField("UPDATED_BY")
    private String updatedBy;

    @ApiModelProperty(value = "更新日期")
    @TableField("UPDATED_DATE")
    private Date updatedDate;

    @ApiModelProperty(value = "是否删除，0-未删除，1-已删除")
    @TableField("IS_DELETED")
    private Boolean isDeleted;

    @TableField("WOR_UDF1")
    private String worUdf1;

    @TableField("WOR_UDF2")
    private String worUdf2;

    @TableField("WOR_UDF3")
    private String worUdf3;

    @TableField("WOR_UDF4")
    private String worUdf4;

    @TableField("WOR_UDF5")
    private String worUdf5;

    @TableField("WOR_UDF6")
    private String worUdf6;

    @TableField("WOR_UDF7")
    private String worUdf7;

    @TableField("WOR_UDF8")
    private String worUdf8;

    @TableField("WOR_UDF9")
    private String worUdf9;

    @TableField("WOR_UDF10")
    private String worUdf10;

    @ApiModelProperty(value = "10-工单信息附件,20-处理信息附件")
    @TableField("ATTCHMENT_TYPE")
    private String attchmentType;

    @TableField("RETURN_NO")
    private String returnNo;

    @ApiModelProperty(value = "工单信息修改记录")
    @TableField("CHANGE_CONTENT")
    private String changeContent;


}
