/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.a.f;
import net.minecraft.client.c.e;
import net.minecraft.client.f.u;
import net.minecraft.client.g.ci;
import net.minecraft.client.k.a.j;
import net.minecraft.client.k.av;
import net.minecraft.client.r;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.c;
import net.minecraft.r.k;

abstract class i
extends av {
    protected int b;
    protected List w;
    protected Comparator x;
    protected int y;
    protected int z;
    final /* synthetic */ j A;

    protected i(j j2, r r2) {
        this.A = j2;
        super(r2, j2.p, j2.q, 32, j2.q - 64, 20);
        this.b = -1;
        this.y = -1;
        this.b(false);
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
    public int i() {
        return 375;
    }

    @Override
    protected int j() {
        return this.d / 2 + 140;
    }

    @Override
    protected void d() {
        this.A.m();
    }

    @Override
    protected void a(int n2, int n3, ci ci2) {
        if (!org.lwjgl.a.j.a(0)) {
            this.b = -1;
        }
        if (this.b == 0) {
            net.minecraft.client.k.a.j.a(this.A, n2 + 115 - 18, n3 + 1, 0, 0);
        } else {
            net.minecraft.client.k.a.j.a(this.A, n2 + 115 - 18, n3 + 1, 0, 18);
        }
        if (this.b == 1) {
            net.minecraft.client.k.a.j.a(this.A, n2 + 165 - 18, n3 + 1, 0, 0);
        } else {
            net.minecraft.client.k.a.j.a(this.A, n2 + 165 - 18, n3 + 1, 0, 18);
        }
        if (this.b == 2) {
            net.minecraft.client.k.a.j.a(this.A, n2 + 215 - 18, n3 + 1, 0, 0);
        } else {
            net.minecraft.client.k.a.j.a(this.A, n2 + 215 - 18, n3 + 1, 0, 18);
        }
        if (this.b == 3) {
            net.minecraft.client.k.a.j.a(this.A, n2 + 265 - 18, n3 + 1, 0, 0);
        } else {
            net.minecraft.client.k.a.j.a(this.A, n2 + 265 - 18, n3 + 1, 0, 18);
        }
        if (this.b == 4) {
            net.minecraft.client.k.a.j.a(this.A, n2 + 315 - 18, n3 + 1, 0, 0);
        } else {
            net.minecraft.client.k.a.j.a(this.A, n2 + 315 - 18, n3 + 1, 0, 18);
        }
        if (this.y != -1) {
            int n4 = 79;
            int n5 = 18;
            if (this.y == 1) {
                n4 = 129;
            } else if (this.y == 2) {
                n4 = 179;
            } else if (this.y == 3) {
                n4 = 229;
            } else if (this.y == 4) {
                n4 = 279;
            }
            if (this.z == 1) {
                n5 = 36;
            }
            net.minecraft.client.k.a.j.a(this.A, n2 + n4, n3 + 1, n5, 0);
        }
    }

    @Override
    protected void a(int n2, int n3) {
        this.b = -1;
        if (n2 >= 79 && n2 < 115) {
            this.b = 0;
        } else if (n2 >= 129 && n2 < 165) {
            this.b = 1;
        } else if (n2 >= 179 && n2 < 215) {
            this.b = 2;
        } else if (n2 >= 229 && n2 < 265) {
            this.b = 3;
        } else if (n2 >= 279 && n2 < 315) {
            this.b = 4;
        }
        if (this.b >= 0) {
            this.d(this.b);
            this.c.U().a(net.minecraft.client.c.e.a(net.minecraft.a.f.gE, 1.0f));
        }
    }

    @Override
    protected final int a() {
        return this.w.size();
    }

    protected final c c(int n2) {
        return (c)this.w.get(n2);
    }

    protected abstract String b(int var1);

    protected void a(k k2, int n2, int n3, boolean bl2) {
        if (k2 != null) {
            String string = k2.a(net.minecraft.client.k.a.j.a(this.A).a(k2));
            this.A.b(net.minecraft.client.k.a.j.b(this.A), string, n2 - net.minecraft.client.k.a.j.b(this.A).a(string), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            this.A.b(net.minecraft.client.k.a.j.b(this.A), "-", n2 - net.minecraft.client.k.a.j.b(this.A).a("-"), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        }
    }

    @Override
    protected void b(int n2, int n3) {
        if (n3 >= this.f && n3 <= this.g) {
            int n4 = this.c(n2, n3);
            int n5 = (this.d - this.i()) / 2;
            if (n4 >= 0) {
                if (n2 < n5 + 40 || n2 > n5 + 40 + 20) {
                    return;
                }
                c c2 = this.c(n4);
                this.a(c2, n2, n3);
            } else {
                String string;
                if (n2 >= n5 + 115 - 18 && n2 <= n5 + 115) {
                    string = this.b(0);
                } else if (n2 >= n5 + 165 - 18 && n2 <= n5 + 165) {
                    string = this.b(1);
                } else if (n2 >= n5 + 215 - 18 && n2 <= n5 + 215) {
                    string = this.b(2);
                } else if (n2 >= n5 + 265 - 18 && n2 <= n5 + 265) {
                    string = this.b(3);
                } else {
                    if (n2 < n5 + 315 - 18 || n2 > n5 + 315) {
                        return;
                    }
                    string = this.b(4);
                }
                string = net.minecraft.client.f.u.a(string, new Object[0]).trim();
                if (!string.isEmpty()) {
                    int n6 = n2 + 12;
                    int n7 = n3 - 12;
                    int n8 = net.minecraft.client.k.a.j.b(this.A).a(string);
                    net.minecraft.client.k.a.j.a(this.A, n6 - 3, n7 - 3, n6 + n8 + 3, n7 + 8 + 3, -1073741824, -1073741824);
                    net.minecraft.client.k.a.j.b(this.A).a(string, (float)n6, (float)n7, -1);
                }
            }
        }
    }

    protected void a(c c2, int n2, int n3) {
        cg cg2;
        cu cu2;
        String string;
        String string2;
        if (c2 != null && !(string2 = net.minecraft.client.f.u.a(String.valueOf(string = (cu2 = new cu(cg2 = c2.a())).k()) + ".name", new Object[0]).trim()).isEmpty()) {
            int n4 = n2 + 12;
            int n5 = n3 - 12;
            int n6 = net.minecraft.client.k.a.j.b(this.A).a(string2);
            net.minecraft.client.k.a.j.a(this.A, n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
            net.minecraft.client.k.a.j.b(this.A).a(string2, (float)n4, (float)n5, -1);
        }
    }

    protected void d(int n2) {
        if (n2 != this.y) {
            this.y = n2;
            this.z = -1;
        } else if (this.z == -1) {
            this.z = 1;
        } else {
            this.y = -1;
            this.z = 0;
        }
        Collections.sort(this.w, this.x);
    }
}

