/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.ad;
import com.sun.jna.a.d.dn;
import com.sun.jna.a.d.gh;

public class dy
extends RuntimeException {
    private static final long a = 1L;
    private gh b;

    public gh a() {
        return this.b;
    }

    public dy(gh gh2) {
        super(ad.a(gh2));
        this.b = gh2;
    }

    public dy(int n2) {
        this(dn.g(n2));
    }
}

