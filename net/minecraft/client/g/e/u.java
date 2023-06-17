/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.at;
import net.minecraft.client.g.e.f;
import net.minecraft.client.g.e.i;
import net.minecraft.f.ap;
import net.minecraft.u.ad;
import net.minecraft.u.c;

public class u {
    public static final u a = new i();
    private final boolean[] b = new boolean[net.minecraft.u.c.values().length];
    private final boolean[] c = new boolean[net.minecraft.u.c.values().length];
    private boolean d = true;
    private final List e = ov.a();
    private f f = new f();
    private at g;

    public boolean a() {
        return this.d;
    }

    protected void a(c c2) {
        this.d = false;
        this.b[c2.ordinal()] = true;
    }

    public boolean c(c c2) {
        return !this.b[c2.ordinal()];
    }

    public void b(c c2) {
        this.c[c2.ordinal()] = true;
    }

    public boolean d(c c2) {
        return this.c[c2.ordinal()];
    }

    public List b() {
        return this.e;
    }

    public void a(ap ap2) {
        this.e.add(ap2);
    }

    public boolean a(ad ad2, ad ad3) {
        return this.f.a(ad2, ad3);
    }

    public void a(f f2) {
        this.f = f2;
    }

    public at c() {
        return this.g;
    }

    public void a(at at2) {
        this.g = at2;
    }
}

