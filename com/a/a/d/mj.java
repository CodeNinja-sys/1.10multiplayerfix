/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aax;
import com.a.a.d.adv;
import com.a.a.d.adw;
import com.a.a.d.aea;
import com.a.a.d.mi;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.zr;
import java.util.Comparator;
import java.util.List;

public final class mj {
    private final List a = ov.a();
    private Comparator b;
    private Comparator c;

    public mj a(Comparator comparator) {
        this.b = (Comparator)cl.a(comparator);
        return this;
    }

    public mj b(Comparator comparator) {
        this.c = (Comparator)cl.a(comparator);
        return this;
    }

    public mj a(Object object, Object object2, Object object3) {
        this.a.add(mi.c(object, object2, object3));
        return this;
    }

    public mj a(adw adw2) {
        if (adw2 instanceof aea) {
            cl.a(adw2.a());
            cl.a(adw2.b());
            cl.a(adw2.c());
            adw adw3 = adw2;
            this.a.add(adw3);
        } else {
            this.a(adw2.a(), adw2.b(), adw2.c());
        }
        return this;
    }

    public mj a(adv adv2) {
        for (adw adw2 : adv2.e()) {
            this.a(adw2);
        }
        return this;
    }

    public mi a() {
        int n2 = this.a.size();
        switch (n2) {
            case 0: {
                return mi.m();
            }
            case 1: {
                return new aax((adw)mq.d(this.a));
            }
        }
        return zr.a(this.a, this.b, this.c);
    }
}

