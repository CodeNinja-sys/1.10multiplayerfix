/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ad;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public interface ab
extends Future {
    public boolean bo_();

    public boolean bp_();

    public Throwable bq_();

    public ab a_(ad var1);

    public ab a_(ad ... var1);

    public ab b_(ad var1);

    public ab b_(ad ... var1);

    public ab bl_();

    public ab bj_();

    public ab k();

    public ab bi_();

    public boolean a(long var1, TimeUnit var3);

    public boolean a_(long var1);

    public boolean b(long var1, TimeUnit var3);

    public boolean b(long var1);

    public Object bm_();

    @Override
    public boolean cancel(boolean var1);
}

