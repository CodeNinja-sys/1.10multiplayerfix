/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.dl;
import net.java.games.input.dm;

class dn {
    private final dm a;
    private final dl b;

    public dn(dm dm2, dl dl2) {
        this.a = dm2;
        this.b = dl2;
    }

    public final dm a() {
        return this.a;
    }

    public final dl b() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final boolean equals(Object object) {
        if (!(object instanceof dn)) {
            return false;
        }
        dn dn2 = (dn)object;
        return dn2.b.equals(this.b) && dn2.a.equals(this.a);
    }

    public final String toString() {
        return "UsagePair: (page = " + this.a + ", usage = " + this.b + ")";
    }
}

