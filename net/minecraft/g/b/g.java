/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.b;

import com.a.a.b.cg;
import com.a.a.d.aad;
import com.a.a.d.lo;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.g.b.d;

public class g
extends d {
    private final lo a;

    protected g(String string, int n2, int n3) {
        super(string, Integer.class);
        if (n2 < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n3 <= n2) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n2 + ")");
        }
        HashSet hashSet = aad.a();
        for (int i2 = n2; i2 <= n3; ++i2) {
            hashSet.add(i2);
        }
        this.a = lo.a(hashSet);
    }

    @Override
    public Collection b() {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof g && super.equals(object)) {
            g g2 = (g)object;
            return this.a.equals(g2.a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.a.hashCode();
    }

    public static g a(String string, int n2, int n3) {
        return new g(string, n2, n3);
    }

    @Override
    public cg a(String string) {
        try {
            Integer n2 = Integer.valueOf(string);
            return this.a.contains(n2) ? cg.b(n2) : cg.f();
        }
        catch (NumberFormatException numberFormatException) {
            return cg.f();
        }
    }

    public String a(Integer n2) {
        return n2.toString();
    }
}

