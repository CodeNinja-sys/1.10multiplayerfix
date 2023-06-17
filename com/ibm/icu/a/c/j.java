/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;

class j {
    private String a;

    j(String string) {
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    public int hashCode() {
        return com.ibm.icu.a.c.a.a(this.a).hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        return com.ibm.icu.a.c.a.a(this.a, ((j)object).a());
    }
}

