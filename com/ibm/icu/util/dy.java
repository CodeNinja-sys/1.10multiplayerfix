/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.dv;
import java.util.NoSuchElementException;

public class dy {
    private dv a;
    private int b = 0;
    private int c = 0;

    public dy(dv dv2) {
        this.a = dv2;
        this.c = this.a.w();
    }

    public dv a() {
        if (this.b < this.c) {
            return this.a.k(this.b++);
        }
        throw new NoSuchElementException();
    }

    public String b() {
        if (this.b < this.c) {
            return this.a.j(this.b++);
        }
        throw new NoSuchElementException();
    }

    public void c() {
        this.b = 0;
    }

    public boolean d() {
        return this.b < this.c;
    }
}

