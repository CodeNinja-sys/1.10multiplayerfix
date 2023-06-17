/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.util.Date;
import org.apache.commons.compress.archivers.d.m;
import org.apache.commons.compress.archivers.h.am;

public class l {
    private long a;
    private long b;
    private int c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int k;

    l(byte[] arrby, am am2) {
        this.a = 1000L * (long)m.b(arrby, 4);
        this.b = 1000L * (long)m.b(arrby, 8);
        this.c = m.b(arrby, 12);
        this.d = m.a(am2, arrby, 676, 16).trim();
        this.e = m.b(arrby, 692);
        this.f = m.a(am2, arrby, 696, 64).trim();
        this.g = m.a(am2, arrby, 760, 64).trim();
        this.h = m.a(am2, arrby, 824, 64).trim();
        this.i = m.b(arrby, 888);
        this.j = m.b(arrby, 892);
        this.k = m.b(arrby, 896);
    }

    public Date a() {
        return new Date(this.a);
    }

    public void a(Date date) {
        this.a = date.getTime();
    }

    public Date b() {
        return new Date(this.b);
    }

    public void b(Date date) {
        this.b = date.getTime();
    }

    public int c() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public int d() {
        return this.e;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public String e() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public String f() {
        return this.f;
    }

    public void b(String string) {
        this.f = string;
    }

    public String g() {
        return this.g;
    }

    public void c(String string) {
        this.g = string;
    }

    public String h() {
        return this.h;
    }

    public void d(String string) {
        this.h = string;
    }

    public int i() {
        return this.i;
    }

    public void c(int n2) {
        this.i = n2;
    }

    public int j() {
        return this.j;
    }

    public void d(int n2) {
        this.j = n2;
    }

    public int k() {
        return this.k;
    }

    public void e(int n2) {
        this.k = n2;
    }

    public boolean l() {
        return (this.i & 1) == 1;
    }

    public boolean m() {
        return (this.i & 2) == 2;
    }

    public boolean n() {
        return (this.i & 0x80) == 128;
    }

    public boolean o() {
        return (this.i & 0x100) == 256;
    }

    public boolean p() {
        return (this.i & 0x8000) == 32768;
    }

    public int hashCode() {
        int n2 = 17;
        if (this.d != null) {
            n2 = this.d.hashCode();
        }
        n2 = (int)((long)n2 + 31L * this.a);
        if (this.h != null) {
            n2 = 31 * this.h.hashCode() + 17;
        }
        if (this.g != null) {
            n2 = 31 * this.g.hashCode() + 17;
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        l l2 = (l)object;
        if (this.a != l2.a) {
            return false;
        }
        if (this.h() == null || !this.h().equals(l2.h())) {
            return false;
        }
        return this.g() != null && this.g().equals(l2.g());
    }
}

