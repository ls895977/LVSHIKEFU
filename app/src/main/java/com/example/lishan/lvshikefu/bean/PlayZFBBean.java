package com.example.lishan.lvshikefu.bean;

public class PlayZFBBean {

    /**
     * payType : alipayApp
     * data : alipay_sdk=alipay-sdk-php-20180705&amp;app_id=2019013163198335&amp;biz_content=%7B%22body%22%3A%22LiBaWall%5Cu652f%5Cu4ed8%5Cu5b9dApp%5Cu652f%5Cu4ed8%22%2C%22subject%22%3A%22%5Cu7984%5Cu9a6c%5Cu7f51%5Cu7edc%5Cu8ba2%5Cu5355%22%2C%22out_trade_no%22%3A%22L201902210601589655%22%2C%22timeout_express%22%3A%2230m%22%2C%22total_amount%22%3A0.01%7D&amp;charset=UTF-8&amp;format=json&amp;method=alipay.trade.app.pay&amp;notify_url=https%3A%2F%2Fwww.libawall.com%2Fgeneral%2Fpay%2Fnotifyurl%2Fpay_code%2FalipayApp.html&amp;sign_type=RSA2&amp;timestamp=2019-02-21+18%3A02%3A00&amp;version=1.0&amp;sign=L4xMwAqJTJVPYK4N8MIeAaSw31N91TA0iZncDmeag016DeM9NLigFq70h%2BX39a4%2Fv3B2iqFAZLtoKWFzgPe6%2FjckpHr6yW0jpfal99A6dZj%2BMbc5ViOehgqbaiIEarOGNYOVAoT8o0WAzUU05b4gMv403llaITZSASIbVsKWjKADDmd1%2BqAeoamxDkHrslteGtHbq8l7kXdyl2DC1VUekrNdoWnT2PVpv8JjVyCY0oATFzjUN5KbRNhfRG2Dx8x3qYrv19FFxVQyjRxwSNu0UolB6E%2BqRgXEI4RJ4aH2jQD8yNQR%2BWFLr%2Br7Vi9E9cS0%2BbM2jROtHmr7bFMiZn4nkg%3D%3D
     */

    private String payType;
    private String data;

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
