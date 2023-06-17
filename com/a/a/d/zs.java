/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adw;
import java.util.Comparator;

final class zs
implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    zs(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    public int a(adw adw2, adw adw3) {
        int n2;
        int n3 = n2 = this.a == null ? 0 : this.a.compare(adw2.a(), adw3.a());
        if (n2 != 0) {
            return n2;
        }
        return this.b == null ? 0 : this.b.compare(adw2.b(), adw3.b());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((adw)object, (adw)object2);
    }
}

