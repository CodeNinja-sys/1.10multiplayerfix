/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.b.bl;
import com.a.a.b.cc;
import com.a.a.d.hu;
import com.a.a.d.qw;
import com.a.a.d.qy;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

abstract class ht {
    qw a;

    ht() {
    }

    abstract ht a(aw var1);

    public abstract ht a(int var1);

    abstract ht b(int var1);

    public abstract ht c(int var1);

    public abstract ht a();

    public abstract ht b();

    public abstract ht c();

    abstract ht a(long var1, TimeUnit var3);

    abstract ht b(long var1, TimeUnit var3);

    qw d() {
        return (qw)cc.b(this.a, hu.a);
    }

    public abstract ConcurrentMap e();

    abstract qy f();

    abstract ConcurrentMap a(bl var1);
}

