/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.d;

import java.util.Date;
import org.apache.a.g.p;
import org.apache.a.i.d.c;

public class d
extends c
implements p {
    private static final long k = -7744598295706617057L;
    private String l;
    private int[] m;
    private boolean n;

    public d(String string, String string2) {
        super(string, string2);
    }

    public int[] i() {
        return this.m;
    }

    public void a(int[] arrn) {
        this.m = arrn;
    }

    public String d() {
        return this.l;
    }

    public void a(String string) {
        this.l = string;
    }

    public void b(boolean bl2) {
        this.n = bl2;
    }

    public boolean f() {
        return !this.n && super.f();
    }

    public boolean a(Date date) {
        return this.n || super.a(date);
    }

    public Object clone() {
        d d2 = (d)super.clone();
        if (this.m != null) {
            d2.m = (int[])this.m.clone();
        }
        return d2;
    }
}

