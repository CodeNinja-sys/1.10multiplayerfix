/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.ai;
import net.minecraft.client.k.bo;
import net.minecraft.client.l.o;
import net.minecraft.client.r;

public class cw
implements bo {
    private final ai c;
    protected final r a;
    protected final o b;
    private long d;

    protected cw(ai ai2, o o2) {
        this.c = ai2;
        this.b = o2;
        this.a = r.z();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        this.a.m.a(u.a("lanServer.title", new Object[0]), n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        this.a.m.a(this.b.a(), n3 + 32 + 3, n4 + 12, 0x808080);
        if (this.a.w.x) {
            this.a.m.a(u.a("selectServer.hiddenAddress", new Object[0]), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        } else {
            this.a.m.a(this.b.b(), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c.a(n2);
        if (r.I() - this.d < 250L) {
            this.c.g();
        }
        this.d = r.I();
        return false;
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public o a() {
        return this.b;
    }
}

