/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.yd;
import java.util.Collection;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.d.c;
import net.minecraft.d.j;
import net.minecraft.h.aq;

public abstract class af
extends l {
    private boolean a;

    public af(aq aq2) {
        super(aq2);
    }

    @Override
    public void ct_() {
        super.ct_();
        this.b();
    }

    protected void b() {
        if (this.n.j.bm().isEmpty()) {
            this.f = (this.p - this.c) / 2;
            this.a = false;
        } else {
            this.f = 160 + (this.p - this.c - 200) / 2;
            this.a = true;
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        if (this.a) {
            this.f();
        }
    }

    private void f() {
        int n2 = this.f - 124;
        int n3 = this.g;
        int n4 = 166;
        Collection collection = this.n.j.bm();
        if (!collection.isEmpty()) {
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.f();
            int n5 = 33;
            if (collection.size() > 5) {
                n5 = 132 / (collection.size() - 1);
            }
            for (j j2 : yd.d().a(collection)) {
                c c2 = j2.a();
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                this.n.N().a(b);
                this.a_(n2, n3, 0, 166, 140, 32);
                if (c2.c()) {
                    int n6 = c2.d();
                    this.a_(n2 + 6, n3 + 7, 0 + n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
                }
                String string = net.minecraft.client.f.u.a(c2.b(), new Object[0]);
                if (j2.c() == 1) {
                    string = String.valueOf(string) + " " + net.minecraft.client.f.u.a("enchantment.level.2", new Object[0]);
                } else if (j2.c() == 2) {
                    string = String.valueOf(string) + " " + net.minecraft.client.f.u.a("enchantment.level.3", new Object[0]);
                } else if (j2.c() == 3) {
                    string = String.valueOf(string) + " " + net.minecraft.client.f.u.a("enchantment.level.4", new Object[0]);
                }
                this.u.a(string, (float)(n2 + 10 + 18), (float)(n3 + 6), 0xFFFFFF);
                String string2 = net.minecraft.d.c.a(j2, 1.0f);
                this.u.a(string2, (float)(n2 + 10 + 18), (float)(n3 + 6 + 10), 0x7F7F7F);
                n3 += n5;
            }
        }
    }
}

