/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.z;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.aw;
import net.minecraft.u.bp;
import net.minecraft.w.h.ak;

public class ae
extends n {
    private static final bp a = new bp("textures/entity/villager/villager.png");
    private static final bp b = new bp("textures/entity/villager/farmer.png");
    private static final bp k = new bp("textures/entity/villager/librarian.png");
    private static final bp l = new bp("textures/entity/villager/priest.png");
    private static final bp m = new bp("textures/entity/villager/smith.png");
    private static final bp n = new bp("textures/entity/villager/butcher.png");

    public ae(f f2) {
        super(f2, new aw(0.0f), 0.5f);
        this.a(new z(this.e().b));
    }

    public aw e() {
        return (aw)super.f();
    }

    protected bp a(ak ak2) {
        switch (ak2.p()) {
            case 0: {
                return b;
            }
            case 1: {
                return k;
            }
            case 2: {
                return l;
            }
            case 3: {
                return m;
            }
            case 4: {
                return n;
            }
        }
        return a;
    }

    protected void a(ak ak2, float f2) {
        float f3 = 0.9375f;
        if (ak2.dn() < 0) {
            f3 = (float)((double)f3 * 0.5);
            this.d = 0.25f;
        } else {
            this.d = 0.5f;
        }
        bd.b(f3, f3, f3);
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((ak)n2);
    }

    @Override
    public /* synthetic */ ap f() {
        return this.e();
    }
}

