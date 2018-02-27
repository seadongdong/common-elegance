package com.yonyou.cloud.common.jwt;

/**
 * 共用JWT用户对象
 * 
 * @author BENJAMIN
 *
 */
public interface IJwtInfo {
    /**
     * 获取用户名
     * @return
     */
    String getUniqueName();

    /**
     * 获取用户ID
     * @return
     */
    String getId();

    /**
     * 获取名称
     * @return
     */
    String getName();

    /**
     * 获取名称
     * @return
     */
    String getDealerName();

    /**
     * 获取名称
     * @return
     */
    String getDealerCode();

    /**
     * 获取备注
     * @return
     */
    String getRemark();
}
