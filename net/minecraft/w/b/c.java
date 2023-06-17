/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.w;
import net.minecraft.h.e;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.b.n;
import net.minecraft.w.b.u;
import net.minecraft.w.f.ae;
import net.minecraft.w.h.ak;

public class c
extends u {
    private int e;
    private final ak f;

    public c(ak ak2) {
        super(ak2, ak.class, 3.0f, 0.02f);
        this.f = ak2;
    }

    @Override
    public void b() {
        super.b();
        this.e = this.f.z() && this.b instanceof ak && ((ak)this.b).E() ? 10 : 0;
    }

    @Override
    public void d() {
        super.d();
        if (this.e > 0) {
            --this.e;
            if (this.e == 0) {
                e e2 = this.f.w();
                for (int i2 = 0; i2 < e2.e(); ++i2) {
                    cu cu2 = e2.a(i2);
                    cu cu3 = null;
                    if (cu2 != null) {
                        int n2;
                        cg cg2 = cu2.a();
                        if ((cg2 == w.R || cg2 == w.cc || cg2 == w.cb || cg2 == w.cV) && cu2.b > 3) {
                            n2 = cu2.b / 2;
                            cu2.b -= n2;
                            cu3 = new cu(cg2, n2, cu2.h());
                        } else if (cg2 == w.Q && cu2.b > 5) {
                            n2 = cu2.b / 2 / 3 * 3;
                            int n3 = n2 / 3;
                            cu2.b -= n2;
                            cu3 = new cu(w.R, n3, 0);
                        }
                        if (cu2.b <= 0) {
                            e2.a(i2, null);
                        }
                    }
                    if (cu3 == null) continue;
                    double d2 = this.f.aV - (double)0.3f + (double)this.f.ce_();
                    ae ae2 = new ae(this.f.aQ, this.f.aU, d2, this.f.aW, cu3);
                    float f2 = 0.3f;
                    float f3 = this.f.am;
                    float f4 = this.f.bb;
                    ae2.aX = -n.a(f3 * ((float)Math.PI / 180)) * n.b(f4 * ((float)Math.PI / 180)) * 0.3f;
                    ae2.aZ = n.b(f3 * ((float)Math.PI / 180)) * n.b(f4 * ((float)Math.PI / 180)) * 0.3f;
                    ae2.aY = -n.a(f4 * ((float)Math.PI / 180)) * 0.3f + 0.1f;
                    ae2.l();
                    this.f.aQ.a(ae2);
                    break;
                }
            }
        }
    }
}

