/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.u.a.g;

public class m
implements g {
    @Override
    public int a() {
        return 135;
    }

    @Override
    public e a(e e2) {
        while (e2.b("Riding", 10)) {
            e e3 = this.b(e2);
            this.a(e2, e3);
            e2 = e3;
        }
        return e2;
    }

    protected void a(e e2, e e3) {
        q q2 = new q();
        q2.a(e2);
        e3.a("Passengers", q2);
    }

    protected e b(e e2) {
        e e3 = e2.o("Riding");
        e2.q("Riding");
        return e3;
    }
}

