/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class apq {
    public List f = ov.a();
    public List g = ov.a();
    public int h;
    private short a;
    private int b = -1;
    private int c;
    private final Set d = aad.a();
    protected List i = ov.a();
    private final Set e = aad.a();

    protected ux b(ux ux2) {
        ux2.d = this.g.size();
        this.g.add(ux2);
        this.f.add(null);
        return ux2;
    }

    public void b(cpx cpx2) {
        if (this.i.contains(cpx2)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.i.add(cpx2);
        cpx2.a(this, this.c());
        this.a();
    }

    public void c(cpx cpx2) {
        this.i.remove(cpx2);
    }

    public List c() {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            arrayList.add(((ux)this.g.get(i2)).a());
        }
        return arrayList;
    }

    public void a() {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            bhl bhl2 = ((ux)this.g.get(i2)).a();
            bhl bhl3 = (bhl)this.f.get(i2);
            if (bhl.b(bhl3, bhl2)) continue;
            bhl3 = bhl2 == null ? null : bhl2.j();
            this.f.set(i2, bhl3);
            for (int i3 = 0; i3 < this.i.size(); ++i3) {
                ((cpx)this.i.get(i3)).a(this, i2, bhl3);
            }
        }
    }

    public boolean a(bdl bdl2, int n2) {
        return false;
    }

    public ux a(tb tb2, int n2) {
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            ux ux2 = (ux)this.g.get(i2);
            if (!ux2.a(tb2, n2)) continue;
            return ux2;
        }
        return null;
    }

    public ux a(int n2) {
        return (ux)this.g.get(n2);
    }

    public bhl b(bdl bdl2, int n2) {
        ux ux2 = (ux)this.g.get(n2);
        if (ux2 != null) {
            return ux2.a();
        }
        return null;
    }

    public bhl a(int n2, int n3, aao aao2, bdl bdl2) {
        bhl bhl2 = null;
        cps cps2 = bdl2.n;
        if (aao2 == aao.f) {
            int n4 = this.c;
            this.c = apq.c(n3);
            if ((n4 != 1 || this.c != 2) && n4 != this.c) {
                this.d();
            } else if (cps2.n() == null) {
                this.d();
            } else if (this.c == 0) {
                this.b = apq.b(n3);
                if (apq.a(this.b, bdl2)) {
                    this.c = 1;
                    this.d.clear();
                } else {
                    this.d();
                }
            } else if (this.c == 1) {
                ux ux2 = (ux)this.g.get(n2);
                if (ux2 != null && apq.a(ux2, cps2.n(), true) && ux2.a(cps2.n()) && cps2.n().b > this.d.size() && this.a(ux2)) {
                    this.d.add(ux2);
                }
            } else if (this.c == 2) {
                if (!this.d.isEmpty()) {
                    bhl bhl3 = cps2.n().j();
                    int n5 = cps2.n().b;
                    for (ux ux3 : this.d) {
                        if (ux3 == null || !apq.a(ux3, cps2.n(), true) || !ux3.a(cps2.n()) || cps2.n().b < this.d.size() || !this.a(ux3)) continue;
                        bhl bhl4 = bhl3.j();
                        int n6 = ux3.b() ? ux3.a().b : 0;
                        apq.a(this.d, this.b, bhl4, n6);
                        if (bhl4.b > bhl4.b()) {
                            bhl4.b = bhl4.b();
                        }
                        if (bhl4.b > ux3.c(bhl4)) {
                            bhl4.b = ux3.c(bhl4);
                        }
                        n5 -= bhl4.b - n6;
                        ux3.b(bhl4);
                    }
                    bhl3.b = n5;
                    if (bhl3.b <= 0) {
                        bhl3 = null;
                    }
                    cps2.e(bhl3);
                }
                this.d();
            } else {
                this.d();
            }
        } else if (this.c != 0) {
            this.d();
        } else if (!(aao2 != aao.a && aao2 != aao.b || n3 != 0 && n3 != 1)) {
            if (n2 == -999) {
                if (cps2.n() != null) {
                    if (n3 == 0) {
                        bdl2.a(cps2.n(), true);
                        cps2.e(null);
                    }
                    if (n3 == 1) {
                        bdl2.a(cps2.n().a(1), true);
                        if (cps2.n().b == 0) {
                            cps2.e(null);
                        }
                    }
                }
            } else if (aao2 == aao.b) {
                if (n2 < 0) {
                    return null;
                }
                ux ux4 = (ux)this.g.get(n2);
                if (ux4 != null && ux4.a(bdl2)) {
                    bhl bhl5;
                    bhl bhl6 = ux4.a();
                    if (bhl6 != null && bhl6.b <= 0) {
                        bhl2 = bhl6.j();
                        ux4.b(null);
                    }
                    if ((bhl5 = this.b(bdl2, n2)) != null) {
                        azg azg2 = bhl5.a();
                        bhl2 = bhl5.j();
                        if (ux4.a() != null && ux4.a().a() == azg2) {
                            this.a(n2, n3, true, bdl2);
                        }
                    }
                }
            } else {
                if (n2 < 0) {
                    return null;
                }
                ux ux5 = (ux)this.g.get(n2);
                if (ux5 != null) {
                    bhl bhl7 = ux5.a();
                    bhl bhl8 = cps2.n();
                    if (bhl7 != null) {
                        bhl2 = bhl7.j();
                    }
                    if (bhl7 == null) {
                        if (bhl8 != null && ux5.a(bhl8)) {
                            int n7;
                            int n8 = n7 = n3 == 0 ? bhl8.b : 1;
                            if (n7 > ux5.c(bhl8)) {
                                n7 = ux5.c(bhl8);
                            }
                            ux5.b(bhl8.a(n7));
                            if (bhl8.b == 0) {
                                cps2.e(null);
                            }
                        }
                    } else if (ux5.a(bdl2)) {
                        int n9;
                        if (bhl8 == null) {
                            if (bhl7.b > 0) {
                                int n10 = n3 == 0 ? bhl7.b : (bhl7.b + 1) / 2;
                                cps2.e(ux5.a(n10));
                                if (bhl7.b <= 0) {
                                    ux5.b(null);
                                }
                                ux5.a(bdl2, cps2.n());
                            } else {
                                ux5.b(null);
                                cps2.e(null);
                            }
                        } else if (ux5.a(bhl8)) {
                            if (bhl7.a() != bhl8.a() || bhl7.h() != bhl8.h() || !bhl.a(bhl7, bhl8)) {
                                if (bhl8.b <= ux5.c(bhl8)) {
                                    ux5.b(bhl8);
                                    cps2.e(bhl7);
                                }
                            } else {
                                int n11;
                                int n12 = n11 = n3 == 0 ? bhl8.b : 1;
                                if (n11 > ux5.c(bhl8) - bhl7.b) {
                                    n11 = ux5.c(bhl8) - bhl7.b;
                                }
                                if (n11 > bhl8.b() - bhl7.b) {
                                    n11 = bhl8.b() - bhl7.b;
                                }
                                bhl8.a(n11);
                                if (bhl8.b == 0) {
                                    cps2.e(null);
                                }
                                bhl7.b += n11;
                            }
                        } else if (bhl7.a() == bhl8.a() && bhl8.b() > 1 && (!bhl7.e() || bhl7.h() == bhl8.h()) && bhl.a(bhl7, bhl8) && (n9 = bhl7.b) > 0 && n9 + bhl8.b <= bhl8.b()) {
                            bhl8.b += n9;
                            bhl7 = ux5.a(n9);
                            if (bhl7.b == 0) {
                                ux5.b(null);
                            }
                            ux5.a(bdl2, cps2.n());
                        }
                    }
                    ux5.c();
                }
            }
        } else if (aao2 == aao.c && n3 >= 0 && n3 < 9) {
            ux ux6 = (ux)this.g.get(n2);
            bhl bhl9 = cps2.a(n3);
            if (bhl9 != null && bhl9.b <= 0) {
                bhl9 = null;
                cps2.a(n3, null);
            }
            bhl bhl10 = ux6.a();
            if (bhl9 != null || bhl10 != null) {
                if (bhl9 == null) {
                    if (ux6.a(bdl2)) {
                        cps2.a(n3, bhl10);
                        ux6.b(null);
                        ux6.a(bdl2, bhl10);
                    }
                } else if (bhl10 == null) {
                    if (ux6.a(bhl9)) {
                        int n13 = ux6.c(bhl9);
                        if (bhl9.b > n13) {
                            ux6.b(bhl9.a(n13));
                        } else {
                            ux6.b(bhl9);
                            cps2.a(n3, null);
                        }
                    }
                } else if (ux6.a(bdl2) && ux6.a(bhl9)) {
                    int n14 = ux6.c(bhl9);
                    if (bhl9.b > n14) {
                        ux6.b(bhl9.a(n14));
                        ux6.a(bdl2, bhl10);
                        if (!cps2.c(bhl10)) {
                            bdl2.a(bhl10, true);
                        }
                    } else {
                        ux6.b(bhl9);
                        cps2.a(n3, bhl10);
                        ux6.a(bdl2, bhl10);
                    }
                }
            }
        } else if (aao2 == aao.d && bdl2.G.d && cps2.n() == null && n2 >= 0) {
            ux ux7 = (ux)this.g.get(n2);
            if (ux7 != null && ux7.b()) {
                if (ux7.a().b > 0) {
                    bhl bhl11 = ux7.a().j();
                    bhl11.b = bhl11.b();
                    cps2.e(bhl11);
                } else {
                    ux7.b(null);
                }
            }
        } else if (aao2 == aao.e && cps2.n() == null && n2 >= 0) {
            ux ux8 = (ux)this.g.get(n2);
            if (ux8 != null && ux8.b() && ux8.a(bdl2)) {
                bhl bhl12 = ux8.a(n3 == 0 ? 1 : ux8.a().b);
                ux8.a(bdl2, bhl12);
                bdl2.a(bhl12, true);
            }
        } else if (aao2 == aao.g && n2 >= 0) {
            ux ux9 = (ux)this.g.get(n2);
            bhl bhl13 = cps2.n();
            if (!(bhl13 == null || ux9 != null && ux9.b() && ux9.a(bdl2))) {
                int n15 = n3 == 0 ? 0 : this.g.size() - 1;
                int n16 = n3 == 0 ? 1 : -1;
                for (int i2 = 0; i2 < 2; ++i2) {
                    for (int i3 = n15; i3 >= 0 && i3 < this.g.size() && bhl13.b < bhl13.b(); i3 += n16) {
                        ux ux10 = (ux)this.g.get(i3);
                        if (!ux10.b() || !apq.a(ux10, bhl13, true) || !ux10.a(bdl2) || !this.a(bhl13, ux10) || i2 == 0 && ux10.a().b == ux10.a().b()) continue;
                        int n17 = Math.min(bhl13.b() - bhl13.b, ux10.a().b);
                        bhl bhl14 = ux10.a(n17);
                        bhl13.b += n17;
                        if (bhl14.b <= 0) {
                            ux10.b(null);
                        }
                        ux10.a(bdl2, bhl14);
                    }
                }
            }
            this.a();
        }
        return bhl2;
    }

    public boolean a(bhl bhl2, ux ux2) {
        return true;
    }

    protected void a(int n2, int n3, boolean bl2, bdl bdl2) {
        this.a(n2, n3, aao.b, bdl2);
    }

    public void a(bdl bdl2) {
        cps cps2 = bdl2.n;
        if (cps2.n() != null) {
            bdl2.a(cps2.n(), false);
            cps2.e(null);
        }
    }

    public void a(tb tb2) {
        this.a();
    }

    public void a(int n2, bhl bhl2) {
        this.a(n2).b(bhl2);
    }

    public void a(bhl[] arrbhl) {
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            this.a(i2).b(arrbhl[i2]);
        }
    }

    public void a(int n2, int n3) {
    }

    public short a(cps cps2) {
        this.a = (short)(this.a + 1);
        return this.a;
    }

    public boolean c(bdl bdl2) {
        return !this.e.contains(bdl2);
    }

    public void a(bdl bdl2, boolean bl2) {
        if (bl2) {
            this.e.remove(bdl2);
        } else {
            this.e.add(bdl2);
        }
    }

    public abstract boolean b(bdl var1);

    protected boolean a(bhl bhl2, int n2, int n3, boolean bl2) {
        bhl bhl3;
        ux ux2;
        boolean bl3 = false;
        int n4 = n2;
        if (bl2) {
            n4 = n3 - 1;
        }
        if (bhl2.c()) {
            while (bhl2.b > 0 && (!bl2 && n4 < n3 || bl2 && n4 >= n2)) {
                ux2 = (ux)this.g.get(n4);
                bhl3 = ux2.a();
                if (bhl3 != null && apq.a(bhl2, bhl3)) {
                    int n5 = bhl3.b + bhl2.b;
                    if (n5 <= bhl2.b()) {
                        bhl2.b = 0;
                        bhl3.b = n5;
                        ux2.c();
                        bl3 = true;
                    } else if (bhl3.b < bhl2.b()) {
                        bhl2.b -= bhl2.b() - bhl3.b;
                        bhl3.b = bhl2.b();
                        ux2.c();
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
        if (bhl2.b > 0) {
            n4 = bl2 ? n3 - 1 : n2;
            while (!bl2 && n4 < n3 || bl2 && n4 >= n2) {
                ux2 = (ux)this.g.get(n4);
                bhl3 = ux2.a();
                if (bhl3 == null) {
                    ux2.b(bhl2.j());
                    ux2.c();
                    bhl2.b = 0;
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

    private static boolean a(bhl bhl2, bhl bhl3) {
        return bhl3.a() == bhl2.a() && (!bhl2.e() || bhl2.h() == bhl3.h()) && bhl.a(bhl2, bhl3);
    }

    public static int b(int n2) {
        return n2 >> 2 & 3;
    }

    public static int c(int n2) {
        return n2 & 3;
    }

    public static int b(int n2, int n3) {
        return n2 & 3 | (n3 & 3) << 2;
    }

    public static boolean a(int n2, bdl bdl2) {
        if (n2 == 0) {
            return true;
        }
        if (n2 == 1) {
            return true;
        }
        return n2 == 2 && bdl2.G.d;
    }

    protected void d() {
        this.c = 0;
        this.d.clear();
    }

    public static boolean a(ux ux2, bhl bhl2, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = ux2 == null || !ux2.b();
        if (ux2 != null && ux2.b() && bhl2 != null && bhl2.a(ux2.a()) && bhl.a(ux2.a(), bhl2)) {
            bl3 |= ux2.a().b + (bl2 ? 0 : bhl2.b) <= bhl2.b();
        }
        return bl3;
    }

    public static void a(Set set, int n2, bhl bhl2, int n3) {
        switch (n2) {
            case 0: {
                bhl2.b = cmk.d((float)bhl2.b / (float)set.size());
                break;
            }
            case 1: {
                bhl2.b = 1;
                break;
            }
            case 2: {
                bhl2.b = bhl2.a().i();
            }
        }
        bhl2.b += n3;
    }

    public boolean a(ux ux2) {
        return true;
    }

    public static int a(bql bql2) {
        if (bql2 instanceof tb) {
            return apq.b((tb)((Object)bql2));
        }
        return 0;
    }

    public static int b(tb tb2) {
        if (tb2 == null) {
            return 0;
        }
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < tb2.aI_(); ++i2) {
            bhl bhl2 = tb2.a(i2);
            if (bhl2 == null) continue;
            f2 += (float)bhl2.b / (float)Math.min(tb2.d(), bhl2.b());
            ++n2;
        }
        return cmk.d((f2 /= (float)tb2.aI_()) * 14.0f) + (n2 > 0 ? 1 : 0);
    }
}

