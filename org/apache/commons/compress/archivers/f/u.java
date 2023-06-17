/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.TimeZone;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.f.x;

public class u
implements a {
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private long j;
    private long k;
    private boolean l;
    private int m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;
    private Iterable s;

    public String getName() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public boolean b() {
        return this.c;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    public boolean isDirectory() {
        return this.d;
    }

    public void b(boolean bl2) {
        this.d = bl2;
    }

    public boolean c() {
        return this.e;
    }

    public void c(boolean bl2) {
        this.e = bl2;
    }

    public boolean d() {
        return this.f;
    }

    public void d(boolean bl2) {
        this.f = bl2;
    }

    public Date e() {
        if (this.f) {
            return u.h(this.i);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void a(long l2) {
        this.i = l2;
    }

    public void a(Date date) {
        boolean bl2 = this.f = date != null;
        if (this.f) {
            this.i = u.d(date);
        }
    }

    public boolean f() {
        return this.g;
    }

    public void e(boolean bl2) {
        this.g = bl2;
    }

    public Date a() {
        if (this.g) {
            return u.h(this.j);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void b(long l2) {
        this.j = l2;
    }

    public void b(Date date) {
        boolean bl2 = this.g = date != null;
        if (this.g) {
            this.j = u.d(date);
        }
    }

    public boolean g() {
        return this.h;
    }

    public void f(boolean bl2) {
        this.h = bl2;
    }

    public Date h() {
        if (this.h) {
            return u.h(this.k);
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public void c(long l2) {
        this.k = l2;
    }

    public void c(Date date) {
        boolean bl2 = this.h = date != null;
        if (this.h) {
            this.k = u.d(date);
        }
    }

    public boolean i() {
        return this.l;
    }

    public void g(boolean bl2) {
        this.l = bl2;
    }

    public int j() {
        return this.m;
    }

    public void a(int n2) {
        this.m = n2;
    }

    public boolean k() {
        return this.n;
    }

    public void h(boolean bl2) {
        this.n = bl2;
    }

    public int l() {
        return (int)this.o;
    }

    public void b(int n2) {
        this.o = n2;
    }

    public long m() {
        return this.o;
    }

    public void d(long l2) {
        this.o = l2;
    }

    int n() {
        return (int)this.p;
    }

    void c(int n2) {
        this.p = n2;
    }

    long o() {
        return this.p;
    }

    void e(long l2) {
        this.p = l2;
    }

    public long getSize() {
        return this.q;
    }

    public void f(long l2) {
        this.q = l2;
    }

    long p() {
        return this.r;
    }

    void g(long l2) {
        this.r = l2;
    }

    public void a(Iterable iterable) {
        if (iterable != null) {
            LinkedList<x> linkedList = new LinkedList<x>();
            for (x x2 : iterable) {
                linkedList.addLast(x2);
            }
            this.s = Collections.unmodifiableList(linkedList);
        } else {
            this.s = null;
        }
    }

    public Iterable q() {
        return this.s;
    }

    public static Date h(long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        long l3 = calendar.getTimeInMillis() + l2 / 10000L;
        return new Date(l3);
    }

    public static long d(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        calendar.set(1601, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        return (date.getTime() - calendar.getTimeInMillis()) * 1000L * 10L;
    }
}

