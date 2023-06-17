/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d.a;

import net.minecraft.u.d.a;
import net.minecraft.u.d.a.d;

public class c {
    private final d a;
    private final a b;

    public c(d d2, a a2) {
        this.a = d2;
        this.b = a2;
    }

    public d a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            c c2 = (c)object;
            if (this.a != c2.a) {
                return false;
            }
            return !(this.b != null ? !this.b.equals(c2.b) : c2.b != null);
        }
        return false;
    }

    public String toString() {
        return "HoverEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }
}

