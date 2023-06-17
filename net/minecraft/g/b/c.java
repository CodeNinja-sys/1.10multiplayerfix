/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.b;

import com.a.a.b.cg;
import com.a.a.d.lo;
import java.util.Collection;
import net.minecraft.g.b.d;

public class c
extends d {
    private final lo a = lo.b(true, (Object)false);

    protected c(String string) {
        super(string, Boolean.class);
    }

    @Override
    public Collection b() {
        return this.a;
    }

    public static c b(String string) {
        return new c(string);
    }

    @Override
    public cg a(String string) {
        return !"true".equals(string) && !"false".equals(string) ? cg.f() : cg.b(Boolean.valueOf(string));
    }

    public String a(Boolean bl2) {
        return bl2.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof c && super.equals(object)) {
            c c2 = (c)object;
            return this.a.equals(c2.a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.a.hashCode();
    }
}

