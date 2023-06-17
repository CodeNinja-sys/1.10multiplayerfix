/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import net.minecraft.client.f.u;
import net.minecraft.client.k.aa;
import net.minecraft.client.r;
import net.minecraft.f.ad;
import net.minecraft.f.ap;
import net.minecraft.g.gt;
import net.minecraft.l.b;
import net.minecraft.l.c;
import net.minecraft.l.e;
import net.minecraft.l.f;
import net.minecraft.l.g;
import net.minecraft.l.i;
import net.minecraft.l.l;
import net.minecraft.l.m;
import net.minecraft.l.n;
import net.minecraft.l.o;
import net.minecraft.l.p;
import net.minecraft.n.bj;
import net.minecraft.q.a.d;
import net.minecraft.q.g.c.dg;
import net.minecraft.u.b.s;
import net.minecraft.w.g.a;
import net.minecraft.w.w;

public class k {
    public static final float a = 1.0f;
    public static final boolean b = false;
    public static final boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;
    public static boolean h = false;
    public int i = 1;
    public net.minecraft.q.k j;
    public r k;
    public net.minecraft.w.a.b l;
    public int m = 0;
    public ArrayList n = new ArrayList();
    public ArrayList o = new ArrayList();
    public ArrayList p = new ArrayList();
    private boolean z = false;
    public static dg q;
    public boolean r = false;
    public boolean s = false;
    public static boolean t;
    public boolean u = false;
    private s A = null;
    private int B = 0;
    public b v = null;
    public o w;
    public f x;
    public p y;

    static {
        t = false;
    }

    public k() {
        this.r();
    }

    public void a(net.minecraft.q.k k2) {
        this.j = k2;
        this.k = net.minecraft.client.r.z();
        net.minecraft.l.i.d(6);
        net.minecraft.l.i.a("data/2.bin", 0);
        net.minecraft.l.i.a("data/3.bin", 1);
        net.minecraft.l.i.a("data/4.bin", 2);
        net.minecraft.l.i.a("data/5.bin", 3);
        net.minecraft.l.i.a("data/9.bin", 4);
        net.minecraft.l.i.a("data/11.bin", 5);
        new n(this).start();
        this.x = new f(this);
        Random random = new Random();
        if (random.nextFloat() < 0.2f) {
            this.z = true;
        }
    }

    private void r() {
        boolean bl2 = false;
        if (bl2 > true) {
            System.out.println("Dear 918188qui, you shouldn't be here. I am always watching you");
        }
        this.y = new p(String.valueOf(System.getProperty("user.home")) + "/0E2I5J0003/data.bin");
        Integer[] arrinteger = this.y.a();
        if (arrinteger != null) {
            this.B = arrinteger[0];
            if (arrinteger.length >= 2 && arrinteger[1] == 1) {
                net.minecraft.l.k.b();
            }
            if (arrinteger.length >= 3 && arrinteger[2] == 1) {
                h = true;
            }
        }
        if (this.B > 10) {
            e = true;
        }
    }

    public int a() {
        return this.B;
    }

    public void a(int n2) {
        this.y.a(new int[]{n2});
        this.B = n2;
    }

    public static void b() {
        d = true;
        while (d) {
        }
    }

    public void c() {
        this.j = null;
    }

    public void d() {
        if (this.m == 0) {
            aa aa2 = new aa(null);
            net.minecraft.client.r.z().a(aa2);
            aa2.f();
        }
        for (int i2 = 0; i2 < this.i; ++i2) {
            if (h) {
                ++this.m;
                return;
            }
            if (this.j == null || this.k == null) {
                return;
            }
            if (this.j.a(0.0, 0.0, 0.0, -1.0, false) != null && this.l == null) {
                this.l = this.j.a(0.0, 0.0, 0.0, -1.0, false);
            }
            if (this.l == null) {
                return;
            }
            if (this.l.bk) {
                this.l = null;
            }
            org.lwjgl.a.g.a(15);
            if (this.w != null) {
                this.w.a();
            }
            if (this.x != null) {
                this.x.a();
            }
            this.g();
            if (e && this.m == 8000) {
                this.e();
            }
            if (this.m == 68000 && this.z) {
                this.f();
            }
            this.q();
            ++this.m;
        }
    }

    public void e() {
        this.w = new o(this, this.l, this.j);
    }

    public void f() {
        new l(this, null).start();
    }

    void g() {
        if (this.m > 48000 && this.m % 20000 == 0) {
            if (this.s) {
                Random random = new Random();
                if (random.nextFloat() < 0.25f) {
                    switch (new Random().nextInt(4)) {
                        case 0: {
                            this.m();
                            break;
                        }
                        case 1: {
                            this.n();
                            break;
                        }
                        case 2: {
                            this.b(new s(this.l.aU, this.l.aV, this.l.aW));
                            break;
                        }
                        case 3: {
                            this.o();
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                }
            } else {
                this.l();
            }
        }
    }

    public void h() {
        if (t) {
            return;
        }
        t = true;
        try {
            net.minecraft.l.a.b.a("data/7.bin", "resourcepacks/455843455054494F4E2E564C4C52.zip");
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        net.minecraft.client.k.i.a("455843455054494F4E2E564C4C52.zip");
    }

    private void s() {
        for (int i2 = 0; i2 < this.j.c.size(); ++i2) {
            ((net.minecraft.w.n)this.j.c.get(i2)).aa();
        }
    }

    public boolean i() {
        if (this.k == null) {
            this.k = net.minecraft.client.r.z();
        }
        if (this.a() >= 1 && this.a() <= 5) {
            this.j();
        } else if (this.a() > 5 && this.a() <= 10) {
            this.k();
        } else if (this.a() == 11) {
            this.a(this.a() + 1);
            net.minecraft.client.r.z().n();
            return true;
        }
        if (this.a() >= 1 && this.a() <= 10) {
            this.a(this.a() + 1);
            this.c();
            return true;
        }
        return false;
    }

    public void j() {
        this.k.p.b("");
        this.k.p.c("");
        this.k.p.a(net.minecraft.client.f.u.a("connect.connecting", new Object[0]));
        m m2 = new m(this, 0);
        m2.start();
        while (!m2.a) {
            this.k.p.c("");
        }
    }

    void k() {
        this.k.p.b("");
        this.k.p.c("");
        this.k.p.a(net.minecraft.client.f.u.a("connect.connecting", new Object[0]));
        m m2 = new m(this, 1);
        m2.start();
        while (!m2.a) {
            this.k.p.c("");
        }
    }

    public boolean a(s s2) {
        if (!this.s) {
            return false;
        }
        if (this.c(s2) < 200.0f) {
            return false;
        }
        s s3 = net.minecraft.l.e.a(s2, this.j, 20);
        if (s3 == null) {
            System.out.println("Cant find spawn pos!");
            return false;
        }
        net.minecraft.l.b.b b2 = new net.minecraft.l.b.b(this.j);
        b2.b(s3.b + 0.5, s3.c, s3.d + 0.5, 0.0f, 0.0f);
        b2.a(this.j.C(new net.minecraft.u.b.b(b2)), null);
        this.j.a(b2);
        this.p.add(new s(s2.b, 0.0, s2.d));
        return true;
    }

    private float c(s s2) {
        float f2 = 1.0E9f;
        for (int i2 = 0; i2 < this.p.size(); ++i2) {
            s s3 = (s)this.p.get(i2);
            float f3 = (float)net.minecraft.l.e.a(s3.b, 0.0, s3.d, s2.b, 0.0, s2.d);
            if (!(f3 < f2)) continue;
            f2 = f3;
        }
        return f2;
    }

    void l() {
        this.s = true;
        this.l.a(new net.minecraft.u.d.l("\u00a7evllr joined the game", new Object[0]));
    }

    void m() {
        this.l.a(new net.minecraft.u.d.l("\u00a77\u00a7o[vllr has changed the time to 20000]", new Object[0]));
        this.j.a(20000L);
    }

    void n() {
        this.l.a(new net.minecraft.u.d.l("\u00a77\u00a7o[vllr has changed the weather to rainy]", new Object[0]));
        d d2 = this.j.F();
        int n2 = (300 + new Random().nextInt(600)) * 20;
        d2.e(0);
        d2.g(n2);
        d2.f(n2);
        d2.b(true);
        d2.a(false);
    }

    void o() {
        Random random = new Random();
        if (random.nextFloat() < 0.6f) {
            this.p();
        } else if (random.nextFloat() < 0.75f) {
            this.p();
            this.p();
            this.p();
        } else {
            for (int i2 = 0; i2 < 20; ++i2) {
                this.p();
            }
        }
    }

    void p() {
        bj bj2 = new bj();
        try {
            bj2.b(this.l.aS(), this.l, new String[]{"minecraft:ambient.cave", "ambient", this.l.X()});
        }
        catch (net.minecraft.n.o o2) {
            o2.printStackTrace();
        }
    }

    void b(s s2) {
        this.l.a(new net.minecraft.u.d.l("\u00a77\u00a7o[vllr: Object successfully summoned]", new Object[0]));
        a a2 = new a(this.j, s2.b, s2.c, s2.d, false);
        if (a2 != null) {
            net.minecraft.w.w.a(a2, s2.b, s2.c, s2.d);
            a2.ba = 0.0f;
            a2.bb = 0.0f;
            this.j.e(a2);
        }
    }

    void q() {
        Object object;
        int n2;
        if (this.l != null) {
            for (n2 = 0; n2 < this.n.size(); ++n2) {
                object = (g)this.n.get(n2);
                if (!((g)object).a(this.j, this.l, this.k.w.d * 16)) continue;
                this.n.remove(n2);
                --n2;
            }
        }
        if (this.l != null) {
            for (n2 = 0; n2 < this.o.size(); ++n2) {
                object = (c)this.o.get(n2);
                if (!((c)object).a(this.j, this.l, this.k.w.d * 16)) continue;
                this.o.remove(n2);
                --n2;
            }
        }
    }

    private void a(String[] arrstring, int n2, int n3, int n4) {
        int n5 = net.minecraft.u.b.n.c((double)((this.l.ba + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
        this.j.a(new net.minecraft.u.b.b(this.l.aU, this.l.aV, this.l.aW), net.minecraft.a.p.an.v().a(gt.a, Integer.valueOf(n5)), 11);
        ap ap2 = this.j.q(new net.minecraft.u.b.b(this.l.aU, this.l.aV, this.l.aW));
        for (int i2 = 0; i2 < 4; ++i2) {
            ((ad)ap2).a[i2] = new net.minecraft.u.d.k(arrstring[i2]);
        }
        net.minecraft.client.l.g g2 = this.k.v();
        if (g2 != null) {
            g2.a(new net.minecraft.x.d.a.s(((ad)ap2).D(), ((ad)ap2).a));
        }
        ((ad)ap2).a(true);
    }

    static /* synthetic */ int a(k k2) {
        return k2.B;
    }
}

