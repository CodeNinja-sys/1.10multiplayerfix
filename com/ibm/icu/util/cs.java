/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cy;
import com.ibm.icu.util.da;
import com.ibm.icu.util.db;
import com.ibm.icu.util.dd;
import com.ibm.icu.util.de;
import java.util.HashMap;

public abstract class cs {
    private dd a = dd.a;
    protected StringBuilder b = new StringBuilder();
    private da d;
    private HashMap e = new HashMap();
    private de f = new de();

    protected cs() {
    }

    protected void b(CharSequence charSequence, int n2) {
        if (this.a != dd.a) {
            throw new IllegalStateException("Cannot add (string, value) pairs after build().");
        }
        if (charSequence.length() > 65535) {
            throw new IndexOutOfBoundsException("The maximum string length is 0xffff.");
        }
        this.d = this.d == null ? this.a(charSequence, 0, n2) : this.d.a(this, charSequence, 0, n2);
    }

    protected final void c(db db2) {
        switch (this.a) {
            case a: {
                if (this.d == null) {
                    throw new IndexOutOfBoundsException("No (string, value) pairs were added.");
                }
                if (db2 == db.a) {
                    this.a = dd.b;
                    break;
                }
                this.a = dd.c;
                break;
            }
            case b: 
            case c: {
                throw new IllegalStateException("Builder failed and must be clear()ed.");
            }
            case d: {
                return;
            }
        }
        this.d = this.d.b(this);
        this.d.a(-1);
        this.d.a(this);
        this.a = dd.d;
    }

    protected void f() {
        this.b.setLength(0);
        this.e.clear();
        this.d = null;
        this.a = dd.a;
    }

    private final da a(da da2) {
        if (this.a == dd.b) {
            return da2;
        }
        da da3 = (da)this.e.get(da2);
        if (da3 != null) {
            return da3;
        }
        da3 = this.e.put(da2, da2);
        assert (da3 == null);
        return da2;
    }

    private final de c(int n2) {
        de.a(this.f, n2);
        da da2 = (da)this.e.get(this.f);
        if (da2 != null) {
            return (de)da2;
        }
        de de2 = new de(n2);
        da2 = this.e.put(de2, de2);
        assert (da2 == null);
        return de2;
    }

    private de a(CharSequence charSequence, int n2, int n3) {
        de de2 = this.c(n3);
        if (n2 < charSequence.length()) {
            int n4 = this.b.length();
            this.b.append(charSequence, n2, charSequence.length());
            de2 = new cy(this.b, n4, charSequence.length() - n2, de2);
        }
        return de2;
    }

    protected abstract boolean b();

    protected abstract int c();

    protected abstract int d();

    protected abstract int e();

    protected abstract int a(int var1);

    protected abstract int a(int var1, int var2);

    protected abstract int a(int var1, boolean var2);

    protected abstract int a(boolean var1, int var2, int var3);

    protected abstract int b(int var1);

    static /* synthetic */ de a(cs cs2, CharSequence charSequence, int n2, int n3) {
        return cs2.a(charSequence, n2, n3);
    }

    static /* synthetic */ da a(cs cs2, da da2) {
        return cs2.a(da2);
    }
}

