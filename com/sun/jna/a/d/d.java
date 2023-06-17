/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.a;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.e;
import com.sun.jna.a.d.gf;
import com.sun.jna.ac;
import com.sun.jna.ay;
import java.util.Iterator;

public class d
implements Iterable,
Iterator {
    private gf a = null;
    private ac b = new ac(65536L);
    private boolean c = false;
    private int d = 0;
    private ay e = null;
    private int f = 4;

    public d(String string) {
        this(null, string, 4);
    }

    public d(String string, String string2, int n2) {
        this.f = n2;
        this.a = com.sun.jna.a.d.a.g.b(string, string2);
        if (this.a == null) {
            throw new dy(com.sun.jna.a.d.ac.g.f());
        }
    }

    private boolean c() {
        if (this.c || this.d > 0) {
            return false;
        }
        com.sun.jna.b.e e2 = new com.sun.jna.b.e();
        com.sun.jna.b.e e3 = new com.sun.jna.b.e();
        if (!com.sun.jna.a.d.a.g.a(this.a, 1 | this.f, 0, this.b, (int)this.b.g(), e2, e3)) {
            int n2 = com.sun.jna.a.d.ac.g.f();
            if (n2 == 122) {
                this.b = new ac(e3.d());
                if (!com.sun.jna.a.d.a.g.a(this.a, 1 | this.f, 0, this.b, (int)this.b.g(), e2, e3)) {
                    throw new dy(com.sun.jna.a.d.ac.g.f());
                }
            } else {
                this.a();
                if (n2 != 38) {
                    throw new dy(n2);
                }
                return false;
            }
        }
        this.d = e2.d();
        this.e = this.b;
        return true;
    }

    public void a() {
        this.c = true;
        if (this.a != null) {
            if (!com.sun.jna.a.d.a.g.c(this.a)) {
                throw new dy(com.sun.jna.a.d.ac.g.f());
            }
            this.a = null;
        }
    }

    public Iterator iterator() {
        return this;
    }

    public boolean hasNext() {
        this.c();
        return !this.c;
    }

    public e b() {
        this.c();
        e e2 = new e(this.e);
        this.d -= e2.f();
        this.e = this.e.a(e2.f());
        return e2;
    }

    public void remove() {
    }

    public /* synthetic */ Object next() {
        return this.b();
    }
}

