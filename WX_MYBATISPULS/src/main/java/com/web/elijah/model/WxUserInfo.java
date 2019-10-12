package com.web.elijah.model;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @author:王旭
 * @date:2019/9/26 17:31
 * </p>
 * Description:
 */
@Data
public class WxUserInfo extends Model<WxUserInfo> implements Serializable {
    private static final long serialVersionUID = -5547069400363397041L;
    private int id;
    private String name;
}
