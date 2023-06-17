/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

class bw {
    final String a;
    final String b;
    final ClassLoader c;

    bw(String string, String string2, ClassLoader classLoader) {
        this.a = string == null ? "" : string;
        this.b = string2 == null ? "" : string2;
        this.c = classLoader;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bw)) {
            return false;
        }
        bw bw2 = (bw)object;
        return this.a.equals(bw2.a) && this.b.equals(bw2.b) && this.c.equals(bw2.c);
    }

    public int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode() ^ this.c.hashCode();
    }
}

