/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ao;
import net.minecraft.client.j.ac;
import net.minecraft.client.j.w;
import net.minecraft.w.e.as;

class ax
implements s {
    final /* synthetic */ ao a;

    private ax(ao ao2) {
        this.a = ao2;
    }

    public void a(as as2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        bd.D();
        switch (as2.p()) {
            default: {
                break;
            }
            case f: {
                bd.b(90.0f, 0.0f, 0.0f, 1.0f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.c(1.0f, -1.0f, 0.0f);
                bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                break;
            }
            case e: {
                bd.b(-90.0f, 0.0f, 0.0f, 1.0f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.c(-1.0f, -1.0f, 0.0f);
                bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                break;
            }
            case c: {
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.c(0.0f, -1.0f, -1.0f);
                break;
            }
            case d: {
                bd.b(180.0f, 0.0f, 0.0f, 1.0f);
                bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                bd.c(0.0f, -1.0f, 1.0f);
                break;
            }
            case b: {
                bd.b(180.0f, 1.0f, 0.0f, 0.0f);
                bd.c(0.0f, -2.0f, 0.0f);
            }
        }
        w w2 = ((ac)this.a.f()).a;
        w2.g = f6 * ((float)Math.PI / 180);
        w2.f = f7 * ((float)Math.PI / 180);
        this.a.a(ao.e());
        w2.a(f8);
        bd.E();
    }

    @Override
    public boolean bZ_() {
        return false;
    }

    /* synthetic */ ax(ao ao2, ax ax2) {
        this(ao2);
    }
}

