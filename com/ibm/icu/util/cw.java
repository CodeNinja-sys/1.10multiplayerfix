/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.cs;
import com.ibm.icu.util.cu;
import com.ibm.icu.util.cx;
import com.ibm.icu.util.cz;
import com.ibm.icu.util.da;
import com.ibm.icu.util.dc;
import com.ibm.icu.util.de;
import java.util.ArrayList;

final class cw
extends de {
    private StringBuilder e = new StringBuilder();
    private ArrayList f = new ArrayList();

    public void a(char c2, da da2) {
        int n2 = this.a(c2);
        this.e.insert(n2, c2);
        this.f.add(n2, da2);
    }

    public da a(cs cs2, CharSequence charSequence, int n2, int n3) {
        char c2;
        int n4;
        if (n2 == charSequence.length()) {
            if (this.a) {
                throw new IllegalArgumentException("Duplicate string.");
            }
            this.b(n3);
            return this;
        }
        if ((n4 = this.a(c2 = charSequence.charAt(n2++))) < this.e.length() && c2 == this.e.charAt(n4)) {
            this.f.set(n4, ((da)this.f.get(n4)).a(cs2, charSequence, n2, n3));
        } else {
            this.e.insert(n4, c2);
            this.f.add(n4, cs.a(cs2, charSequence, n2, n3));
        }
        return this;
    }

    public da b(cs cs2) {
        cu cu2;
        da da2 = this.a(cs2, 0, this.e.length());
        de de2 = cu2 = new cu(this.e.length(), da2);
        if (this.a) {
            if (cs2.b()) {
                cu2.b(this.b);
            } else {
                de2 = new cx(this.b, cs.a(cs2, cu2));
            }
        }
        return cs.a(cs2, de2);
    }

    private da a(cs cs2, int n2, int n3) {
        int n4 = n3 - n2;
        if (n4 > cs2.c()) {
            int n5 = n2 + n4 / 2;
            return cs.a(cs2, new dc(this.e.charAt(n5), this.a(cs2, n2, n5), this.a(cs2, n5, n3)));
        }
        cz cz2 = new cz(n4);
        do {
            char c2 = this.e.charAt(n2);
            da da2 = (da)this.f.get(n2);
            if (da2.getClass() == de.class) {
                cz2.a((int)c2, ((de)da2).b);
                continue;
            }
            cz2.a((int)c2, da2.b(cs2));
        } while (++n2 < n3);
        return cs.a(cs2, cz2);
    }

    private int a(char c2) {
        int n2 = 0;
        int n3 = this.e.length();
        while (n2 < n3) {
            int n4 = (n2 + n3) / 2;
            char c3 = this.e.charAt(n4);
            if (c2 < c3) {
                n3 = n4;
                continue;
            }
            if (c2 == c3) {
                return n4;
            }
            n2 = n4 + 1;
        }
        return n2;
    }
}

