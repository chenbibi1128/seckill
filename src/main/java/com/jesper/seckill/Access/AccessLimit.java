package com.jesper.seckill.Access;

import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  ///注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target(METHOD)  //定义注解的作用目标为方法
public @interface AccessLimit {
    int seconds();  //固定时长
    int maxCount();  //最大访问次数
    boolean needLogin() default true;  //是否需要登陆

}
