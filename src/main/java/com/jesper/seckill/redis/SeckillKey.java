package com.jesper.seckill.redis;

/**
 * Created by jiangyunxiong on 2018/5/29.
 */
public class SeckillKey extends BasePrefix {
    //public static KeyPrefix getMiaoshaVerifyCode;

    private SeckillKey(int expireSeconds, String prefix) {
        super(expireSeconds,prefix);
    }

    public static SeckillKey isGoodsOver = new SeckillKey(0,"go");
    public static SeckillKey getSeckillPath = new SeckillKey(60,"mp");
    public static SeckillKey getSeckillVerifyCode = new SeckillKey(300,"vc");
}
