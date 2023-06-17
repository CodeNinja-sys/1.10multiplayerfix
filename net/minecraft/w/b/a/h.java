/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b.a;

import io.netty.util.c.ag;
import java.util.UUID;
import net.minecraft.u.b.n;
import org.apache.commons.c.ao;

public class h {
    private final double a;
    private final int b;
    private final String c;
    private final UUID d;
    private boolean e = true;

    public h(String string, double d2, int n2) {
        this(n.a(ag.b()), string, d2, n2);
    }

    public h(UUID uUID, String string, double d2, int n2) {
        this.d = uUID;
        this.c = string;
        this.a = d2;
        this.b = n2;
        ao.a((CharSequence)string, "Modifier name cannot be empty", new Object[0]);
        ao.a(0L, 2L, n2, "Invalid operation");
    }

    public UUID a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public double d() {
        return this.a;
    }

    public boolean e() {
        return this.e;
    }

    public h a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            h h2 = (h)object;
            return !(this.d != null ? !this.d.equals(h2.d) : h2.d != null);
        }
        return false;
    }

    public int hashCode() {
        return this.d != null ? this.d.hashCode() : 0;
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
    }
}

