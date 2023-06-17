/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d.a;

import net.minecraft.u.d.a.b;

public class a {
    private final b a;
    private final String b;

    public a(b b2, String string) {
        this.a = b2;
        this.b = string;
    }

    public b a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            a a2 = (a)object;
            if (this.a != a2.a) {
                return false;
            }
            return !(this.b != null ? !this.b.equals(a2.b) : a2.b != null);
        }
        return false;
    }

    public String toString() {
        return "ClickEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }
}

