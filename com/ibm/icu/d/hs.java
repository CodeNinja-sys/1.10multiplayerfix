/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hr;
import com.ibm.icu.d.ht;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

class hs
implements ht,
Serializable {
    private static final long a = 1L;
    private final hr b;
    private final hs c;

    public hs(hr hr2) {
        this(hr2, null);
    }

    private hs(hr hr2, hs hs2) {
        this.b = hr2;
        this.c = hs2;
    }

    public hs a(hr hr2) {
        return new hs(hr2, this);
    }

    private hr b(double d2) {
        hr hr2 = null;
        if (this.c != null) {
            hr2 = this.c.b(d2);
        }
        if (hr2 == null && this.b.a(d2)) {
            hr2 = this.b;
        }
        return hr2;
    }

    public String a(double d2) {
        hr hr2 = this.b(d2);
        if (hr2 == null) {
            return "other";
        }
        return hr2.a();
    }

    public Set a() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("other");
        hs hs2 = this;
        while (hs2 != null) {
            hashSet.add(hs2.b.a());
            hs2 = hs2.c;
        }
        return hashSet;
    }

    public boolean a(String string) {
        hs hs2 = this;
        boolean bl2 = false;
        while (hs2 != null) {
            if (string.equals(hs2.b.a())) {
                if (!hs2.b.b()) {
                    return false;
                }
                bl2 = true;
            }
            hs2 = hs2.c;
        }
        return bl2;
    }

    public int b() {
        int n2 = 0;
        hs hs2 = this;
        while (hs2 != null) {
            n2 = hs2.b.a(n2);
            hs2 = hs2.c;
        }
        return n2;
    }

    public String toString() {
        String string = this.b.toString();
        if (this.c != null) {
            string = this.c.toString() + "; " + string;
        }
        return string;
    }
}

