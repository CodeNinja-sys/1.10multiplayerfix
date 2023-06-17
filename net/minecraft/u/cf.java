/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.e.e;
import net.minecraft.u.ce;

public class cf
extends ce {
    private final e a;

    public cf() {
        super(1);
        this.a = new e();
        this.a.a("id", "Pig");
    }

    public cf(e e2) {
        this(e2.b("Weight", 99) ? e2.h("Weight") : 1, e2.o("Entity"));
    }

    public cf(int n2, e e2) {
        super(n2);
        this.a = e2;
    }

    public e a() {
        e e2 = new e();
        e2.a("Entity", this.a);
        e2.a("Weight", this.d);
        return e2;
    }

    public e b() {
        return this.a;
    }
}

