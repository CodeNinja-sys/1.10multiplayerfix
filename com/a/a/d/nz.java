/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ny;
import com.a.a.d.yi;
import java.util.Comparator;

class nz
implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ ny b;

    nz(ny ny2, Comparator comparator) {
        this.b = ny2;
        this.a = comparator;
    }

    public int a(yi yi2, yi yi3) {
        return this.a.compare(yi2.a(), yi3.a());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((yi)object, (yi)object2);
    }
}

