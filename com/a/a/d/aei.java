/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.d.adv;
import com.a.a.d.adx;
import com.a.a.d.hr;
import com.a.a.d.sz;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class aei
extends hr
implements Serializable {
    final adv a;
    private static final long b = 0L;

    aei(adv adv2) {
        this.a = (adv)cl.a(adv2);
    }

    @Override
    protected adv f() {
        return this.a;
    }

    @Override
    public Set e() {
        return Collections.unmodifiableSet(super.e());
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map d(Object object) {
        return Collections.unmodifiableMap(super.d(object));
    }

    @Override
    public Set b() {
        return Collections.unmodifiableSet(super.b());
    }

    @Override
    public Map p() {
        bl bl2 = adx.a();
        return Collections.unmodifiableMap(sz.a(super.p(), bl2));
    }

    @Override
    public Object a(Object object, Object object2, Object object3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(adv adv2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map e(Object object) {
        return Collections.unmodifiableMap(super.e(object));
    }

    @Override
    public Set a() {
        return Collections.unmodifiableSet(super.a());
    }

    @Override
    public Map r() {
        bl bl2 = adx.a();
        return Collections.unmodifiableMap(sz.a(super.r(), bl2));
    }

    @Override
    public Collection h() {
        return Collections.unmodifiableCollection(super.h());
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.f();
    }
}

