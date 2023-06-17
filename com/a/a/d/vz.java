/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.abs;
import com.a.a.d.vi;
import com.a.a.d.vu;
import com.a.a.d.wc;
import com.a.a.d.wd;
import com.a.a.d.we;
import java.util.Comparator;

class vz
extends wc {
    final /* synthetic */ Comparator a;
    final /* synthetic */ vu b;

    vz(vu vu2, Comparator comparator) {
        this.b = vu2;
        this.a = comparator;
    }

    @Override
    public abs f() {
        return we.d(this.b.a(), new wd(this.a));
    }

    @Override
    public /* synthetic */ aac e() {
        return this.f();
    }

    @Override
    public /* synthetic */ vi d() {
        return this.f();
    }
}

