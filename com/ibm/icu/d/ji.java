/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.je;
import com.ibm.icu.d.jh;
import java.util.Comparator;

class ji
implements Comparator {
    private ji() {
    }

    public int a(jh jh2, jh jh3) {
        int n2;
        int n3 = jh2.a.length();
        if (n3 < (n2 = jh3.a.length())) {
            return -1;
        }
        if (n3 > n2) {
            return 1;
        }
        return jh2.a.compareTo(jh3.a);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((jh)object, (jh)object2);
    }

    /* synthetic */ ji(je je2) {
        this();
    }
}

