package com.jesper.seckill.Access;

import com.jesper.seckill.bean.User;

public class UserContext {

    //多线程时安全访问线程，和当前线程绑定，多线程时不存在线程冲突
    private static ThreadLocal<User> userHolder = new ThreadLocal<User>();

    public static void setUser(User user) {
        userHolder.set(user);
    }

    public static User getUser() {
        return userHolder.get();
    }


}
