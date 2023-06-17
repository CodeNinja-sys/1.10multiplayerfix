/*
 * Decompiled with CFR 0.150.
 */
public class avq
implements tb {
    private final fc a;
    private final bhl[] b = new bhl[3];
    private final bdl c;
    private jc d;
    private int e;

    public avq(bdl bdl2, fc fc2) {
        this.c = bdl2;
        this.a = fc2;
    }

    @Override
    public int aI_() {
        return this.b.length;
    }

    @Override
    public bhl a(int n2) {
        return this.b[n2];
    }

    @Override
    public bhl a(int n2, int n3) {
        if (n2 == 2 && this.b[n2] != null) {
            return cjk.a(this.b, n2, this.b[n2].b);
        }
        bhl bhl2 = cjk.a(this.b, n2, n3);
        if (bhl2 != null && this.e(n2)) {
            this.h();
        }
        return bhl2;
    }

    private boolean e(int n2) {
        return n2 == 0 || n2 == 1;
    }

    @Override
    public bhl b(int n2) {
        return cjk.a(this.b, n2);
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.b[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
        if (this.e(n2)) {
            this.h();
        }
    }

    @Override
    public String i_() {
        return "mob.villager";
    }

    @Override
    public boolean j_() {
        return false;
    }

    @Override
    public cbg v() {
        if (this.j_()) {
            return new aym(this.i_());
        }
        return new du(this.i_(), new Object[0]);
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(bdl bdl2) {
        return this.a.b() == bdl2;
    }

    @Override
    public void b(bdl bdl2) {
    }

    @Override
    public void c(bdl bdl2) {
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    @Override
    public void c_() {
        this.h();
    }

    public void h() {
        this.d = null;
        bhl bhl2 = this.b[0];
        bhl bhl3 = this.b[1];
        if (bhl2 == null) {
            bhl2 = bhl3;
            bhl3 = null;
        }
        if (bhl2 == null) {
            this.a(2, null);
        } else {
            beo beo2 = this.a.b(this.c);
            if (beo2 != null) {
                jc jc2 = beo2.a(bhl2, bhl3, this.e);
                if (jc2 != null && !jc2.h()) {
                    this.d = jc2;
                    this.a(2, jc2.d().j());
                } else if (bhl3 != null) {
                    jc2 = beo2.a(bhl3, bhl2, this.e);
                    if (jc2 != null && !jc2.h()) {
                        this.d = jc2;
                        this.a(2, jc2.d().j());
                    } else {
                        this.a(2, null);
                    }
                } else {
                    this.a(2, null);
                }
            }
        }
        this.a.a(this.a(2));
    }

    public jc i() {
        return this.d;
    }

    public void d(int n2) {
        this.e = n2;
        this.h();
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void g() {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = null;
        }
    }
}

