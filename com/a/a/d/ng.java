/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.gd;
import java.util.Iterator;
import java.util.List;

final class ng
extends gd {
    final /* synthetic */ List a;
    final /* synthetic */ int b;

    ng(List list, int n2) {
        this.a = list;
        this.b = n2;
    }

    public Iterator iterator() {
        int n2 = Math.min(this.a.size(), this.b);
        return this.a.subList(n2, this.a.size()).iterator();
    }
}

