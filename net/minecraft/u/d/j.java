/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import net.minecraft.u.d.a;
import net.minecraft.u.d.f;

public class j
extends f {
    private final String b;

    public j(String string) {
        this.b = string;
    }

    public String g() {
        return this.b;
    }

    @Override
    public String b() {
        return this.b;
    }

    public j h() {
        j j2 = new j(this.b);
        j2.a(this.a().l());
        for (a a2 : this.e()) {
            j2.a(a2.f());
        }
        return j2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof j)) {
            return false;
        }
        j j2 = (j)object;
        return this.b.equals(j2.b) && super.equals(object);
    }

    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.a() + '}';
    }

    @Override
    public /* synthetic */ a f() {
        return this.h();
    }
}

