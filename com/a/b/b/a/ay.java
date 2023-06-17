/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.c.a;
import com.a.b.k;

final class ay
implements ap {
    final /* synthetic */ Class a;
    final /* synthetic */ an b;

    ay(Class class_, an an2) {
        this.a = class_;
        this.b = an2;
    }

    public an a(k k2, a a2) {
        return this.a.isAssignableFrom(a2.a()) ? this.b : null;
    }

    public String toString() {
        return "Factory[typeHierarchy=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
}

