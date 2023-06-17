/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.c.a;

public class cal
extends mn {
    @Override
    public String a() {
        return "fill";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.fill.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        int n2;
        if (arrstring.length < 7) {
            throw new ben("commands.fill.usage", new Object[0]);
        }
        ala2.a(bnw.b, 0);
        cmz cmz2 = cal.a(ala2, arrstring, 0, false);
        cmz cmz3 = cal.a(ala2, arrstring, 3, false);
        bfa bfa2 = mn.b(ala2, arrstring[6]);
        int n3 = 0;
        if (arrstring.length >= 8) {
            n3 = cal.a(arrstring[7], 0, 15);
        }
        cmz cmz4 = new cmz(Math.min(cmz2.a(), cmz3.a()), Math.min(cmz2.b(), cmz3.b()), Math.min(cmz2.c(), cmz3.c()));
        cmz cmz5 = new cmz(Math.max(cmz2.a(), cmz3.a()), Math.max(cmz2.b(), cmz3.b()), Math.max(cmz2.c(), cmz3.c()));
        int n4 = (cmz5.a() - cmz4.a() + 1) * (cmz5.b() - cmz4.b() + 1) * (cmz5.c() - cmz4.c() + 1);
        if (n4 > 32768) {
            throw new kx("commands.fill.tooManyBlocks", n4, 32768);
        }
        if (cmz4.b() < 0 || cmz5.b() >= 256) {
            throw new kx("commands.fill.outOfWorld", new Object[0]);
        }
        iu iu2 = ala2.m_();
        for (int i2 = cmz4.c(); i2 <= cmz5.c(); i2 += 16) {
            for (n2 = cmz4.a(); n2 <= cmz5.a(); n2 += 16) {
                if (iu2.d(new cmz(n2, cmz5.b() - cmz4.b(), i2))) continue;
                throw new kx("commands.fill.outOfWorld", new Object[0]);
            }
        }
        bvp bvp2 = new bvp();
        n2 = 0;
        if (arrstring.length >= 10 && bfa2.l()) {
            object = cal.a(ala2, arrstring, 9).i();
            try {
                bvp2 = bdg.a((String)object);
                n2 = 1;
            }
            catch (aoo aoo2) {
                throw new kx("commands.fill.tagError", aoo2.getMessage());
            }
        }
        object = ov.a();
        n4 = 0;
        for (int i3 = cmz4.c(); i3 <= cmz5.c(); ++i3) {
            for (int i4 = cmz4.b(); i4 <= cmz5.b(); ++i4) {
                for (int i5 = cmz4.a(); i5 <= cmz5.a(); ++i5) {
                    bql bql2;
                    dbk dbk2;
                    Object object2;
                    cmz cmz6 = new cmz(i5, i4, i3);
                    if (arrstring.length >= 9) {
                        if ("outline".equals(arrstring[8]) || "hollow".equals(arrstring[8])) {
                            if (i5 != cmz4.a() && i5 != cmz5.a() && i4 != cmz4.b() && i4 != cmz5.b() && i3 != cmz4.c() && i3 != cmz5.c()) {
                                if (!"hollow".equals(arrstring[8])) continue;
                                iu2.a(cmz6, blg.a.s(), 2);
                                object.add(cmz6);
                                continue;
                            }
                        } else if ("destroy".equals(arrstring[8])) {
                            iu2.b(cmz6, true);
                        } else if ("keep".equals(arrstring[8])) {
                            if (!iu2.c(cmz6)) {
                                continue;
                            }
                        } else if ("replace".equals(arrstring[8]) && !bfa2.l()) {
                            if (arrstring.length > 9) {
                                object2 = mn.b(ala2, arrstring[9]);
                                if (iu2.n(cmz6).t() != object2) continue;
                            }
                            if (arrstring.length > 10) {
                                int n5 = mn.a(arrstring[10]);
                                dbk2 = iu2.n(cmz6);
                                if (dbk2.t().e(dbk2) != n5) continue;
                            }
                        }
                    }
                    if ((object2 = iu2.q(cmz6)) != null) {
                        if (object2 instanceof tb) {
                            ((tb)object2).g();
                        }
                        iu2.a(cmz6, blg.cv.s(), bfa2 == blg.cv ? 2 : 4);
                    }
                    if (!iu2.a(cmz6, dbk2 = bfa2.a(n3), 2)) continue;
                    object.add(cmz6);
                    ++n4;
                    if (n2 == 0 || (bql2 = iu2.q(cmz6)) == null) continue;
                    bvp2.a("x", cmz6.a());
                    bvp2.a("y", cmz6.b());
                    bvp2.a("z", cmz6.c());
                    bql2.a(bvp2);
                }
            }
        }
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            cmz cmz7 = (cmz)iterator.next();
            bfa bfa3 = iu2.n(cmz7).t();
            iu2.a(cmz7, bfa3);
        }
        if (n4 <= 0) {
            throw new kx("commands.fill.failed", new Object[0]);
        }
        ala2.a(bnw.b, n4);
        cal.a(ala2, (fh)this, "commands.fill.success", n4);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return cal.a(arrstring, 0, cmz2);
        }
        if (arrstring.length > 3 && arrstring.length <= 6) {
            return cal.a(arrstring, 3, cmz2);
        }
        if (arrstring.length == 7) {
            return cal.a(arrstring, bfa.v.c());
        }
        if (arrstring.length == 9) {
            return cal.a(arrstring, "replace", "destroy", "keep", "hollow", "outline");
        }
        if (arrstring.length == 10 && "replace".equals(arrstring[8])) {
            return cal.a(arrstring, bfa.v.c());
        }
        return Collections.emptyList();
    }
}

