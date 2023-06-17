/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.k.am;
import net.minecraft.client.k.ao;
import net.minecraft.client.k.bf;
import net.minecraft.client.k.bi;
import net.minecraft.client.k.bk;
import net.minecraft.client.k.bo;
import net.minecraft.client.k.ca;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.cf;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cj;
import net.minecraft.client.k.ck;
import net.minecraft.client.k.de;
import net.minecraft.client.k.dn;
import net.minecraft.client.k.o;
import net.minecraft.client.k.w;
import net.minecraft.client.r;
import net.minecraft.u.ax;

public class f
extends ca {
    private final List a = ov.a();
    private final ax b = new ax();
    private final List w = ov.a();
    private final ao[][] x;
    private int y;
    private final bk z;
    private de A;

    public f(r r2, int n2, int n3, int n4, int n5, int n6, bk bk2, ao[] ... arrao) {
        super(r2, n2, n3, n4, n5, n6);
        this.z = bk2;
        this.x = arrao;
        this.m = false;
        this.p();
        this.q();
    }

    private void p() {
        ao[][] arrao = this.x;
        int n2 = this.x.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ao[] arrao2 = arrao[i2];
            for (int i3 = 0; i3 < arrao2.length; i3 += 2) {
                ao ao2 = arrao2[i3];
                ao ao3 = i3 < arrao2.length - 1 ? arrao2[i3 + 1] : null;
                de de2 = this.a(ao2, 0, ao3 == null);
                de de3 = this.a(ao3, 160, ao2 == null);
                bi bi2 = new bi(de2, de3);
                this.a.add(bi2);
                if (ao2 != null && de2 != null) {
                    this.b.a(ao2.e(), de2);
                    if (de2 instanceof dn) {
                        this.w.add((dn)de2);
                    }
                }
                if (ao3 == null || de3 == null) continue;
                this.b.a(ao3.e(), de3);
                if (!(de3 instanceof dn)) continue;
                this.w.add((dn)de3);
            }
        }
    }

    private void q() {
        this.a.clear();
        for (int i2 = 0; i2 < this.x[this.y].length; i2 += 2) {
            ao ao2 = this.x[this.y][i2];
            ao ao3 = i2 < this.x[this.y].length - 1 ? this.x[this.y][i2 + 1] : null;
            de de2 = (de)this.b.a(ao2.e());
            de de3 = ao3 != null ? (de)this.b.a(ao3.e()) : null;
            bi bi2 = new bi(de2, de3);
            this.a.add(bi2);
        }
    }

    public void b(int n2) {
        if (n2 != this.y) {
            int n3 = this.y;
            this.y = n2;
            this.q();
            this.e(n3, n2);
            this.p = 0.0f;
        }
    }

    public int b() {
        return this.y;
    }

    public int e() {
        return this.x.length;
    }

    public de f() {
        return this.A;
    }

    public void g() {
        if (this.y > 0) {
            this.b(this.y - 1);
        }
    }

    public void h() {
        if (this.y < this.x.length - 1) {
            this.b(this.y + 1);
        }
    }

    public de c(int n2) {
        return (de)this.b.a(n2);
    }

    private void e(int n2, int n3) {
        for (ao ao2 : this.x[n2]) {
            if (ao2 == null) continue;
            this.a((de)this.b.a(ao2.e()), false);
        }
        for (ao ao2 : this.x[n3]) {
            if (ao2 == null) continue;
            this.a((de)this.b.a(ao2.e()), true);
        }
    }

    private void a(de de2, boolean bl2) {
        if (de2 instanceof ch) {
            ((ch)de2).l = bl2;
        } else if (de2 instanceof dn) {
            ((dn)de2).e(bl2);
        } else if (de2 instanceof cf) {
            ((cf)de2).f = bl2;
        }
    }

    private de a(ao ao2, int n2, boolean bl2) {
        return ao2 instanceof w ? this.a(this.d / 2 - 155 + n2, 0, (w)ao2) : (ao2 instanceof cj ? this.a(this.d / 2 - 155 + n2, 0, (cj)ao2) : (ao2 instanceof am ? this.a(this.d / 2 - 155 + n2, 0, (am)ao2) : (ao2 instanceof ck ? this.a(this.d / 2 - 155 + n2, 0, (ck)ao2, bl2) : null)));
    }

    public void a(boolean bl2) {
        for (bi bi2 : this.a) {
            if (bi.a(bi2) instanceof ch) {
                ((ch)bi.a((bi)bi2)).k = bl2;
            }
            if (!(bi.b(bi2) instanceof ch)) continue;
            ((ch)bi.b((bi)bi2)).k = bl2;
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4) {
        boolean bl2 = super.a(n2, n3, n4);
        int n5 = this.c(n2, n3);
        if (n5 >= 0) {
            bi bi2 = this.d(n5);
            if (this.A != bi.c(bi2) && this.A != null && this.A instanceof dn) {
                ((dn)this.A).b(false);
            }
            this.A = bi.c(bi2);
        }
        return bl2;
    }

    private bf a(int n2, int n3, w w2) {
        bf bf2 = new bf(this.z, w2.e(), n2, n3, w2.f(), w2.b(), w2.c(), w2.d(), w2.a());
        bf2.l = w2.g();
        return bf2;
    }

    private o a(int n2, int n3, cj cj2) {
        o o2 = new o(this.z, cj2.e(), n2, n3, cj2.f(), cj2.a());
        o2.l = cj2.g();
        return o2;
    }

    private dn a(int n2, int n3, am am2) {
        dn dn2 = new dn(am2.e(), this.c.m, n2, n3, 150, 20);
        dn2.a(am2.f());
        dn2.a(this.z);
        dn2.e(am2.g());
        dn2.a(am2.a());
        return dn2;
    }

    private cf a(int n2, int n3, ck ck2, boolean bl2) {
        cf cf2 = bl2 ? new cf(this.c.m, ck2.e(), n2, n3, this.d - n2 * 2, 20, -1) : new cf(this.c.m, ck2.e(), n2, n3, 150, 20, -1);
        cf2.f = ck2.g();
        cf2.a(ck2.f());
        cf2.a();
        return cf2;
    }

    public void a(char c2, int n2) {
        block1: {
            int n3;
            block2: {
                dn dn2;
                block3: {
                    int n4;
                    block4: {
                        if (!(this.A instanceof dn)) break block1;
                        dn2 = (dn)this.A;
                        if (cc.e(n2)) break block2;
                        if (n2 != 15) break block3;
                        dn2.b(false);
                        int n5 = this.w.indexOf(this.A);
                        n5 = cc.o() ? (n5 == 0 ? this.w.size() - 1 : --n5) : (n5 == this.w.size() - 1 ? 0 : ++n5);
                        this.A = (de)this.w.get(n5);
                        dn2 = (dn)this.A;
                        dn2.b(true);
                        int n6 = dn2.b + this.j;
                        n4 = dn2.b;
                        if (n6 <= this.g) break block4;
                        this.p += (float)(n6 - this.g);
                        break block1;
                    }
                    if (n4 >= this.f) break block1;
                    this.p = n4;
                    break block1;
                }
                dn2.a(c2, n2);
                break block1;
            }
            String string = cc.j();
            String[] arrstring = string.split(";");
            int n7 = n3 = this.w.indexOf(this.A);
            String[] arrstring2 = arrstring;
            int n8 = arrstring.length;
            for (int i2 = 0; i2 < n8; ++i2) {
                String string2 = arrstring2[i2];
                ((dn)this.w.get(n7)).a(string2);
                n7 = n7 == this.w.size() - 1 ? 0 : ++n7;
                if (n7 == n3) break;
            }
        }
    }

    public bi d(int n2) {
        return (bi)this.a.get(n2);
    }

    @Override
    public int a() {
        return this.a.size();
    }

    @Override
    public int i() {
        return 400;
    }

    @Override
    protected int j() {
        return super.j() + 32;
    }

    @Override
    public /* synthetic */ bo e(int n2) {
        return this.d(n2);
    }
}

