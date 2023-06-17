/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aai;
import com.a.a.d.ci;
import com.a.a.d.gh;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.d.lo;
import java.util.Collection;
import java.util.List;
import java.util.Set;

final class aah
extends gh
implements Set {
    private final transient jl a;
    private final transient ci b;

    static Set a(List list) {
        Collection collection2;
        jn jn2 = new jn(list.size());
        for (Collection collection2 : list) {
            lo lo2 = lo.a(collection2);
            if (lo2.isEmpty()) {
                return lo.j();
            }
            jn2.c(lo2);
        }
        jl jl2 = jn2.b();
        collection2 = new aai(jl2);
        return new aah(jl2, new ci((jl)collection2));
    }

    private aah(jl jl2, ci ci2) {
        this.a = jl2;
        this.b = ci2;
    }

    @Override
    protected Collection b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aah) {
            aah aah2 = (aah)object;
            return this.a.equals(aah2.a);
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        int n2;
        int n3 = this.size() - 1;
        for (n2 = 0; n2 < this.a.size(); ++n2) {
            n3 *= 31;
            n3 = ~(~n3);
        }
        n2 = 1;
        for (Set set : this.a) {
            n2 = 31 * n2 + this.size() / set.size() * set.hashCode();
            n2 = ~(~n2);
        }
        return ~(~(n2 += n3));
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.b();
    }
}

