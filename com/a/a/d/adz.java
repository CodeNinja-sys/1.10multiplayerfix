/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.d.adw;

abstract class adz
implements adw {
    adz() {
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof adw) {
            adw adw2 = (adw)object;
            return cc.a(this.a(), adw2.a()) && cc.a(this.b(), adw2.b()) && cc.a(this.c(), adw2.c());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return cc.a(this.a(), this.b(), this.c());
    }

    public String toString() {
        return "(" + this.a() + "," + this.b() + ")=" + this.c();
    }
}

