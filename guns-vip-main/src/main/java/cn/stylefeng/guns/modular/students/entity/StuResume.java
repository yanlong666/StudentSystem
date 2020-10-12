package cn.stylefeng.guns.modular.students.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yl
 * @since 2020-10-10
 */
@TableName("stu_resume")
public class StuResume implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 政治面貌
     */
    @TableField("Political_Status")
    private Integer politicalStatus;

    /**
     * 特长
     */
    @TableField("hobby")
    private String hobby;

    /**
     * 主页地址
     */
    @TableField("principal_sheet")
    private String principalSheet;

    /**
     * 健康状况
     */
    @TableField("health_condition")
    private Integer healthCondition;

      @TableId(value = "stu_number", type = IdType.ID_WORKER)
    private Long stuNumber;


    public Integer getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPrincipalSheet() {
        return principalSheet;
    }

    public void setPrincipalSheet(String principalSheet) {
        this.principalSheet = principalSheet;
    }

    public Integer getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(Integer healthCondition) {
        this.healthCondition = healthCondition;
    }

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "StuResume{" +
        "politicalStatus=" + politicalStatus +
        ", hobby=" + hobby +
        ", principalSheet=" + principalSheet +
        ", healthCondition=" + healthCondition +
        ", stuNumber=" + stuNumber +
        "}";
    }
}
