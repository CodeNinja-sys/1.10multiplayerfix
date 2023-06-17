/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ks;

public class kr {
    private ks a;
    private String b;
    private String c;
    private int d;

    public kr(ks ks2, String string, String string2, int n2) {
        if (ks2 == null) {
            throw new IllegalArgumentException("nameType is null");
        }
        if (string == null && string2 == null) {
            throw new IllegalArgumentException("Either tzID or mzID must be available");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("matchLength must be positive value");
        }
        this.a = ks2;
        this.b = string;
        this.c = string2;
        this.d = n2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public ks c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }
}

