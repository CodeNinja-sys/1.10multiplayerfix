/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.as;
import com.a.a.n.a.cd;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import java.util.concurrent.Future;

final class aq
extends cd {
    private final as a = new as(null);
    private final dl b = ci.a((dl)this.a);

    public static aq a() {
        return new aq();
    }

    private aq() {
    }

    @Override
    protected dl b() {
        return this.b;
    }

    public boolean a(dl dl2) {
        return this.a.a((dl)cl.a(dl2));
    }

    public boolean a(Object object) {
        return this.a(ci.a(object));
    }

    public boolean a(Throwable throwable) {
        return this.a(ci.a(throwable));
    }

    public boolean d() {
        return this.a.isDone();
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

