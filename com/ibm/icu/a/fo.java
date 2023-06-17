/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.fi;
import com.ibm.icu.a.fn;
import com.ibm.icu.a.fq;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;

class fo
implements fi {
    private EnumSet a;
    private Collection b;
    private int c;

    fo(EnumSet enumSet) {
        this.a = enumSet;
    }

    public boolean a(int n2, Iterator iterator) {
        while (iterator.hasNext()) {
            fq fq2 = (fq)iterator.next();
            if (this.a != null && !this.a.contains((Object)fq2.b)) continue;
            fn fn2 = new fn();
            fn2.b = fq2.a;
            fn2.a = fq2.b;
            fn2.c = n2;
            if (this.b == null) {
                this.b = new LinkedList();
            }
            this.b.add(fn2);
            if (n2 <= this.c) continue;
            this.c = n2;
        }
        return true;
    }

    public Collection a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public void c() {
        this.b = null;
        this.c = 0;
    }
}

