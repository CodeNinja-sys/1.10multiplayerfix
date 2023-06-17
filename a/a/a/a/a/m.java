/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cr;
import a.a.a.a.a.p;

public abstract class m
extends p
implements cr {
    protected m() {
    }

    @Override
    public int b() {
        return this.c();
    }

    public Integer c() {
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

