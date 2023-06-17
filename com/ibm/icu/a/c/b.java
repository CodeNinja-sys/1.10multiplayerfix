/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;

public class b {
    private String a;
    private int b;

    public b(String string) {
        this.a = string;
        this.b = com.ibm.icu.a.c.a.a(string).hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof b) {
            return com.ibm.icu.a.c.a.a(this.a, ((b)object).a);
        }
        return false;
    }

    public int hashCode() {
        return this.b;
    }
}

