/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.a;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.a.c.a.c;
import org.apache.a.r;

public class d {
    private boolean a;
    private r b;
    private InetAddress c;
    private boolean d = true;
    private String e;
    private boolean f = true;
    private boolean g = true;
    private boolean h;
    private int i = 50;
    private boolean j = true;
    private Collection k;
    private Collection l;
    private int m = -1;
    private int n = -1;
    private int o = -1;

    d() {
    }

    public d a(boolean bl2) {
        this.a = bl2;
        return this;
    }

    public d a(r r2) {
        this.b = r2;
        return this;
    }

    public d a(InetAddress inetAddress) {
        this.c = inetAddress;
        return this;
    }

    public d b(boolean bl2) {
        this.d = bl2;
        return this;
    }

    public d a(String string) {
        this.e = string;
        return this;
    }

    public d c(boolean bl2) {
        this.f = bl2;
        return this;
    }

    public d d(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public d e(boolean bl2) {
        this.h = bl2;
        return this;
    }

    public d a(int n2) {
        this.i = n2;
        return this;
    }

    public d f(boolean bl2) {
        this.j = bl2;
        return this;
    }

    public d a(Collection collection) {
        this.k = collection;
        return this;
    }

    public d b(Collection collection) {
        this.l = collection;
        return this;
    }

    public d b(int n2) {
        this.m = n2;
        return this;
    }

    public d c(int n2) {
        this.n = n2;
        return this;
    }

    public d d(int n2) {
        this.o = n2;
        return this;
    }

    public c a() {
        return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}

