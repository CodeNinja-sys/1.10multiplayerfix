/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.fe;
import com.ibm.icu.a.fi;
import java.util.Iterator;

class fg
implements fi {
    private Iterator a = null;
    private int b = 0;

    private fg() {
    }

    public boolean a(int n2, Iterator iterator) {
        if (n2 > this.b) {
            this.b = n2;
            this.a = iterator;
        }
        return true;
    }

    public Iterator a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    /* synthetic */ fg(fe fe2) {
        this();
    }
}

