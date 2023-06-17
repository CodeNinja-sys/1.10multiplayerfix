/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;

public class cld
extends alo {
    private final int c;
    private final deb d;
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
    private int r;
    private int s;
    private int t;
    private int u = 0xE0E0E0;
    private int v = 0x707070;
    private boolean w = true;
    private ckg x;
    private cm y = cn.a();

    public cld(int n2, deb deb2, int n3, int n4, int n5, int n6) {
        this.c = n2;
        this.d = deb2;
        this.a = n3;
        this.b = n4;
        this.e = n5;
        this.f = n6;
    }

    public void a(ckg ckg2) {
        this.x = ckg2;
    }

    public void a() {
        ++this.i;
    }

    public void a(String string) {
        if (!this.y.a(string)) {
            return;
        }
        this.g = string.length() > this.h ? string.substring(0, this.h) : string;
        this.f();
    }

    public String b() {
        return this.g;
    }

    public String c() {
        int n2 = this.s < this.t ? this.s : this.t;
        int n3 = this.s < this.t ? this.t : this.s;
        return this.g.substring(n2, n3);
    }

    public void a(cm cm2) {
        this.y = cm2;
    }

    public void b(String string) {
        int n2;
        String string2 = "";
        String string3 = ate.a(string);
        int n3 = this.s < this.t ? this.s : this.t;
        int n4 = this.s < this.t ? this.t : this.s;
        int n5 = this.h - this.g.length() - (n3 - n4);
        if (!this.g.isEmpty()) {
            string2 = string2 + this.g.substring(0, n3);
        }
        if (n5 < string3.length()) {
            string2 = string2 + string3.substring(0, n5);
            n2 = n5;
        } else {
            string2 = string2 + string3;
            n2 = string3.length();
        }
        if (!this.g.isEmpty() && n4 < this.g.length()) {
            string2 = string2 + this.g.substring(n4);
        }
        if (!this.y.a(string2)) {
            return;
        }
        this.g = string2;
        this.d(n3 - this.t + n2);
        if (this.x != null) {
            this.x.a(this.c, this.g);
        }
    }

    public void a(int n2) {
        if (this.g.isEmpty()) {
            return;
        }
        if (this.t != this.s) {
            this.b("");
            return;
        }
        this.b(this.c(n2) - this.s);
    }

    public void b(int n2) {
        if (this.g.isEmpty()) {
            return;
        }
        if (this.t != this.s) {
            this.b("");
            return;
        }
        boolean bl2 = n2 < 0;
        int n3 = bl2 ? this.s + n2 : this.s;
        int n4 = bl2 ? this.s : this.s + n2;
        String string = "";
        if (n3 >= 0) {
            string = this.g.substring(0, n3);
        }
        if (n4 < this.g.length()) {
            string = string + this.g.substring(n4);
        }
        if (!this.y.a(string)) {
            return;
        }
        this.g = string;
        if (bl2) {
            this.d(n2);
        }
        if (this.x != null) {
            this.x.a(this.c, this.g);
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

    public int a(int n2, int n3, boolean bl2) {
        int n4 = n3;
        boolean bl3 = n2 < 0;
        int n5 = Math.abs(n2);
        for (int i2 = 0; i2 < n5; ++i2) {
            if (bl3) {
                while (bl2 && n4 > 0 && this.g.charAt(n4 - 1) == ' ') {
                    --n4;
                }
                while (n4 > 0 && this.g.charAt(n4 - 1) != ' ') {
                    --n4;
                }
                continue;
            }
            int n6 = this.g.length();
            if ((n4 = this.g.indexOf(32, n4)) == -1) {
                n4 = n6;
                continue;
            }
            while (bl2 && n4 < n6 && this.g.charAt(n4) == ' ') {
                ++n4;
            }
        }
        return n4;
    }

    public void d(int n2) {
        this.e(this.t + n2);
    }

    public void e(int n2) {
        this.s = n2;
        int n3 = this.g.length();
        this.s = cmk.a(this.s, 0, n3);
        this.i(this.s);
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
        if (cjn.g(n2)) {
            this.f();
            this.i(0);
            return true;
        }
        if (cjn.f(n2)) {
            cjn.d(this.c());
            return true;
        }
        if (cjn.e(n2)) {
            if (this.m) {
                this.b(cjn.l());
            }
            return true;
        }
        if (cjn.d(n2)) {
            cjn.d(this.c());
            if (this.m) {
                this.b("");
            }
            return true;
        }
        switch (n2) {
            case 203: {
                if (cjn.o()) {
                    if (cjn.n()) {
                        this.i(this.a(-1, this.l()));
                    } else {
                        this.i(this.l() - 1);
                    }
                } else if (cjn.n()) {
                    this.e(this.c(-1));
                } else {
                    this.d(-1);
                }
                return true;
            }
            case 205: {
                if (cjn.o()) {
                    if (cjn.n()) {
                        this.i(this.a(1, this.l()));
                    } else {
                        this.i(this.l() + 1);
                    }
                } else if (cjn.n()) {
                    this.e(this.c(1));
                } else {
                    this.d(1);
                }
                return true;
            }
            case 14: {
                if (cjn.n()) {
                    if (this.m) {
                        this.a(-1);
                    }
                } else if (this.m) {
                    this.b(-1);
                }
                return true;
            }
            case 211: {
                if (cjn.n()) {
                    if (this.m) {
                        this.a(1);
                    }
                } else if (this.m) {
                    this.b(1);
                }
                return true;
            }
            case 199: {
                if (cjn.o()) {
                    this.i(0);
                } else {
                    this.e();
                }
                return true;
            }
            case 207: {
                if (cjn.o()) {
                    this.i(this.g.length());
                } else {
                    this.f();
                }
                return true;
            }
        }
        if (ate.a(c2)) {
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
            String string = this.d.a(this.g.substring(this.r), this.m());
            this.e(this.d.a(string, n5).length() + this.r);
        }
    }

    public void g() {
        if (!this.n()) {
            return;
        }
        if (this.j()) {
            cld.a(this.a - 1, this.b - 1, this.a + this.e + 1, this.b + this.f + 1, -6250336);
            cld.a(this.a, this.b, this.a + this.e, this.b + this.f, -16777216);
        }
        int n2 = this.m ? this.u : this.v;
        int n3 = this.s - this.r;
        int n4 = this.t - this.r;
        String string = this.d.a(this.g.substring(this.r), this.m());
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
            n7 = this.d.a(string2, (float)n7, (float)n6, n2);
        }
        boolean bl4 = this.s < this.g.length() || this.g.length() >= this.h();
        int n8 = n7;
        if (!bl2) {
            n8 = n3 > 0 ? n5 + this.e : n5;
        } else if (bl4) {
            --n8;
            --n7;
        }
        if (!string.isEmpty() && bl2 && n3 < string.length()) {
            n7 = this.d.a(string.substring(n3), (float)n7, (float)n6, n2);
        }
        if (bl3) {
            if (bl4) {
                alo.a(n8, n6 - 1, n8 + 1, n6 + 1 + this.d.a, -3092272);
            } else {
                this.d.a("_", (float)n8, (float)n6, n2);
            }
        }
        if (n4 != n3) {
            int n9 = n5 + this.d.a(string.substring(0, n4));
            this.c(n8, n6 - 1, n9 - 1, n6 + 1 + this.d.a);
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
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.c(0.0f, 0.0f, 255.0f, 255.0f);
        cja.w();
        cja.t();
        cja.a(amn.n);
        bix2.a(7, bxb.e);
        bix2.b((double)n2, (double)n5, 0.0).d();
        bix2.b((double)n4, (double)n5, 0.0).d();
        bix2.b((double)n4, (double)n3, 0.0).d();
        bix2.b((double)n2, (double)n3, 0.0).d();
        bha2.b();
        cja.u();
        cja.v();
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
        return this.s;
    }

    public boolean j() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }

    public void g(int n2) {
        this.u = n2;
    }

    public void h(int n2) {
        this.v = n2;
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
        return this.t;
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
        this.t = n2;
        if (this.d != null) {
            if (this.r > n3) {
                this.r = n3;
            }
            int n4 = this.m();
            String string = this.d.a(this.g.substring(this.r), n4);
            int n5 = string.length() + this.r;
            if (n2 == this.r) {
                this.r -= this.d.a(this.g, n4, true).length();
            }
            if (n2 > n5) {
                this.r += n2 - n5;
            } else if (n2 <= this.r) {
                this.r -= this.r - n2;
            }
            this.r = cmk.a(this.r, 0, n3);
        }
    }

    public void d(boolean bl2) {
        this.k = bl2;
    }

    public boolean n() {
        return this.w;
    }

    public void e(boolean bl2) {
        this.w = bl2;
    }
}

