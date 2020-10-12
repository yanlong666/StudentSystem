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
@TableName("stu_sponsor")
public class StuSponsor implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 是否为留守儿童
     */
    @TableField("left_behind_children")
    private Integer leftBehindChildren;

    /**
     * 残疾类型
     */
    @TableField("disable_type")
    private Integer disableType;

    /**
     * 是否孤儿
     */
    @TableField("orphan")
    private Integer orphan;

    /**
     * 是否农村低保
     */
    @TableField("rural_dibao")
    private Integer ruralDibao;

    /**
     * 是否农村特困救助供养
     */
    @TableField("extremely_poor")
    private Integer extremelyPoor;

    /**
     * 是否单亲
     */
    @TableField("single_parent")
    private Integer singleParent;

    /**
     * 是否军人子女
     */
    @TableField("solder_children")
    private Integer solderChildren;

    /**
     * 家庭是否有其他重大致贫因素
     */
    @TableField("causes_of_poverty")
    private Integer causesOfPoverty;

    /**
     * 是否需要申请资助
     */
    @TableField("apply_sponsor")
    private Integer applySponsor;

    /**
     * 是否享受一补
     */
    @TableField("need_supply")
    private Integer needSupply;

      @TableId(value = "stu_number", type = IdType.ID_WORKER)
    private Long stuNumber;


    public Integer getLeftBehindChildren() {
        return leftBehindChildren;
    }

    public void setLeftBehindChildren(Integer leftBehindChildren) {
        this.leftBehindChildren = leftBehindChildren;
    }

    public Integer getDisableType() {
        return disableType;
    }

    public void setDisableType(Integer disableType) {
        this.disableType = disableType;
    }

    public Integer getOrphan() {
        return orphan;
    }

    public void setOrphan(Integer orphan) {
        this.orphan = orphan;
    }

    public Integer getRuralDibao() {
        return ruralDibao;
    }

    public void setRuralDibao(Integer ruralDibao) {
        this.ruralDibao = ruralDibao;
    }

    public Integer getExtremelyPoor() {
        return extremelyPoor;
    }

    public void setExtremelyPoor(Integer extremelyPoor) {
        this.extremelyPoor = extremelyPoor;
    }

    public Integer getSingleParent() {
        return singleParent;
    }

    public void setSingleParent(Integer singleParent) {
        this.singleParent = singleParent;
    }

    public Integer getSolderChildren() {
        return solderChildren;
    }

    public void setSolderChildren(Integer solderChildren) {
        this.solderChildren = solderChildren;
    }

    public Integer getCausesOfPoverty() {
        return causesOfPoverty;
    }

    public void setCausesOfPoverty(Integer causesOfPoverty) {
        this.causesOfPoverty = causesOfPoverty;
    }

    public Integer getApplySponsor() {
        return applySponsor;
    }

    public void setApplySponsor(Integer applySponsor) {
        this.applySponsor = applySponsor;
    }

    public Integer getNeedSupply() {
        return needSupply;
    }

    public void setNeedSupply(Integer needSupply) {
        this.needSupply = needSupply;
    }

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "StuSponsor{" +
        "leftBehindChildren=" + leftBehindChildren +
        ", disableType=" + disableType +
        ", orphan=" + orphan +
        ", ruralDibao=" + ruralDibao +
        ", extremelyPoor=" + extremelyPoor +
        ", singleParent=" + singleParent +
        ", solderChildren=" + solderChildren +
        ", causesOfPoverty=" + causesOfPoverty +
        ", applySponsor=" + applySponsor +
        ", needSupply=" + needSupply +
        ", stuNumber=" + stuNumber +
        "}";
    }
}
