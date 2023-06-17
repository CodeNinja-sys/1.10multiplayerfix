/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.f.u;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.j.p;
import net.minecraft.client.k.b.l;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.cv;
import net.minecraft.h.at;
import net.minecraft.m.cu;
import net.minecraft.o.j;
import net.minecraft.q.ak;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import net.minecraft.w.a.a;

public class dc
extends l {
    private static final bp C = new bp("textures/gui/container/enchanting_table.png");
    private static final bp D = new bp("textures/entity/enchanting_table_book.png");
    private static final p E = new p();
    private final a F;
    private final Random G = new Random();
    private final at H;
    public int a;
    public float j;
    public float k;
    public float l;
    public float m;
    public float v;
    public float w;
    cu x;
    private final ak I;

    public dc(a a2, k k2, ak ak2) {
        super(new at(a2, k2));
        this.F = a2;
        this.H = (at)this.e;
        this.I = ak2;
    }

    @Override
    protected void b(int n2, int n3) {
        this.u.a(this.I.aK().c(), 12, 5, 0x404040);
        this.u.a(this.F.aK().c(), 8, this.d - 96 + 2, 0x404040);
    }

    @Override
    public void bY_() {
        super.bY_();
        this.f();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        int n5 = (this.p - this.c) / 2;
        int n6 = (this.q - this.d) / 2;
        for (int i2 = 0; i2 < 3; ++i2) {
            int n7 = n2 - (n5 + 60);
            int n8 = n3 - (n6 + 14 + 19 * i2);
            if (n7 < 0 || n8 < 0 || n7 >= 108 || n8 >= 19 || !this.H.b(this.n.j, i2)) continue;
            this.n.d.a(this.H.f, i2);
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(C);
        int n4 = (this.p - this.c) / 2;
        int n5 = (this.q - this.d) / 2;
        this.a_(n4, n5, 0, 0, this.c, this.d);
        bd.D();
        bd.l(5889);
        bd.D();
        bd.C();
        cv cv2 = new cv(this.n);
        bd.b((cv2.a() - 320) / 2 * cv2.e(), (cv2.b() - 240) / 2 * cv2.e(), 320 * cv2.e(), 240 * cv2.e());
        bd.c(-0.34f, 0.23f, 0.0f);
        org.lwjgl.util.a.j.a(90.0f, 1.3333334f, 9.0f, 80.0f);
        float f3 = 1.0f;
        bd.l(5888);
        bd.C();
        am.b();
        bd.c(0.0f, 3.3f, -16.0f);
        bd.b(1.0f, 1.0f, 1.0f);
        float f4 = 5.0f;
        bd.b(5.0f, 5.0f, 5.0f);
        bd.b(180.0f, 0.0f, 0.0f, 1.0f);
        this.n.N().a(D);
        bd.b(20.0f, 1.0f, 0.0f, 0.0f);
        float f5 = this.w + (this.v - this.w) * f2;
        bd.c((1.0f - f5) * 0.2f, (1.0f - f5) * 0.1f, (1.0f - f5) * 0.25f);
        bd.b(-(1.0f - f5) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        bd.b(180.0f, 1.0f, 0.0f, 0.0f);
        float f6 = this.k + (this.j - this.k) * f2 + 0.25f;
        float f7 = this.k + (this.j - this.k) * f2 + 0.75f;
        f6 = (f6 - (float)net.minecraft.u.b.n.b((double)f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)net.minecraft.u.b.n.b((double)f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        bd.A();
        E.a(null, 0.0f, f6, f7, f5, 0.0f, 0.0625f);
        bd.B();
        am.a();
        bd.l(5889);
        bd.b(0, 0, this.n.e, this.n.f);
        bd.E();
        bd.l(5888);
        bd.E();
        am.a();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.u.o.a().a(this.H.b);
        int n6 = this.H.b();
        for (int i2 = 0; i2 < 3; ++i2) {
            int n7 = n4 + 60;
            int n8 = n7 + 20;
            this.B = 0.0f;
            this.n.N().a(C);
            int n9 = this.H.c[i2];
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            if (n9 == 0) {
                this.a_(n7, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                continue;
            }
            String string = "" + n9;
            int n10 = 86 - this.u.a(string);
            String string2 = net.minecraft.u.o.a().a(this.u, n10);
            ce ce2 = this.n.n;
            int n11 = 6839882;
            if (!(n6 >= i2 + 1 && this.n.j.K >= n9 || this.n.j.J.d)) {
                this.a_(n7, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                this.a_(n7 + 1, n5 + 15 + 19 * i2, 16 * i2, 239, 16, 16);
                ce2.a(string2, n8, n5 + 16 + 19 * i2, n10, (n11 & 0xFEFEFE) >> 1);
                n11 = 4226832;
            } else {
                int n12 = n2 - (n4 + 60);
                int n13 = n3 - (n5 + 14 + 19 * i2);
                if (n12 >= 0 && n13 >= 0 && n12 < 108 && n13 < 19) {
                    this.a_(n7, n5 + 14 + 19 * i2, 0, 204, 108, 19);
                    n11 = 0xFFFF80;
                } else {
                    this.a_(n7, n5 + 14 + 19 * i2, 0, 166, 108, 19);
                }
                this.a_(n7 + 1, n5 + 15 + 19 * i2, 16 * i2, 223, 16, 16);
                ce2.a(string2, n8, n5 + 16 + 19 * i2, n10, n11);
                n11 = 8453920;
            }
            ce2 = this.n.m;
            ce2.a(string, (float)(n8 + 86 - ce2.a(string)), (float)(n5 + 16 + 19 * i2 + 7), n11);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        boolean bl2 = this.n.j.J.d;
        int n4 = this.H.b();
        for (int i2 = 0; i2 < 3; ++i2) {
            int n5 = this.H.c[i2];
            j j2 = net.minecraft.o.j.c(this.H.h[i2]);
            int n6 = this.H.i[i2];
            int n7 = i2 + 1;
            if (!this.a(60, 14 + 19 * i2, 108, 17, n2, n3) || n5 <= 0 || n6 < 0 || j2 == null) continue;
            ArrayList arrayList = ov.a();
            arrayList.add((Object)((Object)net.minecraft.u.d.o.p) + (Object)((Object)net.minecraft.u.d.o.u) + net.minecraft.client.f.u.a("container.enchant.clue", j2.d(n6)));
            if (!bl2) {
                arrayList.add("");
                if (this.n.j.K < n5) {
                    arrayList.add((Object)((Object)net.minecraft.u.d.o.m) + "Level Requirement: " + this.H.c[i2]);
                } else {
                    String string = n7 == 1 ? net.minecraft.client.f.u.a("container.enchant.lapis.one", new Object[0]) : net.minecraft.client.f.u.a("container.enchant.lapis.many", n7);
                    o o2 = n4 >= n7 ? net.minecraft.u.d.o.h : net.minecraft.u.d.o.m;
                    arrayList.add((Object)((Object)o2) + string);
                    string = n7 == 1 ? net.minecraft.client.f.u.a("container.enchant.level.one", new Object[0]) : net.minecraft.client.f.u.a("container.enchant.level.many", n7);
                    arrayList.add((Object)((Object)net.minecraft.u.d.o.h) + string);
                }
            }
            this.a(arrayList, n2, n3);
            break;
        }
    }

    public void f() {
        cu cu2 = this.e.b(0).b();
        if (!cu.b(cu2, this.x)) {
            this.x = cu2;
            do {
                this.l += (float)(this.G.nextInt(4) - this.G.nextInt(4));
            } while (!(this.j > this.l + 1.0f) && !(this.j < this.l - 1.0f));
        }
        ++this.a;
        this.k = this.j;
        this.w = this.v;
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.H.c[i2] == 0) continue;
            bl2 = true;
        }
        this.v = bl2 ? (this.v += 0.2f) : (this.v -= 0.2f);
        this.v = net.minecraft.u.b.n.a(this.v, 0.0f, 1.0f);
        float f2 = (this.l - this.j) * 0.4f;
        float f3 = 0.2f;
        f2 = net.minecraft.u.b.n.a(f2, -0.2f, 0.2f);
        this.m += (f2 - this.m) * 0.9f;
        this.j += this.m;
    }
}

