/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;
import org.apache.commons.c.am;

public class g
implements p {
    private String a;
    private boolean b;
    private net.minecraft.u.b.b c;

    public g() {
    }

    public g(String string, net.minecraft.u.b.b b2, boolean bl2) {
        this.a = string;
        this.c = b2;
        this.b = bl2;
    }

    @Override
    public void a(a a2) {
        this.a = a2.e(32767);
        this.b = a2.D();
        boolean bl2 = a2.D();
        if (bl2) {
            this.c = a2.c();
        }
    }

    @Override
    public void b(a a2) {
        a2.a(am.a(this.a, 0, 32767));
        a2.a(this.b);
        boolean bl2 = this.c != null;
        a2.a(bl2);
        if (bl2) {
            a2.a(this.c);
        }
    }

    public void a(b b2) {
        b2.a(this);
    }

    public String a() {
        return this.a;
    }

    public net.minecraft.u.b.b b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }
}

