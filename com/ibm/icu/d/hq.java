/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.hp;

class hq {
    StringBuilder a = new StringBuilder("[");
    final /* synthetic */ hp b;

    hq(hp hp2) {
        this.b = hp2;
    }

    hq a(String string) {
        return this.a(string, null);
    }

    hq a(String string, Object object) {
        if (this.a.length() > 1) {
            this.a.append(", ");
        }
        this.a.append(string);
        if (object != null) {
            this.a.append(": ").append(object.toString());
        }
        return this;
    }

    public String toString() {
        String string = this.a.append(']').toString();
        this.a = null;
        return string;
    }
}

