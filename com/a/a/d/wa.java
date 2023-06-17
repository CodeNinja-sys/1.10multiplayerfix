/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aac;
import com.a.a.d.vi;
import com.a.a.d.vp;
import com.a.a.d.vu;
import com.a.a.d.wb;
import com.a.a.d.we;

class wa
extends wb {
    final /* synthetic */ Class a;
    final /* synthetic */ vu b;

    wa(vu vu2, Class class_) {
        this.b = vu2;
        this.a = class_;
    }

    @Override
    public aac e() {
        vp vp2 = new vp(this.a);
        return we.c(this.b.a(), vp2);
    }

    @Override
    public /* synthetic */ vi d() {
        return this.e();
    }
}

