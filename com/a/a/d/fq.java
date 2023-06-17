/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cm;
import com.a.a.d.fp;
import com.a.a.d.xe;
import java.util.Collection;
import java.util.Map;

class fq
implements cm {
    final /* synthetic */ cm a;
    final /* synthetic */ fp b;

    fq(fp fp2, cm cm2) {
        this.b = fp2;
        this.a = cm2;
    }

    public boolean a(Map.Entry entry) {
        return this.a.a(xe.a(entry.getKey(), ((Collection)entry.getValue()).size()));
    }
}

