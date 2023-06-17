/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.dh;
import a.a.a.a.b.p;

public class ds
extends p {
    protected final dh a;

    public ds(dh dh2) {
        this.a = dh2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public long a() {
        return this.a.a();
    }

    @Override
    public Long d() {
        return (Long)this.a.next();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.d();
    }
}

