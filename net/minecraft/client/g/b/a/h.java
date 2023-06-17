/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import org.lwjgl.util.e.l;

public class h {
    public static final h a = new h(new l(), new l(), new l(1.0f, 1.0f, 1.0f));
    public final l b;
    public final l c;
    public final l d;

    public h(l l2, l l3, l l4) {
        this.b = new l(l2);
        this.c = new l(l3);
        this.d = new l(l4);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        h h2 = (h)object;
        return this.b.equals(h2.b) && this.d.equals(h2.d) && this.c.equals(h2.c);
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        return n2;
    }
}

