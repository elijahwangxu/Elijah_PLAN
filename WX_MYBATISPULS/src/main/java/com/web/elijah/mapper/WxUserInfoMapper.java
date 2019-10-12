package com.web.elijah.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.web.elijah.model.WxUserInfo;
import org.springframework.stereotype.Repository;

/**
 * @author:王旭
 * @date:2019/9/26 18:00
 * </p>
 * Description:
 */
@Repository(value = "wxUserInfoMapper")
public interface WxUserInfoMapper extends BaseMapper<WxUserInfo> {
}
