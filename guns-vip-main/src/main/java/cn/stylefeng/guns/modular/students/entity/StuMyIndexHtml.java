package cn.stylefeng.guns.modular.students.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yl 
 * @since 2020-10-10
 */
@TableName("stu_my_index_html")
public class StuMyIndexHtml implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "stu_number", type = IdType.ID_WORKER)
    private Long stuNumber;


    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "StuMyIndexHtml{" +
        "stuNumber=" + stuNumber +
        "}";
    }
}
