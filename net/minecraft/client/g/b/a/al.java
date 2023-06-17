/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.List;

public class al {
    private final List a;

    public al(List list) {
        this.a = list;
    }

    public List a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof al) {
            al al2 = (al)object;
            return this.a.equals(al2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

