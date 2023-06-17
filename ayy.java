/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.a.j;

abstract class ayy
extends st {
    protected int a;
    protected List b;
    protected Comparator w;
    protected int x;
    protected int y;
    final /* synthetic */ bjs z;

    protected ayy(bjs bjs2, bxy bxy2) {
        this.z = bjs2;
        super(bxy2, bjs2.w, bjs2.x, 32, bjs2.x - 64, 20);
        this.a = -1;
        this.x = -1;
        this.a(false);
        this.a(true, 20);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    public int d() {
        return 375;
    }

    @Override
    protected int c() {
        return this.d / 2 + 140;
    }

    @Override
    protected void b() {
        this.z.aH_();
    }

    @Override
    protected void a(int n2, int n3, bha bha2) {
        if (!org.lwjgl.a.j.a(0)) {
            this.a = -1;
        }
        if (this.a == 0) {
            bjs.a(this.z, n2 + 115 - 18, n3 + 1, 0, 0);
        } else {
            bjs.a(this.z, n2 + 115 - 18, n3 + 1, 0, 18);
        }
        if (this.a == 1) {
            bjs.a(this.z, n2 + 165 - 18, n3 + 1, 0, 0);
        } else {
            bjs.a(this.z, n2 + 165 - 18, n3 + 1, 0, 18);
        }
        if (this.a == 2) {
            bjs.a(this.z, n2 + 215 - 18, n3 + 1, 0, 0);
        } else {
            bjs.a(this.z, n2 + 215 - 18, n3 + 1, 0, 18);
        }
        if (this.a == 3) {
            bjs.a(this.z, n2 + 265 - 18, n3 + 1, 0, 0);
        } else {
            bjs.a(this.z, n2 + 265 - 18, n3 + 1, 0, 18);
        }
        if (this.a == 4) {
            bjs.a(this.z, n2 + 315 - 18, n3 + 1, 0, 0);
        } else {
            bjs.a(this.z, n2 + 315 - 18, n3 + 1, 0, 18);
        }
        if (this.x != -1) {
            int n4 = 79;
            int n5 = 18;
            if (this.x == 1) {
                n4 = 129;
            } else if (this.x == 2) {
                n4 = 179;
            } else if (this.x == 3) {
                n4 = 229;
            } else if (this.x == 4) {
                n4 = 279;
            }
            if (this.y == 1) {
                n5 = 36;
            }
            bjs.a(this.z, n2 + n4, n3 + 1, n5, 0);
        }
    }

    @Override
    protected void a(int n2, int n3) {
        this.a = -1;
        if (n2 >= 79 && n2 < 115) {
            this.a = 0;
        } else if (n2 >= 129 && n2 < 165) {
            this.a = 1;
        } else if (n2 >= 179 && n2 < 215) {
            this.a = 2;
        } else if (n2 >= 229 && n2 < 265) {
            this.a = 3;
        } else if (n2 >= 279 && n2 < 315) {
            this.a = 4;
        }
        if (this.a >= 0) {
            this.g(this.a);
            this.c.W().a(ol.a(dah.gE, 1.0f));
        }
    }

    @Override
    protected final int a() {
        return this.b.size();
    }

    protected final va b(int n2) {
        return (va)this.b.get(n2);
    }

    protected abstract String c(int var1);

    protected void a(cyd cyd2, int n2, int n3, boolean bl2) {
        if (cyd2 != null) {
            String string = cyd2.a(bjs.b(this.z).a(cyd2));
            this.z.b(bjs.e(this.z), string, n2 - bjs.f(this.z).a(string), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            this.z.b(bjs.g(this.z), "-", n2 - bjs.h(this.z).a("-"), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        }
    }

    @Override
    protected void b(int n2, int n3) {
        if (n3 < this.f || n3 > this.g) {
            return;
        }
        int n4 = this.c(n2, n3);
        int n5 = (this.d - this.d()) / 2;
        if (n4 >= 0) {
            if (n2 < n5 + 40 || n2 > n5 + 40 + 20) {
                return;
            }
            va va2 = this.b(n4);
            this.a(va2, n2, n3);
        } else {
            String string;
            if (n2 >= n5 + 115 - 18 && n2 <= n5 + 115) {
                string = this.c(0);
            } else if (n2 >= n5 + 165 - 18 && n2 <= n5 + 165) {
                string = this.c(1);
            } else if (n2 >= n5 + 215 - 18 && n2 <= n5 + 215) {
                string = this.c(2);
            } else if (n2 >= n5 + 265 - 18 && n2 <= n5 + 265) {
                string = this.c(3);
            } else if (n2 >= n5 + 315 - 18 && n2 <= n5 + 315) {
                string = this.c(4);
            } else {
                return;
            }
            string = ("" + bf.a(string, new Object[0])).trim();
            if (!string.isEmpty()) {
                int n6 = n2 + 12;
                int n7 = n3 - 12;
                int n8 = bjs.i(this.z).a(string);
                bjs.a(this.z, n6 - 3, n7 - 3, n6 + n8 + 3, n7 + 8 + 3, -1073741824, -1073741824);
                bjs.j(this.z).a(string, (float)n6, (float)n7, -1);
            }
        }
    }

    protected void a(va va2, int n2, int n3) {
        if (va2 == null) {
            return;
        }
        azg azg2 = va2.a();
        bhl bhl2 = new bhl(azg2);
        String string = bhl2.k();
        String string2 = ("" + bf.a(string + ".name", new Object[0])).trim();
        if (!string2.isEmpty()) {
            int n4 = n2 + 12;
            int n5 = n3 - 12;
            int n6 = bjs.k(this.z).a(string2);
            bjs.b(this.z, n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
            bjs.l(this.z).a(string2, (float)n4, (float)n5, -1);
        }
    }

    protected void g(int n2) {
        if (n2 != this.x) {
            this.x = n2;
            this.y = -1;
        } else if (this.y == -1) {
            this.y = 1;
        } else {
            this.x = -1;
            this.y = 0;
        }
        Collections.sort(this.b, this.w);
    }
}

