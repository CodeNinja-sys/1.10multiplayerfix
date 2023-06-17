/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.qk;

class va
implements qk {
    private final Object a;
    private final Object b;

    static qk a(Object object, Object object2) {
        return new va(object, object2);
    }

    private va(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    @Override
    public Object a() {
        return this.a;
    }

    @Override
    public Object b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof qk) {
            qk qk2 = (qk)object;
            return cc.a(this.a, qk2.a()) && cc.a(this.b, qk2.b());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}

