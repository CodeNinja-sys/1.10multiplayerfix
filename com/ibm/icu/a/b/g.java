/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b;

import com.ibm.icu.a.b.a.q;
import com.ibm.icu.a.b.a.r;
import com.ibm.icu.a.b.f;
import com.ibm.icu.a.b.h;
import com.ibm.icu.a.b.i;
import com.ibm.icu.a.b.t;
import com.ibm.icu.a.b.u;
import java.util.Locale;

public class g
implements u {
    private final r a;
    private q b;
    private h c;
    private boolean d;
    private String e;

    g(r r2) {
        this.a = r2;
        this.c = new h();
        this.e = Locale.getDefault().toString();
    }

    public static g a() {
        return (g)i.a().c();
    }

    public u a(String string) {
        this.b = null;
        this.e = string;
        return this;
    }

    public u a(boolean bl2) {
        this.i().a = bl2;
        return this;
    }

    public boolean b() {
        return this.c.a;
    }

    public u b(boolean bl2) {
        this.i().b = bl2;
        return this;
    }

    public boolean c() {
        return this.c.b;
    }

    public u a(int n2) {
        this.i().c = (byte)n2;
        return this;
    }

    public int d() {
        return this.c.c;
    }

    public u b(int n2) {
        this.i().d = (byte)n2;
        return this;
    }

    public int e() {
        return this.c.d;
    }

    public u c(int n2) {
        this.i().e = (byte)n2;
        return this;
    }

    public int f() {
        return this.c.e;
    }

    public t g() {
        this.d = true;
        return new f(this, this.e, this.h(), this.c);
    }

    private h i() {
        if (this.d) {
            this.c = this.c.a();
            this.d = false;
        }
        return this.c;
    }

    q h() {
        if (this.b == null) {
            this.b = this.a.a(this.e);
        }
        return this.b;
    }

    q b(String string) {
        return this.a.a(string);
    }
}

