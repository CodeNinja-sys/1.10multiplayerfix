/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ax;
import io.netty.util.b.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface x
extends Iterable,
ScheduledExecutorService {
    public boolean br_();

    public ab m();

    public ab a(long var1, long var3, TimeUnit var5);

    public ab bs_();

    @Override
    public void shutdown();

    public List shutdownNow();

    public w c();

    public Iterator iterator();

    public ab b(Runnable var1);

    public ab a(Runnable var1, Object var2);

    public ab a(Callable var1);

    public ax a(Runnable var1, long var2, TimeUnit var4);

    public ax a(Callable var1, long var2, TimeUnit var4);

    public ax a(Runnable var1, long var2, long var4, TimeUnit var6);

    public ax b(Runnable var1, long var2, long var4, TimeUnit var6);
}

