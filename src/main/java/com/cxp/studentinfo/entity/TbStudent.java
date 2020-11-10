package com.cxp.studentinfo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cxp
 * @since 2020-11-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("name")
    private String name;

    @TableField("age")
    private String age;

    @TableField("sex")
    private String sex;

    @TableField("datainsuserid")
    private String datainsuserid;

    @TableField("datainstime")
    private LocalDateTime datainstime;

}
