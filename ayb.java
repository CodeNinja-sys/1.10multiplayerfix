/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ip;
import com.a.a.d.mq;
import com.a.a.d.xe;
import java.util.List;

public class ayb
extends qg {
    protected ayb() {
        this.a(true);
    }

    public static aph a(int n2, iu iu2) {
        String string = "map_" + n2;
        aph aph2 = (aph)iu2.a(aph.class, string);
        if (aph2 == null) {
            aph2 = new aph(string);
            iu2.a(string, aph2);
        }
        return aph2;
    }

    public aph a(bhl bhl2, iu iu2) {
        String string = "map_" + bhl2.h();
        aph aph2 = (aph)iu2.a(aph.class, string);
        if (aph2 == null && !iu2.C) {
            bhl2.b(iu2.b("map"));
            string = "map_" + bhl2.h();
            aph2 = new aph(string);
            aph2.f = (byte)3;
            aph2.a(iu2.E().b(), iu2.E().d(), aph2.f);
            aph2.d = (byte)iu2.q.a().a();
            aph2.a();
            iu2.a(string, aph2);
        }
        return aph2;
    }

    public void a(iu iu2, cpk cpk2, aph aph2) {
        if (iu2.q.a().a() != aph2.d || !(cpk2 instanceof bdl)) {
            return;
        }
        int n2 = 1 << aph2.f;
        int n3 = aph2.b;
        int n4 = aph2.c;
        int n5 = cmk.c(cpk2.aU - (double)n3) / n2 + 64;
        int n6 = cmk.c(cpk2.aW - (double)n4) / n2 + 64;
        int n7 = 128 / n2;
        if (iu2.q.n()) {
            n7 /= 2;
        }
        cxr cxr2 = aph2.a((bdl)cpk2);
        ++cxr2.b;
        boolean bl2 = false;
        for (int i2 = n5 - n7 + 1; i2 < n5 + n7; ++i2) {
            if ((i2 & 0xF) != (cxr2.b & 0xF) && !bl2) continue;
            bl2 = false;
            double d2 = 0.0;
            for (int i3 = n6 - n7 - 1; i3 < n6 + n7; ++i3) {
                byte by2;
                bif bif2;
                int n8;
                int n9;
                if (i2 < 0 || i3 < -1 || i2 >= 128 || i3 >= 128) continue;
                int n10 = i2 - n5;
                int n11 = i3 - n6;
                boolean bl3 = n10 * n10 + n11 * n11 > (n7 - 2) * (n7 - 2);
                int n12 = (n3 / n2 + i2 - 64) * n2;
                int n13 = (n4 / n2 + i3 - 64) * n2;
                ip ip2 = ip.g();
                bhm bhm2 = iu2.e(new cmz(n12, 0, n13));
                if (bhm2.h()) continue;
                int n14 = n12 & 0xF;
                int n15 = n13 & 0xF;
                int n16 = 0;
                double d3 = 0.0;
                if (iu2.q.n()) {
                    int n17 = n12 + n13 * 231871;
                    if (((n17 = n17 * n17 * 31287121 + n17 * 11) >> 20 & 1) == 0) {
                        ip2.a(blg.d.s().a(bwt.a, (Comparable)((Object)dgu.a)).g(), 10);
                    } else {
                        ip2.a(blg.b.s().a(cec.a, (Comparable)((Object)ade.a)).g(), 100);
                    }
                    d3 = 100.0;
                } else {
                    pj pj2 = new pj();
                    for (int i4 = 0; i4 < n2; ++i4) {
                        for (n9 = 0; n9 < n2; ++n9) {
                            int n18 = bhm2.b(i4 + n14, n9 + n15) + 1;
                            dbk dbk2 = blg.a.s();
                            if (n18 > 1) {
                                while ((dbk2 = bhm2.c(pj2.a(i4 + n14, --n18, n9 + n15))).g() == bif.b && n18 > 0) {
                                }
                                if (n18 > 0 && dbk2.a().d()) {
                                    dbk dbk3;
                                    n8 = n18 - 1;
                                    do {
                                        dbk3 = bhm2.a(i4 + n14, n8--, n9 + n15);
                                        ++n16;
                                    } while (n8 > 0 && dbk3.a().d());
                                }
                            }
                            d3 += (double)n18 / (double)(n2 * n2);
                            ip2.add(dbk2.g());
                        }
                    }
                }
                n16 /= n2 * n2;
                double d4 = (d3 - d2) * 4.0 / (double)(n2 + 4) + ((double)(i2 + i3 & 1) - 0.5) * 0.4;
                n9 = 1;
                if (d4 > 0.6) {
                    n9 = 2;
                }
                if (d4 < -0.6) {
                    n9 = 0;
                }
                if ((bif2 = (bif)mq.d((Iterable)xe.d(ip2), bif.b)) == bif.n) {
                    d4 = (double)n16 * 0.1 + (double)(i2 + i3 & 1) * 0.2;
                    n9 = 1;
                    if (d4 < 0.5) {
                        n9 = 2;
                    }
                    if (d4 > 0.9) {
                        n9 = 0;
                    }
                }
                d2 = d3;
                if (i3 < 0 || n10 * n10 + n11 * n11 >= n7 * n7 || bl3 && (i2 + i3 & 1) == 0 || (by2 = aph2.g[i2 + i3 * 128]) == (n8 = (int)((byte)(bif2.M * 4 + n9)))) continue;
                aph2.g[i2 + i3 * 128] = n8;
                aph2.a(i2, i3);
                bl2 = true;
            }
        }
    }

    @Override
    public void a(bhl bhl2, iu iu2, cpk cpk2, int n2, boolean bl2) {
        if (iu2.C) {
            return;
        }
        aph aph2 = this.a(bhl2, iu2);
        if (cpk2 instanceof bdl) {
            bdl bdl2 = (bdl)cpk2;
            aph2.a(bdl2, bhl2);
        }
        if (bl2 || cpk2 instanceof bdl && ((bdl)cpk2).bu() == bhl2) {
            this.a(iu2, cpk2, aph2);
        }
    }

    @Override
    public ds a(bhl bhl2, iu iu2, bdl bdl2) {
        return this.a(bhl2, iu2).a(bhl2, iu2, bdl2);
    }

    @Override
    public void b(bhl bhl2, iu iu2, bdl bdl2) {
        bvp bvp2 = bhl2.o();
        if (bvp2 != null) {
            if (bvp2.b("map_scale_direction", 99)) {
                ayb.a(bhl2, iu2, bvp2.h("map_scale_direction"));
                bvp2.q("map_scale_direction");
            } else if (bvp2.p("map_tracking_position")) {
                ayb.b(bhl2, iu2);
                bvp2.q("map_tracking_position");
            }
        }
    }

    protected static void a(bhl bhl2, iu iu2, int n2) {
        aph aph2 = hp.bk.a(bhl2, iu2);
        bhl2.b(iu2.b("map"));
        aph aph3 = new aph("map_" + bhl2.h());
        aph3.f = (byte)cmk.a(aph2.f + n2, 0, 4);
        aph3.e = aph2.e;
        aph3.a(aph2.b, aph2.c, aph3.f);
        aph3.d = aph2.d;
        aph3.a();
        iu2.a("map_" + bhl2.h(), aph3);
    }

    protected static void b(bhl bhl2, iu iu2) {
        aph aph2 = hp.bk.a(bhl2, iu2);
        bhl2.b(iu2.b("map"));
        aph aph3 = new aph("map_" + bhl2.h());
        aph3.e = true;
        aph3.b = aph2.b;
        aph3.c = aph2.c;
        aph3.f = aph2.f;
        aph3.d = aph2.d;
        aph3.a();
        iu2.a("map_" + bhl2.h(), aph3);
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        aph aph2 = this.a(bhl2, bdl2.aQ);
        if (bl2) {
            if (aph2 == null) {
                list.add("Unknown map");
            } else {
                list.add("Scaling at 1:" + (1 << aph2.f));
                list.add("(Level " + aph2.f + "/" + 4 + ")");
            }
        }
    }
}

