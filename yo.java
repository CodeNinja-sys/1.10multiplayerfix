/*
 * Decompiled with CFR 0.150.
 */
public class yo
implements tb {
    private final bhl[] a;
    private final int b;
    private final int c;
    private final apq d;

    public yo(apq apq2, int n2, int n3) {
        int n4 = n2 * n3;
        this.a = new bhl[n4];
        this.d = apq2;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public int aI_() {
        return this.a.length;
    }

    @Override
    public bhl a(int n2) {
        if (n2 >= this.aI_()) {
            return null;
        }
        return this.a[n2];
    }

    public bhl c(int n2, int n3) {
        if (n2 < 0 || n2 >= this.b || n3 < 0 || n3 > this.c) {
            return null;
        }
        return this.a(n2 + n3 * this.b);
    }

    @Override
    public String i_() {
        return "container.crafting";
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
    public bhl b(int n2) {
        return cjk.a(this.a, n2);
    }

    @Override
    public bhl a(int n2, int n3) {
        bhl bhl2 = cjk.a(this.a, n2, n3);
        if (bhl2 != null) {
            this.d.a(this);
        }
        return bhl2;
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.a[n2] = bhl2;
        this.d.a(this);
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public void c_() {
    }

    @Override
    public boolean a(bdl bdl2) {
        return true;
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
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = null;
        }
    }

    public int h() {
        return this.c;
    }

    public int i() {
        return this.b;
    }
}

