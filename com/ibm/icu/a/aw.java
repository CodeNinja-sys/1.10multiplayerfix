/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.au;
import com.ibm.icu.a.av;
import com.ibm.icu.a.cc;
import com.ibm.icu.a.cf;
import com.ibm.icu.util.dn;
import java.util.Map;

public class aw
extends av {
    private final Object a;
    private final String f;
    private final int g;

    public aw(Object object, dn dn2, int n2, boolean bl2) {
        this(object, dn2, n2, bl2, null);
    }

    public aw(Object object, dn dn2, int n2, boolean bl2, String string) {
        super(bl2, string);
        this.a = object;
        this.f = dn2.k();
        this.g = n2;
    }

    public Object a(cf cf2, cc cc2) {
        if (!(cf2 instanceof au)) {
            return null;
        }
        au au2 = (au)cf2;
        if (this.g != -1 && this.g != au2.b()) {
            return null;
        }
        if (!this.f.equals(au2.d())) {
            return null;
        }
        return this.a;
    }

    protected boolean a(String string) {
        return this.f.equals(string);
    }

    public void a(Map map) {
        if (this.c) {
            map.put(this.f, this);
        } else {
            map.remove(this.f);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(", id: ");
        stringBuilder.append(this.f);
        stringBuilder.append(", kind: ");
        stringBuilder.append(this.g);
        return stringBuilder.toString();
    }
}

