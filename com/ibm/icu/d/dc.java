/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.jd;
import java.io.Serializable;

public final class dc
implements Serializable,
Cloneable {
    static final int a = 1;
    private static final long b = 1L;
    private final String c;
    private final String d;
    private final boolean e;

    public dc(String string, String string2, boolean bl2) {
        this.c = string;
        this.d = string2;
        this.e = bl2;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object instanceof dc) {
            dc dc2 = (dc)object;
            return jd.b((Object)this.c, dc2.c) && jd.b((Object)this.d, this.d) && this.e == dc2.e;
        }
        return false;
    }

    public int hashCode() {
        int n2;
        int n3 = n2 = this.c != null ? this.c.hashCode() : 0;
        if (this.d != null) {
            n2 ^= this.d.hashCode();
        }
        if (this.e) {
            n2 ^= 0xFFFFFFFF;
        }
        return n2;
    }
}

