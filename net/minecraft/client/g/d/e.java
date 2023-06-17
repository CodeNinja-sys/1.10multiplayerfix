/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.d;

import net.minecraft.client.g.d.d;
import net.minecraft.client.g.d.g;
import org.apache.logging.log4j.c;

public class e {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final d b;
    private final g c;
    private final int d;
    private final int e;

    public e(int n2, d d2, g g2, int n3) {
        if (this.a(n2, g2)) {
            this.c = g2;
        } else {
            a.f("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.c = g.d;
        }
        this.b = d2;
        this.d = n2;
        this.e = n3;
    }

    private final boolean a(int n2, g g2) {
        return n2 == 0 || g2 == g.d;
    }

    public final d a() {
        return this.b;
    }

    public final g b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.d;
    }

    public String toString() {
        return String.valueOf(this.e) + "," + this.c.a() + "," + this.b.b();
    }

    public final int e() {
        return this.b.a() * this.e;
    }

    public final boolean f() {
        return this.c == g.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            e e2 = (e)object;
            return this.e != e2.e ? false : (this.d != e2.d ? false : (this.b != e2.b ? false : this.c == e2.c));
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d;
        n2 = 31 * n2 + this.e;
        return n2;
    }
}

