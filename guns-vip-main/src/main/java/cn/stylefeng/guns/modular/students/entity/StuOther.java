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
@TableName("stu_other")
public class StuOther implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 是否为独生子女
     */
    @TableField("only_child")
    private Integer onlyChild;

    /**
     * 是否烈士或优抚子女
     */
    @TableField("Martyr_children")
    private Integer martyrChildren;

    /**
     * 是否享受营养餐
     */
    @TableField("healthful_diet")
    private Integer healthfulDiet;

    /**
     * 是否建档立卡贫困户在校生
     */
    @TableField("put_on_record")
    private Integer putOnRecord;

      @TableId(value = "stu_number", type = IdType.ID_WORKER)
    private Long stuNumber;


    public Integer getOnlyChild() {
        return onlyChild;
    }

    public void setOnlyChild(Integer onlyChild) {
        this.onlyChild = onlyChild;
    }

    public Integer getMartyrChildren() {
        return martyrChildren;
    }

    public void setMartyrChildren(Integer martyrChildren) {
        this.martyrChildren = martyrChildren;
    }

    public Integer getHealthfulDiet() {
        return healthfulDiet;
    }

    public void setHealthfulDiet(Integer healthfulDiet) {
        this.healthfulDiet = healthfulDiet;
    }

    public Integer getPutOnRecord() {
        return putOnRecord;
    }

    public void setPutOnRecord(Integer putOnRecord) {
        this.putOnRecord = putOnRecord;
    }

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "StuOther{" +
        "onlyChild=" + onlyChild +
        ", martyrChildren=" + martyrChildren +
        ", healthfulDiet=" + healthfulDiet +
        ", putOnRecord=" + putOnRecord +
        ", stuNumber=" + stuNumber +
        "}";
    }
}
