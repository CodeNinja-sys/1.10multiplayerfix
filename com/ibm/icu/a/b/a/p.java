/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

import com.ibm.icu.a.b.a.s;
import com.ibm.icu.a.b.a.t;

public class p {
    String a;
    boolean b;
    String c;

    public void a(t t2) {
        t2.a("ScopeData");
        t2.a("prefix", this.a);
        t2.a("requiresDigitPrefix", this.b);
        t2.a("suffix", this.c);
        t2.a();
    }

    public static p a(s s2) {
        if (s2.a("ScopeData")) {
            p p2 = new p();
            p2.a = s2.f("prefix");
            p2.b = s2.b("requiresDigitPrefix");
            p2.c = s2.f("suffix");
            if (s2.a()) {
                return p2;
            }
        }
        return null;
    }
}

