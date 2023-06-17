/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.f.ap;
import net.minecraft.h.ae;
import net.minecraft.h.i;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.b.n;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public abstract class aq {
    public List d = ov.a();
    public List e = ov.a();
    public int f;
    private short a;
    private int b = -1;
    private int c;
    private final Set h = aad.a();
    protected List g = ov.a();
    private final Set i = aad.a();

    protected r a(r r2) {
        r2.c = this.e.size();
        this.e.add(r2);
        this.d.add(null);
        return r2;
    }

    public void a(i i2) {
        if (this.g.contains(i2)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.g.add(i2);
        i2.a(this, this.c());
        this.a();
    }

    public void b(i i2) {
        this.g.remove(i2);
    }

    public List c() {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            arrayList.add(((r)this.e.get(i2)).b());
        }
        return arrayList;
    }

    public void a() {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            cu cu2 = ((r)this.e.get(i2)).b();
            cu cu3 = (cu)this.d.get(i2);
            if (cu.b(cu3, cu2)) continue;
            cu3 = cu2 == null ? null : cu2.j();
            this.d.set(i2, cu3);
            for (int i3 = 0; i3 < this.g.size(); ++i3) {
                ((i)this.g.get(i3)).a(this, i2, cu3);
            }
        }
    }

    public boolean b(b b2, int n2) {
        return false;
    }

    public r a(y y2, int n2) {
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            r r2 = (r)this.e.get(i2);
            if (!r2.a(y2, n2)) continue;
            return r2;
        }
        return null;
    }

    public r b(int n2) {
        return (r)this.e.get(n2);
    }

    public cu a(b b2, int n2) {
        r r2 = (r)this.e.get(n2);
        return r2 != null ? r2.b() : null;
    }

    public cu a(int n2, int n3, ae ae2, b b2) {
        cu cu2 = null;
        a a2 = b2.q;
        if (ae2 == ae.f) {
            int n4 = this.c;
            this.c = aq.d(n3);
            if ((n4 != 1 || this.c != 2) && n4 != this.c) {
                this.d();
            } else if (a2.l() == null) {
                this.d();
            } else if (this.c == 0) {
                this.b = aq.c(n3);
                if (aq.a(this.b, b2)) {
                    this.c = 1;
                    this.h.clear();
                } else {
                    this.d();
                }
            } else if (this.c == 1) {
                r r2 = (r)this.e.get(n2);
                if (r2 != null && aq.a(r2, a2.l(), true) && r2.a(a2.l()) && a2.l().b > this.h.size() && this.b(r2)) {
                    this.h.add(r2);
                }
            } else if (this.c == 2) {
                if (!this.h.isEmpty()) {
                    cu cu3 = a2.l().j();
                    int n5 = a2.l().b;
                    for (r r3 : this.h) {
                        if (r3 == null || !aq.a(r3, a2.l(), true) || !r3.a(a2.l()) || a2.l().b < this.h.size() || !this.b(r3)) continue;
                        cu cu4 = cu3.j();
                        int n6 = r3.c() ? r3.b().b : 0;
                        aq.a(this.h, this.b, cu4, n6);
                        if (cu4.b > cu4.b()) {
                            cu4.b = cu4.b();
                        }
                        if (cu4.b > r3.e(cu4)) {
                            cu4.b = r3.e(cu4);
                        }
                        n5 -= cu4.b - n6;
                        r3.d(cu4);
                    }
                    cu3.b = n5;
                    if (cu3.b <= 0) {
                        cu3 = null;
                    }
                    a2.e(cu3);
                }
                this.d();
            } else {
                this.d();
            }
        } else if (this.c != 0) {
            this.d();
        } else if (!(ae2 != ae.a && ae2 != ae.b || n3 != 0 && n3 != 1)) {
            if (n2 == -999) {
                if (a2.l() != null) {
                    if (n3 == 0) {
                        b2.a(a2.l(), true);
                        a2.e(null);
                    }
                    if (n3 == 1) {
                        b2.a(a2.l().a(1), true);
                        if (a2.l().b == 0) {
                            a2.e(null);
                        }
                    }
                }
            } else if (ae2 == ae.b) {
                if (n2 < 0) {
                    return null;
                }
                r r4 = (r)this.e.get(n2);
                if (r4 != null && r4.a(b2)) {
                    cu cu5;
                    cu cu6 = r4.b();
                    if (cu6 != null && cu6.b <= 0) {
                        cu2 = cu6.j();
                        r4.d(null);
                    }
                    if ((cu5 = this.a(b2, n2)) != null) {
                        cg cg2 = cu5.a();
                        cu2 = cu5.j();
                        if (r4.b() != null && r4.b().a() == cg2) {
                            this.a(n2, n3, true, b2);
                        }
                    }
                }
            } else {
                if (n2 < 0) {
                    return null;
                }
                r r5 = (r)this.e.get(n2);
                if (r5 != null) {
                    cu cu7 = r5.b();
                    cu cu8 = a2.l();
                    if (cu7 != null) {
                        cu2 = cu7.j();
                    }
                    if (cu7 == null) {
                        if (cu8 != null && r5.a(cu8)) {
                            int n7;
                            int n8 = n7 = n3 == 0 ? cu8.b : 1;
                            if (n7 > r5.e(cu8)) {
                                n7 = r5.e(cu8);
                            }
                            r5.d(cu8.a(n7));
                            if (cu8.b == 0) {
                                a2.e(null);
                            }
                        }
                    } else if (r5.a(b2)) {
                        int n9;
                        if (cu8 == null) {
                            if (cu7.b > 0) {
                                int n10 = n3 == 0 ? cu7.b : (cu7.b + 1) / 2;
                                a2.e(r5.a(n10));
                                if (cu7.b <= 0) {
                                    r5.d(null);
                                }
                                r5.a(b2, a2.l());
                            } else {
                                r5.d(null);
                                a2.e(null);
                            }
                        } else if (r5.a(cu8)) {
                            if (cu7.a() == cu8.a() && cu7.h() == cu8.h() && cu.a(cu7, cu8)) {
                                int n11;
                                int n12 = n11 = n3 == 0 ? cu8.b : 1;
                                if (n11 > r5.e(cu8) - cu7.b) {
                                    n11 = r5.e(cu8) - cu7.b;
                                }
                                if (n11 > cu8.b() - cu7.b) {
                                    n11 = cu8.b() - cu7.b;
                                }
                                cu8.a(n11);
                                if (cu8.b == 0) {
                                    a2.e(null);
                                }
                                cu7.b += n11;
                            } else if (cu8.b <= r5.e(cu8)) {
                                r5.d(cu8);
                                a2.e(cu7);
                            }
                        } else if (cu7.a() == cu8.a() && cu8.b() > 1 && (!cu7.e() || cu7.h() == cu8.h()) && cu.a(cu7, cu8) && (n9 = cu7.b) > 0 && n9 + cu8.b <= cu8.b()) {
                            cu8.b += n9;
                            cu7 = r5.a(n9);
                            if (cu7.b == 0) {
                                r5.d(null);
                            }
                            r5.a(b2, a2.l());
                        }
                    }
                    r5.d();
                }
            }
        } else if (ae2 == ae.c && n3 >= 0 && n3 < 9) {
            r r6 = (r)this.e.get(n2);
            cu cu9 = a2.a(n3);
            if (cu9 != null && cu9.b <= 0) {
                cu9 = null;
                a2.a(n3, null);
            }
            cu cu10 = r6.b();
            if (cu9 != null || cu10 != null) {
                if (cu9 == null) {
                    if (r6.a(b2)) {
                        a2.a(n3, cu10);
                        r6.d(null);
                        r6.a(b2, cu10);
                    }
                } else if (cu10 == null) {
                    if (r6.a(cu9)) {
                        int n13 = r6.e(cu9);
                        if (cu9.b > n13) {
                            r6.d(cu9.a(n13));
                        } else {
                            r6.d(cu9);
                            a2.a(n3, null);
                        }
                    }
                } else if (r6.a(b2) && r6.a(cu9)) {
                    int n14 = r6.e(cu9);
                    if (cu9.b > n14) {
                        r6.d(cu9.a(n14));
                        r6.a(b2, cu10);
                        if (!a2.c(cu10)) {
                            b2.a(cu10, true);
                        }
                    } else {
                        r6.d(cu9);
                        a2.a(n3, cu10);
                        r6.a(b2, cu10);
                    }
                }
            }
        } else if (ae2 == ae.d && b2.J.d && a2.l() == null && n2 >= 0) {
            r r7 = (r)this.e.get(n2);
            if (r7 != null && r7.c()) {
                if (r7.b().b > 0) {
                    cu cu11 = r7.b().j();
                    cu11.b = cu11.b();
                    a2.e(cu11);
                } else {
                    r7.d(null);
                }
            }
        } else if (ae2 == ae.e && a2.l() == null && n2 >= 0) {
            r r8 = (r)this.e.get(n2);
            if (r8 != null && r8.c() && r8.a(b2)) {
                cu cu12 = r8.a(n3 == 0 ? 1 : r8.b().b);
                r8.a(b2, cu12);
                b2.a(cu12, true);
            }
        } else if (ae2 == ae.g && n2 >= 0) {
            r r9 = (r)this.e.get(n2);
            cu cu13 = a2.l();
            if (!(cu13 == null || r9 != null && r9.c() && r9.a(b2))) {
                int n15 = n3 == 0 ? 0 : this.e.size() - 1;
                int n16 = n3 == 0 ? 1 : -1;
                for (int i2 = 0; i2 < 2; ++i2) {
                    for (int i3 = n15; i3 >= 0 && i3 < this.e.size() && cu13.b < cu13.b(); i3 += n16) {
                        r r10 = (r)this.e.get(i3);
                        if (!r10.c() || !aq.a(r10, cu13, true) || !r10.a(b2) || !this.a(cu13, r10) || i2 == 0 && r10.b().b == r10.b().b()) continue;
                        int n17 = Math.min(cu13.b() - cu13.b, r10.b().b);
                        cu cu14 = r10.a(n17);
                        cu13.b += n17;
                        if (cu14.b <= 0) {
                            r10.d(null);
                        }
                        r10.a(b2, cu14);
                    }
                }
            }
            this.a();
        }
        return cu2;
    }

    public boolean a(cu cu2, r r2) {
        return true;
    }

    protected void a(int n2, int n3, boolean bl2, b b2) {
        this.a(n2, n3, ae.b, b2);
    }

    public void b(b b2) {
        a a2 = b2.q;
        if (a2.l() != null) {
            b2.a(a2.l(), false);
            a2.e(null);
        }
    }

    public void a(y y2) {
        this.a();
    }

    public void a(int n2, cu cu2) {
        this.b(n2).d(cu2);
    }

    public void a(cu[] arrcu) {
        for (int i2 = 0; i2 < arrcu.length; ++i2) {
            this.b(i2).d(arrcu[i2]);
        }
    }

    public void a(int n2, int n3) {
    }

    public short a(a a2) {
        this.a = (short)(this.a + 1);
        return this.a;
    }

    public boolean c(b b2) {
        return !this.i.contains(b2);
    }

    public void a(b b2, boolean bl2) {
        if (bl2) {
            this.i.remove(b2);
        } else {
            this.i.add(b2);
        }
    }

    public abstract boolean a(b var1);

    protected boolean a(cu cu2, int n2, int n3, boolean bl2) {
        cu cu3;
        r r2;
        boolean bl3 = false;
        int n4 = n2;
        if (bl2) {
            n4 = n3 - 1;
        }
        if (cu2.c()) {
            while (cu2.b > 0 && (!bl2 && n4 < n3 || bl2 && n4 >= n2)) {
                r2 = (r)this.e.get(n4);
                cu3 = r2.b();
                if (cu3 != null && aq.a(cu2, cu3)) {
                    int n5 = cu3.b + cu2.b;
                    if (n5 <= cu2.b()) {
                        cu2.b = 0;
                        cu3.b = n5;
                        r2.d();
                        bl3 = true;
                    } else if (cu3.b < cu2.b()) {
                        cu2.b -= cu2.b() - cu3.b;
                        cu3.b = cu2.b();
                        r2.d();
                        bl3 = true;
                    }
                }
                if (bl2) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        if (cu2.b > 0) {
            n4 = bl2 ? n3 - 1 : n2;
            while (!bl2 && n4 < n3 || bl2 && n4 >= n2) {
                r2 = (r)this.e.get(n4);
                cu3 = r2.b();
                if (cu3 == null) {
                    r2.d(cu2.j());
                    r2.d();
                    cu2.b = 0;
                    bl3 = true;
                    break;
                }
                if (bl2) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        return bl3;
    }

    private static boolean a(cu cu2, cu cu3) {
        return cu3.a() == cu2.a() && (!cu2.e() || cu2.h() == cu3.h()) && cu.a(cu2, cu3);
    }

    public static int c(int n2) {
        return n2 >> 2 & 3;
    }

    public static int d(int n2) {
        return n2 & 3;
    }

    public static int b(int n2, int n3) {
        return n2 & 3 | (n3 & 3) << 2;
    }

    public static boolean a(int n2, b b2) {
        return n2 == 0 ? true : (n2 == 1 ? true : n2 == 2 && b2.J.d);
    }

    protected void d() {
        this.c = 0;
        this.h.clear();
    }

    public static boolean a(r r2, cu cu2, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = r2 == null || !r2.c();
        if (r2 != null && r2.c() && cu2 != null && cu2.a(r2.b()) && cu.a(r2.b(), cu2)) {
            bl3 |= r2.b().b + (bl2 ? 0 : cu2.b) <= cu2.b();
        }
        return bl3;
    }

    public static void a(Set set, int n2, cu cu2, int n3) {
        switch (n2) {
            case 0: {
                cu2.b = n.d((float)cu2.b / (float)set.size());
                break;
            }
            case 1: {
                cu2.b = 1;
                break;
            }
            case 2: {
                cu2.b = cu2.a().i();
            }
        }
        cu2.b += n3;
    }

    public boolean b(r r2) {
        return true;
    }

    public static int a(ap ap2) {
        return ap2 instanceof y ? aq.b((y)((Object)ap2)) : 0;
    }

    public static int b(y y2) {
        if (y2 == null) {
            return 0;
        }
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < y2.e(); ++i2) {
            cu cu2 = y2.a(i2);
            if (cu2 == null) continue;
            f2 += (float)cu2.b / (float)Math.min(y2.g(), cu2.b());
            ++n2;
        }
        return n.d((f2 /= (float)y2.e()) * 14.0f) + (n2 > 0 ? 1 : 0);
    }
}

