package com.ijpay.wxpay.enums;

/**
 * <p>IJPay 让支付触手可及，封装了微信支付、支付宝支付、银联支付、PayPal 等常用的支付方式以及各种常用的接口。</p>
 *
 * <p>不依赖任何第三方 mvc 框架，仅仅作为工具使用简单快速完成支付模块的开发，可轻松嵌入到任何系统里。 </p>
 *
 * <p>IJPay 交流群: 723992875</p>
 *
 * <p>Node.js 版: https://gitee.com/javen205/TNWX</p>
 *
 * <p>银行编号列表枚举</p>
 *
 * @author Javen
 */
public enum BankCode {
    /**
     * 工商银行
     */
    BK_1002("1002"),
    /**
     * 农业银行
     */
    BK_1005("1005"),
    /**
     * 建设银行
     */
    BK_1003("1003"),
    /**
     * 中国银行
     */
    BK_1026("1026"),
    /**
     * 交通银行
     */
    BK_1020("1020"),
    /**
     * 招商银行
     */
    BK_1001("1001"),
    /**
     * 邮储银行
     */
    BK_1066("1066"),
    /**
     * 民生银行
     */
    BK_1006("1006"),
    /**
     * 平安银行
     */
    BK_1010("1010"),
    /**
     * 中信银行
     */
    BK_1021("1021"),
    /**
     * 浦发银行
     */
    BK_1004("1004"),
    /**
     * 兴业银行
     */
    BK_1009("1009"),
    /**
     * 光大银行
     */
    BK_1022("1022"),
    /**
     * 广发银行
     */
    BK_1027("1027"),
    /**
     * 华夏银行
     */
    BK_1025("1025"),
    /**
     * 宁波银行
     */
    BK_1056("1056"),
    /**
     * 北京银行
     */
    BK_4836("4836"),
    /**
     * 上海银行
     */
    BK_1024("1024"),
    /**
     * 南京银行
     */
    BK_1054("1054"),
    /**
     * 长子县融汇村镇银行
     */
    BK_4755("4755"),
    /**
     * 长沙银行
     */
    BK_4216("4216"),
    /**
     * 浙江泰隆商业银行
     */
    BK_4051("4051"),
    /**
     * 中原银行
     */
    BK_4753("4753"),
    /**
     * 企业银行（中国）
     */
    BK_4761("4761"),
    /**
     * 顺德农商银行
     */
    BK_4036("4036"),
    /**
     * 衡水银行
     */
    BK_4752("4752"),
    /**
     * 长治银行
     */
    BK_4756("4756"),
    /**
     * 大同银行
     */
    BK_4767("4767"),
    /**
     * 河南省农村信用社
     */
    BK_4115("4115"),
    /**
     * 宁夏黄河农村商业银行
     */
    BK_4150("4150"),
    /**
     * 山西省农村信用社
     */
    BK_4156("4156"),
    /**
     * 安徽省农村信用社
     */
    BK_4166("4166"),
    /**
     * 甘肃省农村信用社
     */
    BK_4157("4157"),
    /**
     * 天津农村商业银行
     */
    BK_4153("4153"),
    /**
     * 广西壮族自治区农村信用社
     */
    BK_4113("4113"),
    /**
     * 陕西省农村信用社
     */
    BK_4108("4108"),
    /**
     * 深圳农村商业银行
     */
    BK_4076("4076"),
    /**
     * 宁波鄞州农村商业银行
     */
    BK_4052("4052"),
    /**
     * 浙江省农村信用社联合社
     */
    BK_4764("4764"),
    /**
     * 江苏省农村信用社联合社
     */
    BK_4217("4217"),
    /**
     * 江苏紫金农村商业银行股份有限公司
     */
    BK_4072("4072"),
    /**
     * 北京中关村银行股份有限公司
     */
    BK_4769("4769"),
    /**
     * 星展银行（中国）有限公司
     */
    BK_4778("4778"),
    /**
     * 枣庄银行股份有限公司
     */
    BK_4766("4766"),
    /**
     * 海口联合农村商业银行股份有限公司
     */
    BK_4758("4758"),
    /**
     * 南洋商业银行（中国）有限公司
     */
    BK_4763("4763");


    private final String code;

    BankCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
