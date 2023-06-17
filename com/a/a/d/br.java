/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.am;
import com.a.a.d.bq;

class br
extends am {
    final /* synthetic */ int a;
    final /* synthetic */ bq b;

    br(bq bq2, int n2) {
        this.b = bq2;
        this.a = n2;
    }

    @Override
    public Object getKey() {
        return this.b.a.a.a(this.a);
    }

    @Override
    public Object getValue() {
        return this.b.a.a.b(this.a);
    }

    @Override
    public Object setValue(Object object) {
        return this.b.a.a.a(this.a, object);
    }
}

