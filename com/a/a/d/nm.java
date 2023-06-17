/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.i;

final class nm
extends i {
    final /* synthetic */ Object[] a;
    final /* synthetic */ int b;

    nm(int n2, int n3, Object[] arrobject, int n4) {
        this.a = arrobject;
        this.b = n4;
        super(n2, n3);
    }

    @Override
    protected Object a(int n2) {
        return this.a[this.b + n2];
    }
}

