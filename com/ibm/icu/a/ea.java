/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cm;
import com.ibm.icu.a.eg;

public class ea
implements eg {
    public cm a;
    public int b;

    public void a(int n2) {
    }

    public void b(int n2) {
        this.b = n2;
    }

    public void a(int n2, int n3, int n4) {
        this.a.a(n2, n3 + 1, n4, true);
    }

    public void c(int n2) {
        if (n2 > 65535) {
            throw new IndexOutOfBoundsException();
        }
        this.a = new cm(null, 100000, this.b, this.b, false);
    }
}

