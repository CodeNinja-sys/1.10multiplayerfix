/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.dh;
import a.a.a.a.a.p;

public class dr
extends p {
    protected final dh a;

    public dr(dh dh2) {
        this.a = dh2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public int a() {
        return this.a.a();
    }

    @Override
    public Integer d() {
        return (Integer)this.a.next();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.d();
    }
}

