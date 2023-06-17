/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.adv;
import com.a.a.d.bf;
import com.a.a.d.bm;
import com.a.a.d.bs;
import com.a.a.d.bt;
import com.a.a.d.bu;
import com.a.a.d.bv;
import com.a.a.d.jl;
import com.a.a.d.jt;
import com.a.a.d.ju;
import com.a.a.d.lo;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bl
extends bf
implements Serializable {
    private final jl a;
    private final jl b;
    private final jt c;
    private final jt d;
    private final Object[][] e;
    private transient bt f;
    private transient bv g;
    private static final long h = 0L;

    public static bl a(Iterable iterable, Iterable iterable2) {
        return new bl(iterable, iterable2);
    }

    public static bl b(adv adv2) {
        return adv2 instanceof bl ? new bl((bl)adv2) : new bl(adv2);
    }

    private bl(Iterable iterable, Iterable iterable2) {
        this.a = jl.a(iterable);
        this.b = jl.a(iterable2);
        cl.a(!this.a.isEmpty());
        cl.a(!this.b.isEmpty());
        this.c = bl.a(this.a);
        this.d = bl.a(this.b);
        Object[][] arrobject = new Object[this.a.size()][this.b.size()];
        this.e = arrobject;
        this.m();
    }

    private static jt a(List list) {
        ju ju2 = jt.n();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            ju2.b(list.get(i2), i2);
        }
        return ju2.b();
    }

    private bl(adv adv2) {
        this(adv2.a(), adv2.b());
        this.a(adv2);
    }

    private bl(bl bl2) {
        this.a = bl2.a;
        this.b = bl2.b;
        this.c = bl2.c;
        this.d = bl2.d;
        Object[][] arrobject = new Object[this.a.size()][this.b.size()];
        this.e = arrobject;
        this.m();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            System.arraycopy(bl2.e[i2], 0, arrobject[i2], 0, bl2.e[i2].length);
        }
    }

    public jl k() {
        return this.a;
    }

    public jl l() {
        return this.b;
    }

    public Object a(int n2, int n3) {
        cl.a(n2, this.a.size());
        cl.a(n3, this.b.size());
        return this.e[n2][n3];
    }

    public Object a(int n2, int n3, Object object) {
        cl.a(n2, this.a.size());
        cl.a(n3, this.b.size());
        Object object2 = this.e[n2][n3];
        this.e[n2][n3] = object;
        return object2;
    }

    public Object[][] a(Class class_) {
        Object[][] arrobject = (Object[][])Array.newInstance(class_, this.a.size(), this.b.size());
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            System.arraycopy(this.e[i2], 0, arrobject[i2], 0, this.e[i2].length);
        }
        return arrobject;
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }

    public void m() {
        for (Object[] arrobject : this.e) {
            Arrays.fill(arrobject, null);
        }
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.a(object) && this.b(object2);
    }

    @Override
    public boolean b(Object object) {
        return this.d.containsKey(object);
    }

    @Override
    public boolean a(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public boolean c(Object object) {
        Object[][] arrobject = this.e;
        int n2 = arrobject.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object[] arrobject2;
            for (Object object2 : arrobject2 = arrobject[i2]) {
                if (!cc.a(object, object2)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object b(Object object, Object object2) {
        Integer n2 = (Integer)this.c.get(object);
        Integer n3 = (Integer)this.d.get(object2);
        return n2 == null || n3 == null ? null : this.a(n2, n3);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        cl.a(object);
        cl.a(object2);
        Integer n2 = (Integer)this.c.get(object);
        cl.a(n2 != null, "Row %s not in %s", new Object[]{object, this.a});
        Integer n3 = (Integer)this.d.get(object2);
        cl.a(n3 != null, "Column %s not in %s", new Object[]{object2, this.b});
        return this.a(n2, n3, object3);
    }

    @Override
    public void a(adv adv2) {
        super.a(adv2);
    }

    @Override
    public Object c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public Object d(Object object, Object object2) {
        Integer n2 = (Integer)this.c.get(object);
        Integer n3 = (Integer)this.d.get(object2);
        if (n2 == null || n3 == null) {
            return null;
        }
        return this.a(n2, n3, (Object)null);
    }

    @Override
    public int n() {
        return this.a.size() * this.b.size();
    }

    @Override
    public Set e() {
        return super.e();
    }

    @Override
    Iterator g() {
        return new bm(this, this.n());
    }

    @Override
    public Map d(Object object) {
        cl.a(object);
        Integer n2 = (Integer)this.d.get(object);
        return n2 == null ? jt.m() : new bs(this, n2);
    }

    public lo o() {
        return this.d.g();
    }

    @Override
    public Map p() {
        bt bt2 = this.f;
        return bt2 == null ? (this.f = new bt(this, null)) : bt2;
    }

    @Override
    public Map e(Object object) {
        cl.a(object);
        Integer n2 = (Integer)this.c.get(object);
        return n2 == null ? jt.m() : new bu(this, n2);
    }

    public lo q() {
        return this.c.g();
    }

    @Override
    public Map r() {
        bv bv2 = this.g;
        return bv2 == null ? (this.g = new bv(this, null)) : bv2;
    }

    @Override
    public Collection h() {
        return super.h();
    }

    @Override
    public /* synthetic */ Set b() {
        return this.o();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.q();
    }

    static /* synthetic */ jl a(bl bl2) {
        return bl2.b;
    }

    static /* synthetic */ jl b(bl bl2) {
        return bl2.a;
    }

    static /* synthetic */ jt c(bl bl2) {
        return bl2.c;
    }

    static /* synthetic */ jt d(bl bl2) {
        return bl2.d;
    }
}

