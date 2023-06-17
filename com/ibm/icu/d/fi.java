/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fa;
import com.ibm.icu.d.ff;
import com.ibm.icu.d.fg;

public class fi
extends fg {
    private String a;
    private double b = -1.23456789E8;
    private ff c;

    public String a() {
        return this.a;
    }

    public boolean b() {
        return this.b != -1.23456789E8;
    }

    public double c() {
        return this.b;
    }

    public ff d() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.b()) {
            stringBuilder.append(this.b).append(" (").append(this.a).append(") {");
        } else {
            stringBuilder.append(this.a).append(" {");
        }
        return stringBuilder.append(this.c.toString()).append('}').toString();
    }

    private fi() {
        super(null);
    }

    /* synthetic */ fi(fa fa2) {
        this();
    }

    static /* synthetic */ String a(fi fi2, String string) {
        fi2.a = string;
        return fi2.a;
    }

    static /* synthetic */ double a(fi fi2, double d2) {
        fi2.b = d2;
        return fi2.b;
    }

    static /* synthetic */ ff a(fi fi2, ff ff2) {
        fi2.c = ff2;
        return fi2.c;
    }
}

