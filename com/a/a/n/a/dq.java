/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.dl;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public interface dq
extends ExecutorService {
    public dl b(Callable var1);

    public dl a(Runnable var1);

    public dl b(Runnable var1, Object var2);

    public List invokeAll(Collection var1);

    public List invokeAll(Collection var1, long var2, TimeUnit var4);
}

