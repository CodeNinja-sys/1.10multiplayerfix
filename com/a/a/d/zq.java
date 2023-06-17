/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aaz;
import com.a.a.d.aba;
import com.a.a.d.abc;
import com.a.a.d.abg;
import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.lv;
import com.a.a.d.me;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.yd;
import com.a.a.d.yi;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

final class zq
extends me {
    private final transient jl a;

    zq(jl jl2, Comparator comparator) {
        super(comparator);
        this.a = jl2;
        cl.a(!jl2.isEmpty());
    }

    @Override
    public agi aO_() {
        return this.a.aO_();
    }

    @Override
    public agi d() {
        return this.a.f().aO_();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean contains(Object object) {
        try {
            return object != null && this.f(object) >= 0;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection collection) {
        if (collection instanceof xc) {
            collection = ((xc)collection).d();
        }
        if (!aaz.a(this.comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        yi yi2 = nj.k(this.aO_());
        Iterator iterator = collection.iterator();
        Object e2 = iterator.next();
        try {
            while (yi2.hasNext()) {
                int n2 = this.c(yi2.a(), e2);
                if (n2 < 0) {
                    yi2.next();
                    continue;
                }
                if (n2 == 0) {
                    if (!iterator.hasNext()) {
                        return true;
                    }
                    e2 = iterator.next();
                    continue;
                }
                if (n2 <= 0) continue;
                return false;
            }
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        return false;
    }

    private int f(Object object) {
        return Collections.binarySearch(this.a, object, this.f());
    }

    @Override
    boolean a() {
        return this.a.a();
    }

    @Override
    int a(Object[] arrobject, int n2) {
        return this.a.a(arrobject, n2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set)object;
        if (this.size() != set.size()) {
            return false;
        }
        if (aaz.a(this.c, set)) {
            Iterator iterator = set.iterator();
            try {
                agi agi2 = this.aO_();
                while (agi2.hasNext()) {
                    Object e2 = agi2.next();
                    Object e3 = iterator.next();
                    if (e3 != null && this.c(e2, e3) == 0) continue;
                    return false;
                }
                return true;
            }
            catch (ClassCastException classCastException) {
                return false;
            }
            catch (NoSuchElementException noSuchElementException) {
                return false;
            }
        }
        return this.containsAll((Collection)set);
    }

    @Override
    public Object first() {
        return this.a.get(0);
    }

    @Override
    public Object last() {
        return this.a.get(this.size() - 1);
    }

    @Override
    public Object lower(Object object) {
        int n2 = this.e(object, false) - 1;
        return n2 == -1 ? null : this.a.get(n2);
    }

    @Override
    public Object floor(Object object) {
        int n2 = this.e(object, true) - 1;
        return n2 == -1 ? null : this.a.get(n2);
    }

    @Override
    public Object ceiling(Object object) {
        int n2 = this.f(object, true);
        return n2 == this.size() ? null : this.a.get(n2);
    }

    @Override
    public Object higher(Object object) {
        int n2 = this.f(object, false);
        return n2 == this.size() ? null : this.a.get(n2);
    }

    @Override
    me b(Object object, boolean bl2) {
        return this.a(0, this.e(object, bl2));
    }

    int e(Object object, boolean bl2) {
        return aba.a((List)this.a, cl.a(object), this.comparator(), bl2 ? abg.d : abg.c, abc.b);
    }

    @Override
    me a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.a(object, bl2).b(object2, bl3);
    }

    @Override
    me a(Object object, boolean bl2) {
        return this.a(this.f(object, bl2), this.size());
    }

    int f(Object object, boolean bl2) {
        return aba.a((List)this.a, cl.a(object), this.comparator(), bl2 ? abg.c : abg.d, abc.b);
    }

    Comparator f() {
        return this.c;
    }

    me a(int n2, int n3) {
        if (n2 == 0 && n3 == this.size()) {
            return this;
        }
        if (n2 < n3) {
            return new zq(this.a.a(n2, n3), this.c);
        }
        return zq.a(this.c);
    }

    @Override
    int c(Object object) {
        int n2;
        if (object == null) {
            return -1;
        }
        try {
            n2 = aba.a((List)this.a, object, this.f(), abg.a, abc.c);
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
        return n2 >= 0 ? n2 : -1;
    }

    @Override
    jl m() {
        return new lv(this, this.a);
    }

    @Override
    me e() {
        return new zq(this.a.f(), yd.a(this.c).a());
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

