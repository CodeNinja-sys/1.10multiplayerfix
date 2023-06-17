/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.b.cm;
import net.minecraft.client.g.b.a.a.h;
import net.minecraft.client.g.b.a.al;
import net.minecraft.g.c.i;

public class j {
    private final h a;
    private final al b;

    public j(h h2, al al2) {
        if (h2 == null) {
            throw new IllegalArgumentException("Missing condition for selector");
        }
        if (al2 == null) {
            throw new IllegalArgumentException("Missing variant for selector");
        }
        this.a = h2;
        this.b = al2;
    }

    public al a() {
        return this.b;
    }

    public cm a(i i2) {
        return this.a.a(i2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof j) {
            j j2 = (j)object;
            if (this.a.equals(j2.a)) {
                return this.b.equals(j2.b);
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

