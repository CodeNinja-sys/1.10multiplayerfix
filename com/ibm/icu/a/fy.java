/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.fi;
import com.ibm.icu.a.ft;
import com.ibm.icu.a.fx;
import com.ibm.icu.d.kr;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;

class fy
implements fi {
    private EnumSet b;
    private Collection c;
    private int d;
    static final /* synthetic */ boolean a;

    fy(EnumSet enumSet) {
        this.b = enumSet;
    }

    public boolean a(int n2, Iterator iterator) {
        while (iterator.hasNext()) {
            kr kr2;
            fx fx2 = (fx)iterator.next();
            if (this.b != null && !this.b.contains((Object)fx2.c)) continue;
            if (fx2.a != null) {
                kr2 = new kr(fx2.c, fx2.a, null, n2);
            } else {
                if (!a && fx2.b == null) {
                    throw new AssertionError();
                }
                kr2 = new kr(fx2.c, null, fx2.b, n2);
            }
            if (this.c == null) {
                this.c = new LinkedList();
            }
            this.c.add(kr2);
            if (n2 <= this.d) continue;
            this.d = n2;
        }
        return true;
    }

    public Collection a() {
        if (this.c == null) {
            return Collections.emptyList();
        }
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public void c() {
        this.c = null;
        this.d = 0;
    }

    static {
        a = !ft.class.desiredAssertionStatus();
    }
}

