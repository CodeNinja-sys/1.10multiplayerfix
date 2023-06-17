/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;

class i {
    private char a;

    i(char c2) {
        this.a = c2;
    }

    public char a() {
        return this.a;
    }

    public int hashCode() {
        return com.ibm.icu.a.c.a.b(this.a);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        return this.a == com.ibm.icu.a.c.a.b(((i)object).a());
    }
}

