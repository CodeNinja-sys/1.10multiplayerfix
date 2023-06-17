/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.au;
import com.ibm.icu.a.cc;
import com.ibm.icu.a.ce;
import com.ibm.icu.a.cf;
import com.ibm.icu.util.dn;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public abstract class av
implements ce {
    protected final String b;
    protected final boolean c;
    public static final boolean d = true;
    public static final boolean e = false;

    protected av(boolean bl2) {
        this.c = bl2;
        this.b = null;
    }

    protected av(boolean bl2, String string) {
        this.c = bl2;
        this.b = string;
    }

    public Object a(cf cf2, cc cc2) {
        if (this.a(cf2)) {
            au au2 = (au)cf2;
            int n2 = au2.b();
            dn dn2 = au2.g();
            return this.a(dn2, n2, cc2);
        }
        return null;
    }

    protected boolean a(cf cf2) {
        if (cf2 != null) {
            String string = cf2.d();
            Set set = this.a();
            return set.contains(string);
        }
        return false;
    }

    public void a(Map map) {
        Set set = this.a();
        for (String string : set) {
            if (this.c) {
                map.put(string, this);
                continue;
            }
            map.remove(string);
        }
    }

    public String a(String string, dn dn2) {
        if (dn2 == null) {
            return string;
        }
        dn dn3 = new dn(string);
        return dn3.h(dn2);
    }

    protected Object a(dn dn2, int n2, cc cc2) {
        return null;
    }

    protected boolean a(String string) {
        return this.a().contains(string);
    }

    protected Set a() {
        return Collections.emptySet();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        if (this.b != null) {
            stringBuilder.append(", name: ");
            stringBuilder.append(this.b);
        }
        stringBuilder.append(", visible: ");
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

