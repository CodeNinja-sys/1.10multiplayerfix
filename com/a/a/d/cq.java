/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.j;
import com.a.a.d.jl;
import com.a.a.d.ov;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

final class cq
extends j {
    List a;
    final Comparator b;

    cq(List list, Comparator comparator) {
        this.a = ov.a((Iterable)list);
        this.b = comparator;
    }

    protected List d() {
        if (this.a == null) {
            return (List)this.b();
        }
        jl jl2 = jl.a(this.a);
        this.e();
        return jl2;
    }

    void e() {
        int n2 = this.f();
        if (n2 == -1) {
            this.a = null;
            return;
        }
        int n3 = this.a(n2);
        Collections.swap(this.a, n2, n3);
        int n4 = this.a.size();
        Collections.reverse(this.a.subList(n2 + 1, n4));
    }

    int f() {
        for (int i2 = this.a.size() - 2; i2 >= 0; --i2) {
            if (this.b.compare(this.a.get(i2), this.a.get(i2 + 1)) >= 0) continue;
            return i2;
        }
        return -1;
    }

    int a(int n2) {
        Object e2 = this.a.get(n2);
        for (int i2 = this.a.size() - 1; i2 > n2; --i2) {
            if (this.b.compare(e2, this.a.get(i2)) >= 0) continue;
            return i2;
        }
        throw new AssertionError((Object)"this statement should be unreachable");
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

