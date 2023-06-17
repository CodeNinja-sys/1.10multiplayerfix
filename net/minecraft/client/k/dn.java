/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.cm;
import com.a.a.b.cn;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bt;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.bk;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.de;
import net.minecraft.u.b.n;
import net.minecraft.u.d;

public class dn
extends de {
    private final int c;
    private final ce d;
    public int a;
    public int b;
    private final int e;
    private final int f;
    private String g = "";
    private int h = 32;
    private int i;
    private boolean j = true;
    private boolean k = true;
    private boolean l;
    private boolean m = true;
    private int n;
    private int o;
    private int p;
    private int q = 0xE0E0E0;
    private int r = 0x707070;
    private boolean s = true;
    private bk t;
    private cm u = cn.a();

    public dn(int n2, ce ce2, int n3, int n4, int n5, int n6) {
        this.c = n2;
        this.d = ce2;
        this.a = n3;
        this.b = n4;
        this.e = n5;
        this.f = n6;
    }

    public void a(bk bk2) {
        this.t = bk2;
    }

    public void a() {
        ++this.i;
    }

    public void a(String string) {
        if (this.u.a(string)) {
            this.g = string.length() > this.h ? string.substring(0, this.h) : string;
            this.f();
        }
    }

    public String b() {
        return this.g;
    }

    public String c() {
        int n2 = this.o < this.p ? this.o : this.p;
        int n3 = this.o < this.p ? this.p : this.o;
        return this.g.substring(n2, n3);
    }

    public void a(cm cm2) {
        this.u = cm2;
    }

    public void b(String string) {
        int n2;
        String string2 = "";
        String string3 = net.minecraft.u.d.a(string);
        int n3 = this.o < this.p ? this.o : this.p;
        int n4 = this.o < this.p ? this.p : this.o;
        int n5 = this.h - this.g.length() - (n3 - n4);
        if (!this.g.isEmpty()) {
            string2 = String.valueOf(string2) + this.g.substring(0, n3);
        }
        if (n5 < string3.length()) {
            string2 = String.valueOf(string2) + string3.substring(0, n5);
            n2 = n5;
        } else {
            string2 = String.valueOf(string2) + string3;
            n2 = string3.length();
        }
        if (!this.g.isEmpty() && n4 < this.g.length()) {
            string2 = String.valueOf(string2) + this.g.substring(n4);
        }
        if (this.u.a(string2)) {
            this.g = string2;
            this.d(n3 - this.p + n2);
            if (this.t != null) {
                this.t.a(this.c, this.g);
            }
        }
    }

    public void a(int n2) {
        if (!this.g.isEmpty()) {
            if (this.p != this.o) {
                this.b("");
            } else {
                this.b(this.c(n2) - this.o);
            }
        }
    }

    public void b(int n2) {
        if (!this.g.isEmpty()) {
            if (this.p != this.o) {
                this.b("");
            } else {
                boolean bl2 = n2 < 0;
                int n3 = bl2 ? this.o + n2 : this.o;
                int n4 = bl2 ? this.o : this.o + n2;
                String string = "";
                if (n3 >= 0) {
                    string = this.g.substring(0, n3);
                }
                if (n4 < this.g.length()) {
                    string = String.valueOf(string) + this.g.substring(n4);
                }
                if (this.u.a(string)) {
                    this.g = string;
                    if (bl2) {
                        this.d(n2);
                    }
                    if (this.t != null) {
                        this.t.a(this.c, this.g);
                    }
                }
            }
        }
    }

    public int d() {
        return this.c;
    }

    public int c(int n2) {
        return this.a(n2, this.i());
    }

    public int a(int n2, int n3) {
        return this.a(n2, n3, true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(int var1_1, int var2_2, boolean var3_3) {
        var4_4 = var2_2;
        var5_5 = var1_1 < 0;
        var6_6 = Math.abs(var1_1);
        for (var7_7 = 0; var7_7 < var6_6; ++var7_7) {
            if (var5_5) ** GOTO lbl14
            var8_8 = this.g.length();
            if ((var4_4 = this.g.indexOf(32, var4_4)) != -1) ** GOTO lbl11
            var4_4 = var8_8;
            continue;
lbl-1000:
            // 1 sources

            {
                ++var4_4;
lbl11:
                // 2 sources

                ** while (var3_3 && var4_4 < var8_8 && this.g.charAt((int)var4_4) == ' ')
            }
lbl12:
            // 1 sources

            continue;
lbl-1000:
            // 1 sources

            {
                --var4_4;
lbl14:
                // 2 sources

                ** while (var3_3 && var4_4 > 0 && this.g.charAt((int)(var4_4 - 1)) == ' ')
            }
lbl15:
            // 2 sources

            while (var4_4 > 0 && this.g.charAt(var4_4 - 1) != ' ') {
                --var4_4;
            }
        }
        return var4_4;
    }

    public void d(int n2) {
        this.e(this.p + n2);
    }

    public void e(int n2) {
        this.o = n2;
        int n3 = this.g.length();
        this.o = net.minecraft.u.b.n.a(this.o, 0, n3);
        this.i(this.o);
    }

    public void e() {
        this.e(0);
    }

    public void f() {
        this.e(this.g.length());
    }

    public boolean a(char c2, int n2) {
        if (!this.l) {
            return false;
        }
        if (cc.g(n2)) {
            this.f();
            this.i(0);
            return true;
        }
        if (cc.f(n2)) {
            cc.d(this.c());
            return true;
        }
        if (cc.e(n2)) {
            if (this.m) {
                this.b(cc.j());
            }
            return true;
        }
        if (cc.d(n2)) {
            cc.d(this.c());
            if (this.m) {
                this.b("");
            }
            return true;
        }
        switch (n2) {
            case 14: {
                if (cc.n()) {
                    if (this.m) {
                        this.a(-1);
                    }
                } else if (this.m) {
                    this.b(-1);
                }
                return true;
            }
            case 199: {
                if (cc.o()) {
                    this.i(0);
                } else {
                    this.e();
                }
                return true;
            }
            case 203: {
                if (cc.o()) {
                    if (cc.n()) {
                        this.i(this.a(-1, this.l()));
                    } else {
                        this.i(this.l() - 1);
                    }
                } else if (cc.n()) {
                    this.e(this.c(-1));
                } else {
                    this.d(-1);
                }
                return true;
            }
            case 205: {
                if (cc.o()) {
                    if (cc.n()) {
                        this.i(this.a(1, this.l()));
                    } else {
                        this.i(this.l() + 1);
                    }
                } else if (cc.n()) {
                    this.e(this.c(1));
                } else {
                    this.d(1);
                }
                return true;
            }
            case 207: {
                if (cc.o()) {
                    this.i(this.g.length());
                } else {
                    this.f();
                }
                return true;
            }
            case 211: {
                if (cc.n()) {
                    if (this.m) {
                        this.a(1);
                    }
                } else if (this.m) {
                    this.b(1);
                }
                return true;
            }
        }
        if (net.minecraft.u.d.a(c2)) {
            if (this.m) {
                this.b(Character.toString(c2));
            }
            return true;
        }
        return false;
    }

    public void a(int n2, int n3, int n4) {
        boolean bl2;
        boolean bl3 = bl2 = n2 >= this.a && n2 < this.a + this.e && n3 >= this.b && n3 < this.b + this.f;
        if (this.k) {
            this.b(bl2);
        }
        if (this.l && bl2 && n4 == 0) {
            int n5 = n2 - this.a;
            if (this.j) {
                n5 -= 4;
            }
            String string = this.d.a(this.g.substring(this.n), this.m());
            this.e(this.d.a(string, n5).length() + this.n);
        }
    }

    public void g() {
        if (this.n()) {
            if (this.j()) {
                dn.a(this.a - 1, this.b - 1, this.a + this.e + 1, this.b + this.f + 1, -6250336);
                dn.a(this.a, this.b, this.a + this.e, this.b + this.f, -16777216);
            }
            int n2 = this.m ? this.q : this.r;
            int n3 = this.o - this.n;
            int n4 = this.p - this.n;
            String string = this.d.a(this.g.substring(this.n), this.m());
            boolean bl2 = n3 >= 0 && n3 <= string.length();
            boolean bl3 = this.l && this.i / 6 % 2 == 0 && bl2;
            int n5 = this.j ? this.a + 4 : this.a;
            int n6 = this.j ? this.b + (this.f - 8) / 2 : this.b;
            int n7 = n5;
            if (n4 > string.length()) {
                n4 = string.length();
            }
            if (!string.isEmpty()) {
                String string2 = bl2 ? string.substring(0, n3) : string;
                n7 = this.d.a(string2, (float)n5, (float)n6, n2);
            }
            boolean bl4 = this.o < this.g.length() || this.g.length() >= this.h();
            int n8 = n7;
            if (!bl2) {
                n8 = n3 > 0 ? n5 + this.e : n5;
            } else if (bl4) {
                n8 = n7 - 1;
                --n7;
            }
            if (!string.isEmpty() && bl2 && n3 < string.length()) {
                n7 = this.d.a(string.substring(n3), (float)n7, (float)n6, n2);
            }
            if (bl3) {
                if (bl4) {
                    de.a(n8, n6 - 1, n8 + 1, n6 + 1 + this.d.a, -3092272);
                } else {
                    this.d.a("_", (float)n8, (float)n6, n2);
                }
            }
            if (n4 != n3) {
                int n9 = n5 + this.d.a(string.substring(0, n4));
                this.c(n8, n6 - 1, n9 - 1, n6 + 1 + this.d.a);
            }
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        int n6;
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        if (n3 < n5) {
            n6 = n3;
            n3 = n5;
            n5 = n6;
        }
        if (n4 > this.a + this.e) {
            n4 = this.a + this.e;
        }
        if (n2 > this.a + this.e) {
            n2 = this.a + this.e;
        }
        ci ci2 = ci.a();
        g g2 = ci2.c();
        bd.c(0.0f, 0.0f, 255.0f, 255.0f);
        bd.w();
        bd.t();
        bd.a(bt.n);
        g2.a(7, net.minecraft.client.g.d.b.e);
        g2.b((double)n2, (double)n5, 0.0).d();
        g2.b((double)n4, (double)n5, 0.0).d();
        g2.b((double)n4, (double)n3, 0.0).d();
        g2.b((double)n2, (double)n3, 0.0).d();
        ci2.b();
        bd.u();
        bd.v();
    }

    public void f(int n2) {
        this.h = n2;
        if (this.g.length() > n2) {
            this.g = this.g.substring(0, n2);
        }
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.o;
    }

    public boolean j() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }

    public void g(int n2) {
        this.q = n2;
    }

    public void h(int n2) {
        this.r = n2;
    }

    public void b(boolean bl2) {
        if (bl2 && !this.l) {
            this.i = 0;
        }
        this.l = bl2;
    }

    public boolean k() {
        return this.l;
    }

    public void c(boolean bl2) {
        this.m = bl2;
    }

    public int l() {
        return this.p;
    }

    public int m() {
        return this.j() ? this.e - 8 : this.e;
    }

    public void i(int n2) {
        int n3 = this.g.length();
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        this.p = n2;
        if (this.d != null) {
            if (this.n > n3) {
                this.n = n3;
            }
            int n4 = this.m();
            String string = this.d.a(this.g.substring(this.n), n4);
            int n5 = string.length() + this.n;
            if (n2 == this.n) {
                this.n -= this.d.a(this.g, n4, true).length();
            }
            if (n2 > n5) {
                this.n += n2 - n5;
            } else if (n2 <= this.n) {
                this.n -= this.n - n2;
            }
            this.n = net.minecraft.u.b.n.a(this.n, 0, n3);
        }
    }

    public void d(boolean bl2) {
        this.k = bl2;
    }

    public boolean n() {
        return this.s;
    }

    public void e(boolean bl2) {
        this.s = bl2;
    }
}

