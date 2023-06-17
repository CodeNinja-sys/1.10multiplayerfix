/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.n.a.cd;
import com.a.a.n.a.dl;
import java.util.concurrent.Future;

public abstract class ce
extends cd {
    private final dl a;

    protected ce(dl dl2) {
        this.a = (dl)cl.a(dl2);
    }

    @Override
    protected final dl b() {
        return this.a;
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

