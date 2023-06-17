/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.d.aad;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.g.b.a.a.j;

public class i {
    private final List a;
    private net.minecraft.g.c.i b;

    public i(List list) {
        this.a = list;
    }

    public List a() {
        return this.a;
    }

    public Set b() {
        HashSet hashSet = aad.a();
        for (j j2 : this.a) {
            hashSet.add(j2.a());
        }
        return hashSet;
    }

    public void a(net.minecraft.g.c.i i2) {
        this.b = i2;
    }

    public net.minecraft.g.c.i c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof i) {
            i i2 = (i)object;
            if (this.a.equals(i2.a)) {
                if (this.b == null) {
                    return i2.b == null;
                }
                return this.b.equals(i2.b);
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + (this.b == null ? 0 : this.b.hashCode());
    }
}

