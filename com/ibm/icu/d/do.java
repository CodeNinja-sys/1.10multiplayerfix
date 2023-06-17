/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

class do {
    private final String a;
    private final String b;

    public do(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public void a(StringBuffer stringBuffer) {
        stringBuffer.append(this.b);
    }

    public void b(StringBuffer stringBuffer) {
        stringBuffer.append(this.a);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof do)) {
            return false;
        }
        do do_ = (do)object;
        return this.a.equals(do_.a) && this.b.equals(do_.b);
    }
}

