/*
 * Decompiled with CFR 0.150.
 */
public class cad
implements tb {
    private final bhl[] a = new bhl[1];

    @Override
    public int aI_() {
        return 1;
    }

    @Override
    public bhl a(int n2) {
        return this.a[0];
    }

    @Override
    public String i_() {
        return "Result";
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
    public bhl a(int n2, int n3) {
        return cjk.a(this.a, 0);
    }

    @Override
    public bhl b(int n2) {
        return cjk.a(this.a, 0);
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.a[0] = bhl2;
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
}

