/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dn;
import com.a.a.n.a.dq;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface dr
extends dq,
ScheduledExecutorService {
    public dn a(Runnable var1, long var2, TimeUnit var4);

    public dn a(Callable var1, long var2, TimeUnit var4);

    public dn a(Runnable var1, long var2, long var4, TimeUnit var6);

    public dn b(Runnable var1, long var2, long var4, TimeUnit var6);
}

