/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.ds;
import java.util.concurrent.locks.Condition;

public abstract class dt {
    final ds b;
    final Condition c;
    int d = 0;
    dt e;

    protected dt(ds ds2) {
        this.b = (ds)cl.a(ds2, (Object)"monitor");
        this.c = ds.a(ds2).newCondition();
    }

    public abstract boolean a();
}

