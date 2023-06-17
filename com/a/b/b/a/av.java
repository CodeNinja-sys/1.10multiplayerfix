/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.ap;
import com.a.b.c.a;
import com.a.b.k;

final class av
implements ap {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ an c;

    av(Class class_, Class class_2, an an2) {
        this.a = class_;
        this.b = class_2;
        this.c = an2;
    }

    public an a(k k2, a a2) {
        Class class_ = a2.a();
        return class_ == this.a || class_ == this.b ? this.c : null;
    }

    public String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}

