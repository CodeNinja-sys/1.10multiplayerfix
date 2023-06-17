/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.di;
import com.ibm.icu.a.dt;

public final class cm {
    public static final char a = '\uffff';
    private final dt b;
    private String c;
    private int d = 0;
    private int e = -1;

    public cm() {
        this(false, 0);
    }

    public cm(boolean bl2, int n2) {
        this.b = bl2 ? di.b().a : di.a().a;
    }

    public boolean a() {
        if (this.e == -1) {
            this.d();
        }
        return this.e != -1;
    }

    public char b() {
        if (this.e == -1) {
            this.d();
        }
        this.d = this.e;
        this.e = -1;
        return (char)this.d;
    }

    public String c() {
        if (this.c != null) {
            return this.c;
        }
        return "";
    }

    private void d() {
        int n2;
        block2: {
            this.c = null;
            for (n2 = this.d + 1; n2 < 65535; ++n2) {
                this.c = this.b.k(n2);
                if (this.c == null) {
                    continue;
                }
                break block2;
            }
            n2 = -1;
        }
        this.e = n2;
    }
}

