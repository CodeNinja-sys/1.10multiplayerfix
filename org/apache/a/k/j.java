/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import java.util.Locale;
import org.apache.a.ac;
import org.apache.a.ak;
import org.apache.a.al;
import org.apache.a.an;
import org.apache.a.k.a;
import org.apache.a.k.p;
import org.apache.a.n;
import org.apache.a.x;

public class j
extends a
implements x {
    private an a;
    private ak d;
    private int e;
    private String f;
    private n g;
    private final al h;
    private Locale i;

    public j(an an2, al al2, Locale locale) {
        this.a = (an)org.apache.a.o.a.a(an2, "Status line");
        this.d = an2.a();
        this.e = an2.b();
        this.f = an2.c();
        this.h = al2;
        this.i = locale;
    }

    public j(an an2) {
        this.a = (an)org.apache.a.o.a.a(an2, "Status line");
        this.d = an2.a();
        this.e = an2.b();
        this.f = an2.c();
        this.h = null;
        this.i = null;
    }

    public j(ak ak2, int n2, String string) {
        org.apache.a.o.a.b(n2, "Status code");
        this.a = null;
        this.d = ak2;
        this.e = n2;
        this.f = string;
        this.h = null;
        this.i = null;
    }

    public ak c() {
        return this.d;
    }

    public an a() {
        if (this.a == null) {
            this.a = new p(this.d != null ? this.d : ac.d, this.e, this.f != null ? this.f : this.b(this.e));
        }
        return this.a;
    }

    public n b() {
        return this.g;
    }

    public Locale g() {
        return this.i;
    }

    public void a(an an2) {
        this.a = (an)org.apache.a.o.a.a(an2, "Status line");
        this.d = an2.a();
        this.e = an2.b();
        this.f = an2.c();
    }

    public void a(ak ak2, int n2) {
        org.apache.a.o.a.b(n2, "Status code");
        this.a = null;
        this.d = ak2;
        this.e = n2;
        this.f = null;
    }

    public void a(ak ak2, int n2, String string) {
        org.apache.a.o.a.b(n2, "Status code");
        this.a = null;
        this.d = ak2;
        this.e = n2;
        this.f = string;
    }

    public void a(int n2) {
        org.apache.a.o.a.b(n2, "Status code");
        this.a = null;
        this.e = n2;
        this.f = null;
    }

    public void g(String string) {
        this.a = null;
        this.f = string;
    }

    public void a(n n2) {
        this.g = n2;
    }

    public void a(Locale locale) {
        this.i = (Locale)org.apache.a.o.a.a(locale, "Locale");
        this.a = null;
    }

    protected String b(int n2) {
        return this.h != null ? this.h.a(n2, this.i != null ? this.i : Locale.getDefault()) : null;
    }

    public String toString() {
        return this.a() + " " + this.b;
    }
}

