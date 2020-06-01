package com.jesper.seckill.redis;

import com.rabbitmq.client.AMQP;

public class AccessKey extends BasePrefix {
    private AccessKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
    public static AccessKey withExpire(int expireEsconds) {
        return new AccessKey(expireEsconds, "access");
    }

    public static AccessKey access = new AccessKey(5,"access");

}
