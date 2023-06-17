/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cc;
import com.ibm.icu.a.ce;
import com.ibm.icu.a.cf;
import com.ibm.icu.util.dn;
import java.util.Map;

public class ci
implements ce {
    protected Object a;
    protected String b;
    protected boolean c;

    public ci(Object object, String string) {
        this(object, string, true);
    }

    public ci(Object object, String string, boolean bl2) {
        if (object == null || string == null) {
            throw new IllegalArgumentException("Instance or id is null");
        }
        this.a = object;
        this.b = string;
        this.c = bl2;
    }

    public Object a(cf cf2, cc cc2) {
        if (this.b.equals(cf2.d())) {
            return this.a;
        }
        return null;
    }

    public void a(Map map) {
        if (this.c) {
            map.put(this.b, this);
        } else {
            map.remove(this.b);
        }
    }

    public String a(String string, dn dn2) {
        return this.c && this.b.equals(string) ? string : null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(", id: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", visible: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

