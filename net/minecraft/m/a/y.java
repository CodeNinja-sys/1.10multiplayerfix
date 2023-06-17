/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import com.a.a.d.ov;
import java.util.ArrayList;
import net.minecraft.a.w;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cu;
import net.minecraft.m.m;
import net.minecraft.q.k;

public class y
implements u {
    private cu a;

    @Override
    public boolean a(af af2, k k2) {
        Object object;
        this.a = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            object = af2.a(i2);
            if (object == null) continue;
            if (((cu)object).a() == w.J) {
                ++n3;
                continue;
            }
            if (((cu)object).a() == w.cm) {
                ++n5;
                continue;
            }
            if (((cu)object).a() == w.bd) {
                ++n4;
                continue;
            }
            if (((cu)object).a() == w.aR) {
                ++n2;
                continue;
            }
            if (((cu)object).a() == w.ba) {
                ++n6;
                continue;
            }
            if (((cu)object).a() == w.k) {
                ++n6;
                continue;
            }
            if (((cu)object).a() == w.bV) {
                ++n7;
                continue;
            }
            if (((cu)object).a() == w.I) {
                ++n7;
                continue;
            }
            if (((cu)object).a() == w.bE) {
                ++n7;
                continue;
            }
            if (((cu)object).a() != w.ch) {
                return false;
            }
            ++n7;
        }
        n6 = n6 + n4 + n7;
        if (n3 <= 3 && n2 <= 1) {
            if (n3 >= 1 && n2 == 1 && n6 == 0) {
                this.a = new cu(w.cl, 3);
                if (n5 > 0) {
                    e e2 = new e();
                    object = new e();
                    q q2 = new q();
                    for (int i3 = 0; i3 < af2.e(); ++i3) {
                        cu cu2 = af2.a(i3);
                        if (cu2 == null || cu2.a() != w.cm || !cu2.n() || !cu2.o().b("Explosion", 10)) continue;
                        q2.a(cu2.o().o("Explosion"));
                    }
                    ((e)object).a("Explosions", q2);
                    ((e)object).a("Flight", (byte)n3);
                    e2.a("Fireworks", (a)object);
                    this.a.d(e2);
                }
                return true;
            }
            if (n3 == 1 && n2 == 0 && n5 == 0 && n4 > 0 && n7 <= 1) {
                this.a = new cu(w.cm);
                e e3 = new e();
                object = new e();
                int n8 = 0;
                ArrayList arrayList = ov.a();
                for (int i4 = 0; i4 < af2.e(); ++i4) {
                    cu cu3 = af2.a(i4);
                    if (cu3 == null) continue;
                    if (cu3.a() == w.bd) {
                        arrayList.add(m.a[cu3.h() & 0xF]);
                        continue;
                    }
                    if (cu3.a() == w.ba) {
                        ((e)object).a("Flicker", true);
                        continue;
                    }
                    if (cu3.a() == w.k) {
                        ((e)object).a("Trail", true);
                        continue;
                    }
                    if (cu3.a() == w.bV) {
                        n8 = 1;
                        continue;
                    }
                    if (cu3.a() == w.I) {
                        n8 = 4;
                        continue;
                    }
                    if (cu3.a() == w.bE) {
                        n8 = 2;
                        continue;
                    }
                    if (cu3.a() != w.ch) continue;
                    n8 = 3;
                }
                int[] arrn = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrn.length; ++i5) {
                    arrn[i5] = (Integer)arrayList.get(i5);
                }
                ((e)object).a("Colors", arrn);
                ((e)object).a("Type", (byte)n8);
                e3.a("Explosion", (a)object);
                this.a.d(e3);
                return true;
            }
            if (n3 == 0 && n2 == 0 && n5 == 1 && n4 > 0 && n4 == n6) {
                ArrayList arrayList = ov.a();
                for (int i6 = 0; i6 < af2.e(); ++i6) {
                    cu cu4 = af2.a(i6);
                    if (cu4 == null) continue;
                    if (cu4.a() == w.bd) {
                        arrayList.add(m.a[cu4.h() & 0xF]);
                        continue;
                    }
                    if (cu4.a() != w.cm) continue;
                    this.a = cu4.j();
                    this.a.b = 1;
                }
                int[] arrn = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrn.length; ++i7) {
                    arrn[i7] = (Integer)arrayList.get(i7);
                }
                if (this.a != null && this.a.n()) {
                    e e4 = this.a.o().o("Explosion");
                    if (e4 == null) {
                        return false;
                    }
                    e4.a("FadeColors", arrn);
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public cu a(af af2) {
        return this.a.j();
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public cu b() {
        return this.a;
    }

    @Override
    public cu[] b(af af2) {
        cu[] arrcu = new cu[af2.e()];
        for (int i2 = 0; i2 < arrcu.length; ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null || !cu2.a().q()) continue;
            arrcu[i2] = new cu(cu2.a().p());
        }
        return arrcu;
    }
}

