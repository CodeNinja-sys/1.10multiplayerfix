/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.c.a;
import com.a.b.k;

final class au
implements ap {
    final /* synthetic */ Class a;
    final /* synthetic */ an b;

    au(Class class_, an an2) {
        this.a = class_;
        this.b = an2;
    }

    public an a(k k2, a a2) {
        return a2.a() == this.a ? this.b : null;
    }

    public String toString() {
        return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
    }
}

