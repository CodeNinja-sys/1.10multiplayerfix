/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public abstract class ro
implements ye {
    private static final bpx c = new bpx("textures/gui/resource_packs.png");
    private static final cbg d = new du("resourcePack.incompatible", new Object[0]);
    private static final cbg e = new du("resourcePack.incompatible.old", new Object[0]);
    private static final cbg f = new du("resourcePack.incompatible.new", new Object[0]);
    protected final bxy a;
    protected final axb b;

    public ro(axb axb2) {
        this.b = axb2;
        this.a = bxy.B();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        int n9;
        int n10 = this.a();
        if (n10 != 2) {
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            alo.a(n3 - 1, n4 - 1, n3 + n5 - 9, n4 + n6 + 1, -8978432);
        }
        this.d();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        alo.a(n3, n4, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        String string = this.c();
        String string2 = this.b();
        if (this.e() && (this.a.u.A || bl2)) {
            this.a.P().a(c);
            alo.a(n3, n4, n3 + 32, n4 + 32, -1601138544);
            cja.c(1.0f, 1.0f, 1.0f, 1.0f);
            n9 = n7 - n3;
            int n11 = n8 - n4;
            if (n10 < 2) {
                string = d.j();
                string2 = e.j();
            } else if (n10 > 2) {
                string = d.j();
                string2 = f.j();
            }
            if (this.f()) {
                if (n9 < 32) {
                    alo.a(n3, n4, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    alo.a(n3, n4, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            } else {
                if (this.g()) {
                    if (n9 < 16) {
                        alo.a(n3, n4, 32.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        alo.a(n3, n4, 32.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.h()) {
                    if (n9 < 32 && n9 > 16 && n11 < 16) {
                        alo.a(n3, n4, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        alo.a(n3, n4, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.i()) {
                    if (n9 < 32 && n9 > 16 && n11 > 16) {
                        alo.a(n3, n4, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        alo.a(n3, n4, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
            }
        }
        if ((n9 = this.a.k.a(string)) > 157) {
            string = this.a.k.a(string, 157 - this.a.k.a("...")) + "...";
        }
        this.a.k.a(string, (float)(n3 + 32 + 2), (float)(n4 + 1), 0xFFFFFF);
        List list = this.a.k.c(string2, 157);
        for (int i2 = 0; i2 < 2 && i2 < list.size(); ++i2) {
            this.a.k.a((String)list.get(i2), (float)(n3 + 32 + 2), (float)(n4 + 12 + 10 * i2), 0x808080);
        }
    }

    protected abstract int a();

    protected abstract String b();

    protected abstract String c();

    protected abstract void d();

    protected boolean e() {
        return true;
    }

    protected boolean f() {
        return !this.b.a(this);
    }

    protected boolean g() {
        return this.b.a(this);
    }

    protected boolean h() {
        List list = this.b.b(this);
        int n2 = list.indexOf(this);
        return n2 > 0 && ((ro)list.get(n2 - 1)).e();
    }

    protected boolean i() {
        List list = this.b.b(this);
        int n2 = list.indexOf(this);
        return n2 >= 0 && n2 < list.size() - 1 && ((ro)list.get(n2 + 1)).e();
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.e() && n6 <= 32) {
            if (this.f()) {
                this.b.h();
                int n8 = ((ro)this.b.g().get(0)).j() ? 1 : 0;
                int n9 = this.a();
                if (n9 == 2) {
                    this.b.b(this).remove(this);
                    this.b.g().add(n8, this);
                } else {
                    String string = bf.a("resourcePack.incompatible.confirm.title", new Object[0]);
                    String string2 = bf.a("resourcePack.incompatible.confirm." + (n9 > 2 ? "new" : "old"), new Object[0]);
                    this.a.a(new ayi(new ahs(this, n8), string, string2, 0));
                }
                return true;
            }
            if (n6 < 16 && this.g()) {
                this.b.b(this).remove(this);
                this.b.f().add(0, this);
                this.b.h();
                return true;
            }
            if (n6 > 16 && n7 < 16 && this.h()) {
                List list = this.b.b(this);
                int n10 = list.indexOf(this);
                list.remove(this);
                list.add(n10 - 1, this);
                this.b.h();
                return true;
            }
            if (n6 > 16 && n7 > 16 && this.i()) {
                List list = this.b.b(this);
                int n11 = list.indexOf(this);
                list.remove(this);
                list.add(n11 + 1, this);
                this.b.h();
                return true;
            }
        }
        return false;
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public boolean j() {
        return false;
    }
}

