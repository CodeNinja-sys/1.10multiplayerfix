/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.cr;
import a.a.a.a.b.p;

public abstract class m
extends p
implements cr {
    protected m() {
    }

    @Override
    public long b() {
        return this.c();
    }

    public Long c() {
        return this.b();
    }

    @Override
    public int a(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasPrevious()) {
            this.b();
        }
        return n2 - n3 - 1;
    }

    @Override
    public /* synthetic */ Object previous() {
        return this.c();
    }
}

