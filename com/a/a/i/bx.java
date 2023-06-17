/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.cb;

final class bx
implements cb {
    final /* synthetic */ StringBuilder a;

    bx(StringBuilder stringBuilder) {
        this.a = stringBuilder;
    }

    @Override
    public void a(char c2) {
        this.a.append(c2);
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    public String toString() {
        return this.a.toString();
    }
}

