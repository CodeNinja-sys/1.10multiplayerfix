/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.a;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.ds;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.ip;

public class dt {
    ip a = null;
    String b = null;
    String c = null;

    public dt() {
    }

    public dt(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public void a(int n2) {
        this.a();
        this.a = com.sun.jna.a.d.a.g.a(this.b, this.c, n2);
        if (this.a == null) {
            throw new dy(ac.g.f());
        }
    }

    public void a() {
        if (this.a != null) {
            if (!com.sun.jna.a.d.a.g.a(this.a)) {
                throw new dy(ac.g.f());
            }
            this.a = null;
        }
    }

    public ds a(String string, int n2) {
        ip ip2 = com.sun.jna.a.d.a.g.a(this.a, string, n2);
        if (ip2 == null) {
            throw new dy(ac.g.f());
        }
        return new ds(ip2);
    }

    public ip b() {
        return this.a;
    }
}

