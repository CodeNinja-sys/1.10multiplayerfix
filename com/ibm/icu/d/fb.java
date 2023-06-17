/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.ew;
import com.ibm.icu.d.fc;
import com.ibm.icu.d.fd;
import com.ibm.icu.d.fe;

public class fb
extends fd {
    private ew a;
    private String b;
    private int c = -1;
    private String d;
    private String e;
    private fc f;

    public ew a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public fc f() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{').append(this.b);
        if (this.a != ew.a) {
            stringBuilder.append(',').append(this.d);
            if (this.a == ew.b) {
                if (this.e != null) {
                    stringBuilder.append(',').append(this.e);
                }
            } else {
                stringBuilder.append(',').append(this.f.toString());
            }
        }
        return stringBuilder.append('}').toString();
    }

    private fb() {
        super(fe.b, null);
    }

    private static fb j() {
        return new fb();
    }

    static /* synthetic */ fb g() {
        return fb.j();
    }

    static /* synthetic */ ew a(fb fb2, ew ew2) {
        fb2.a = ew2;
        return fb2.a;
    }

    static /* synthetic */ String a(fb fb2, String string) {
        fb2.b = string;
        return fb2.b;
    }

    static /* synthetic */ int a(fb fb2, int n2) {
        fb2.c = n2;
        return fb2.c;
    }

    static /* synthetic */ String b(fb fb2, String string) {
        fb2.d = string;
        return fb2.d;
    }

    static /* synthetic */ String c(fb fb2, String string) {
        fb2.e = string;
        return fb2.e;
    }

    static /* synthetic */ fc a(fb fb2, fc fc2) {
        fb2.f = fc2;
        return fb2.f;
    }
}

