/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.a.u;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.c.a;
import org.apache.logging.log4j.core.c.e;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.j;
import org.apache.logging.log4j.core.k;
import org.apache.logging.log4j.f;

public class i
extends a {
    protected volatile j a;
    private final k i;

    protected i(k k2, String string, n n2) {
        super(string, n2);
        this.i = k2;
        this.a = new j(this, k2.d(), this);
    }

    public i k() {
        v v2;
        v v3 = v2 = this.a.a.d().equals(this.d()) ? this.a.a.e() : this.a.a;
        if (v2 == null) {
            return null;
        }
        if (this.i.b(v2.d())) {
            return this.i.a(v2.d(), this.c());
        }
        return new i(this.i, v2.d(), this.c());
    }

    public k l() {
        return this.i;
    }

    public synchronized void b(b b2) {
        if (b2 != null) {
            this.a = new j(this, this.a, b2);
        }
    }

    public b m() {
        return j.a(this.a);
    }

    @Override
    public void a(f f2, String string, b b2, m m2, Throwable throwable) {
        if (m2 == null) {
            m2 = new u("");
        }
        this.a.b.m().a();
        this.a.a.a(this.d(), f2, string, b2, m2, throwable);
    }

    @Override
    public boolean b(b b2, f f2, String string) {
        return this.a.a(b2, f2, string);
    }

    @Override
    public boolean b(b b2, f f2, String string, Throwable throwable) {
        return this.a.a(b2, f2, string, throwable);
    }

    @Override
    public boolean c(b b2, f f2, String string, Object ... arrobject) {
        return this.a.a(b2, f2, string, arrobject);
    }

    @Override
    public boolean b(b b2, f f2, Object object, Throwable throwable) {
        return this.a.a(b2, f2, object, throwable);
    }

    @Override
    public boolean b(b b2, f f2, m m2, Throwable throwable) {
        return this.a.a(b2, f2, m2, throwable);
    }

    public void a(org.apache.logging.log4j.core.b b2) {
        this.a.b.a(this, b2);
    }

    public void b(org.apache.logging.log4j.core.b b2) {
        this.a.a.b(b2.a());
    }

    public Map n() {
        return this.a.a.f();
    }

    public Iterator o() {
        d d2 = this.a.a.aY_();
        if (d2 == null) {
            return new ArrayList().iterator();
        }
        if (d2 instanceof e) {
            return ((e)d2).iterator();
        }
        ArrayList<d> arrayList = new ArrayList<d>();
        arrayList.add(d2);
        return arrayList.iterator();
    }

    public int p() {
        d d2 = this.a.a.aY_();
        if (d2 == null) {
            return 0;
        }
        if (d2 instanceof e) {
            return ((e)d2).h();
        }
        return 1;
    }

    public void a(d d2) {
        this.a.b.a(this, d2);
    }

    public boolean q() {
        return this.a.a.k();
    }

    public void a(boolean bl2) {
        this.a.b.a(this, bl2);
    }

    void a(org.apache.logging.log4j.core.config.d d2) {
        this.a = new j(this, d2, this);
    }

    @Override
    public String toString() {
        String string = "" + this.d() + ":" + (Object)((Object)this.m());
        if (this.i == null) {
            return string;
        }
        String string2 = this.i.a();
        return string2 == null ? string : string + " in " + string2;
    }
}

