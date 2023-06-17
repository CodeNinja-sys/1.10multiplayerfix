/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bp;
import com.a.a.d.br;
import com.a.a.d.i;
import java.util.Map;

class bq
extends i {
    final /* synthetic */ bp a;

    bq(bp bp2, int n2) {
        this.a = bp2;
        super(n2);
    }

    protected Map.Entry b(int n2) {
        return new br(this, n2);
    }

    @Override
    protected /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }
}

