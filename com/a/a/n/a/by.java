/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.bc;
import com.a.a.n.a.cd;
import com.a.a.n.a.dl;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class by
extends cd
implements bc {
    @Override
    public Object a() {
        return this.d().a();
    }

    @Override
    public Object a(long l2, TimeUnit timeUnit) {
        return this.d().a(l2, timeUnit);
    }

    protected abstract bc d();

    @Override
    protected /* synthetic */ dl b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.d();
    }
}

