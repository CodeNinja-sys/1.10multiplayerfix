/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.ax;

class ay {
    final int a;
    Object b;
    ay c;
    final int d;

    ay(int n2, int n3, Object object, ay ay2) {
        this.b = object;
        this.c = ay2;
        this.a = n3;
        this.d = n2;
    }

    public final int a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        if (!(object instanceof ay)) {
            return false;
        }
        ay ay2 = (ay)object;
        return this.a == ay2.a && ((object3 = this.b()) == (object2 = ay2.b()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return ax.f(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a()) + "=" + this.b();
    }
}

