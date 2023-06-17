/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import net.minecraft.u.d.a;
import net.minecraft.u.d.f;

public class k
extends f {
    private final String b;

    public k(String string) {
        this.b = string;
    }

    public String g() {
        return this.b;
    }

    @Override
    public String b() {
        return this.b;
    }

    public k h() {
        k k2 = new k(this.b);
        k2.a(this.a().l());
        for (a a2 : this.e()) {
            k2.a(a2.f());
        }
        return k2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        k k2 = (k)object;
        return this.b.equals(k2.g()) && super.equals(object);
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.a() + '}';
    }

    @Override
    public /* synthetic */ a f() {
        return this.h();
    }
}

