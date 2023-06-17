/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.c;
import a.a.a.a.c.v;

public abstract class a
extends c
implements v {
    protected a() {
    }

    @Override
    public int a(int n2) {
        int n3 = n2;
        while (n3-- != 0 && this.hasPrevious()) {
            this.previous();
        }
        return n2 - n3 - 1;
    }
}

