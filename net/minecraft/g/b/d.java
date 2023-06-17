/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.b;

import com.a.a.b.cc;
import net.minecraft.g.b.b;

public abstract class d
implements b {
    private final Class a;
    private final String b;

    protected d(String string, Class class_) {
        this.a = class_;
        this.b = string;
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public Class c() {
        return this.a;
    }

    public String toString() {
        return cc.a((Object)this).a("name", this.b).a("clazz", this.a).a("values", this.b()).toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        return this.a.equals(d2.a) && this.b.equals(d2.b);
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

