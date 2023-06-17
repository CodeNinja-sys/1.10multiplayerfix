/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.c.a;

public class aea
extends mn {
    @Override
    public String a() {
        return "spreadplayers";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.spreadplayers.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 6) {
            throw new ben("commands.spreadplayers.usage", new Object[0]);
        }
        int n2 = 0;
        cmz cmz2 = ala2.k_();
        double d2 = aea.b(cmz2.a(), arrstring[n2++], true);
        double d3 = aea.b(cmz2.c(), arrstring[n2++], true);
        double d4 = aea.a(arrstring[n2++], 0.0);
        double d5 = aea.a(arrstring[n2++], d4 + 1.0);
        boolean bl2 = aea.d(arrstring[n2++]);
        ArrayList arrayList = ov.a();
        while (n2 < arrstring.length) {
            Object object;
            String string;
            if (an.b(string = arrstring[n2++])) {
                object = an.b(ala2, string, cpk.class);
                if (object.isEmpty()) {
                    throw new bbg();
                }
                arrayList.addAll(object);
                continue;
            }
            object = ((cmt)((Object)a2.al())).a(string);
            if (object == null) {
                throw new chs();
            }
            arrayList.add(object);
        }
        ala2.a(bnw.c, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new bbg();
        }
        ala2.a(new du("commands.spreadplayers.spreading." + (bl2 ? "teams" : "players"), arrayList.size(), d5, d2, d3, d4));
        this.a(ala2, arrayList, new bdk(d2, d3), d4, d5, ((cpk)arrayList.get((int)0)).aQ, bl2);
    }

    private void a(ala ala2, List list, bdk bdk2, double d2, double d3, iu iu2, boolean bl2) {
        Random random = new Random();
        double d4 = bdk2.a - d3;
        double d5 = bdk2.b - d3;
        double d6 = bdk2.a + d3;
        double d7 = bdk2.b + d3;
        bdk[] arrbdk = this.a(random, bl2 ? this.b(list) : list.size(), d4, d5, d6, d7);
        int n2 = this.a(bdk2, d2, iu2, random, d4, d5, d6, d7, arrbdk, bl2);
        double d8 = this.a(list, iu2, arrbdk, bl2);
        aea.a(ala2, (fh)this, "commands.spreadplayers.success." + (bl2 ? "teams" : "players"), arrbdk.length, bdk2.a, bdk2.b);
        if (arrbdk.length > 1) {
            ala2.a(new du("commands.spreadplayers.info." + (bl2 ? "teams" : "players"), String.format("%.2f", d8), n2));
        }
    }

    private int b(List list) {
        HashSet hashSet = aad.a();
        for (cpk cpk2 : list) {
            if (cpk2 instanceof bdl) {
                hashSet.add(((bdl)cpk2).as_());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private int a(bdk bdk2, double d2, iu iu2, Random random, double d3, double d4, double d5, double d6, bdk[] arrbdk, boolean bl2) {
        int n2;
        boolean bl3 = true;
        double d7 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && bl3; ++n2) {
            bl3 = false;
            d7 = 3.4028234663852886E38;
            for (int i2 = 0; i2 < arrbdk.length; ++i2) {
                bdk bdk3 = arrbdk[i2];
                int n3 = 0;
                bdk bdk4 = new bdk();
                for (int i3 = 0; i3 < arrbdk.length; ++i3) {
                    if (i2 == i3) continue;
                    bdk bdk5 = arrbdk[i3];
                    double d8 = bdk3.a(bdk5);
                    d7 = Math.min(d8, d7);
                    if (!(d8 < d2)) continue;
                    ++n3;
                    bdk4.a += bdk5.a - bdk3.a;
                    bdk4.b += bdk5.b - bdk3.b;
                }
                if (n3 > 0) {
                    bdk4.a /= (double)n3;
                    bdk4.b /= (double)n3;
                    double d9 = bdk4.b();
                    if (d9 > 0.0) {
                        bdk4.a();
                        bdk3.b(bdk4);
                    } else {
                        bdk3.a(random, d3, d4, d5, d6);
                    }
                    bl3 = true;
                }
                if (!bdk3.a(d3, d4, d5, d6)) continue;
                bl3 = true;
            }
            if (bl3) continue;
            for (bdk bdk4 : arrbdk) {
                if (bdk4.b(iu2)) continue;
                bdk4.a(random, d3, d4, d5, d6);
                bl3 = true;
            }
        }
        if (n2 >= 10000) {
            throw new kx("commands.spreadplayers.failure." + (bl2 ? "teams" : "players"), arrbdk.length, bdk2.a, bdk2.b, String.format("%.2f", d7));
        }
        return n2;
    }

    private double a(List list, iu iu2, bdk[] arrbdk, boolean bl2) {
        double d2 = 0.0;
        int n2 = 0;
        HashMap hashMap = sz.c();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            bdk bdk2;
            cpk cpk2 = (cpk)list.get(i2);
            if (bl2) {
                ccw ccw2;
                ccw ccw3 = ccw2 = cpk2 instanceof bdl ? ((bdl)cpk2).as_() : null;
                if (!hashMap.containsKey(ccw2)) {
                    hashMap.put(ccw2, arrbdk[n2++]);
                }
                bdk2 = (bdk)hashMap.get(ccw2);
            } else {
                bdk2 = arrbdk[n2++];
            }
            cpk2.l((float)cmk.c(bdk2.a) + 0.5f, bdk2.a(iu2), (double)cmk.c(bdk2.b) + 0.5);
            double d3 = Double.MAX_VALUE;
            for (bdk bdk3 : arrbdk) {
                if (bdk2 == bdk3) continue;
                double d4 = bdk2.a(bdk3);
                d3 = Math.min(d4, d3);
            }
            d2 += d3;
        }
        return d2 /= (double)list.size();
    }

    private bdk[] a(Random random, int n2, double d2, double d3, double d4, double d5) {
        bdk[] arrbdk = new bdk[n2];
        for (int i2 = 0; i2 < arrbdk.length; ++i2) {
            bdk bdk2 = new bdk();
            bdk2.a(random, d2, d3, d4, d5);
            arrbdk[i2] = bdk2;
        }
        return arrbdk;
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length >= 1 && arrstring.length <= 2) {
            return aea.b(arrstring, 0, cmz2);
        }
        return Collections.emptyList();
    }
}

