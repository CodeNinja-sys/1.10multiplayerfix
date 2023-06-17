/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.d.ov;
import com.a.a.i.ce;
import java.util.List;

final class bj
implements ce {
    final List a = ov.a();

    bj() {
    }

    @Override
    public boolean a(String string) {
        this.a.add(string);
        return true;
    }

    public List a() {
        return this.a;
    }

    @Override
    public /* synthetic */ Object b() {
        return this.a();
    }
}

