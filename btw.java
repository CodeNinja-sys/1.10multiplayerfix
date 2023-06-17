/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.c.a;

public class btw
extends mn {
    @Override
    public String a() {
        return "achievement";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.achievement.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (arrstring.length < 2) {
            throw new ben("commands.achievement.usage", new Object[0]);
        }
        cyd cyd2 = bpv.a(arrstring[1]);
        if (cyd2 == null && !"*".equals(arrstring[1]) || cyd2 != null && !cyd2.e()) {
            throw new kx("commands.achievement.unknownAchievement", arrstring[1]);
        }
        czt czt2 = arrstring.length >= 3 ? btw.a(a2, ala2, arrstring[2]) : btw.b(ala2);
        boolean bl2 = "give".equalsIgnoreCase(arrstring[0]);
        boolean bl3 = "take".equalsIgnoreCase(arrstring[0]);
        if (!bl2 && !bl3) {
            return;
        }
        if (cyd2 == null) {
            if (bl2) {
                for (box box2 : bpa.e) {
                    czt2.a((cyd)box2);
                }
                btw.a(ala2, (fh)this, "commands.achievement.give.success.all", czt2.i_());
            } else if (bl3) {
                for (box box3 : ov.b(bpa.e)) {
                    czt2.b(box3);
                }
                btw.a(ala2, (fh)this, "commands.achievement.take.success.all", czt2.i_());
            }
            return;
        }
        if (cyd2 instanceof box) {
            box box4 = (box)cyd2;
            if (bl2) {
                if (czt2.cM().a(box4)) {
                    throw new kx("commands.achievement.alreadyHave", czt2.i_(), cyd2.j());
                }
                ArrayList arrayList = ov.a();
                while (box4.c != null && !czt2.cM().a(box4.c)) {
                    arrayList.add(box4.c);
                    box4 = box4.c;
                }
                for (box box5 : ov.b(arrayList)) {
                    czt2.a((cyd)box5);
                }
            } else if (bl3) {
                if (!czt2.cM().a(box4)) {
                    throw new kx("commands.achievement.dontHave", czt2.i_(), cyd2.j());
                }
                ArrayList arrayList = ov.a(nj.b(bpa.e.iterator(), new kp(this, czt2, cyd2)));
                ArrayList arrayList2 = ov.a((Iterable)arrayList);
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    box box6;
                    box box7 = box6 = (box)iterator.next();
                    boolean bl4 = false;
                    while (box7 != null) {
                        if (box7 == cyd2) {
                            bl4 = true;
                        }
                        box7 = box7.c;
                    }
                    if (bl4) continue;
                    box7 = box6;
                    while (box7 != null) {
                        arrayList2.remove(box6);
                        box7 = box7.c;
                    }
                }
                for (box box6 : arrayList2) {
                    czt2.b(box6);
                }
            }
        }
        if (bl2) {
            czt2.a(cyd2);
            btw.a(ala2, (fh)this, "commands.achievement.give.success.one", czt2.i_(), cyd2.j());
        } else if (bl3) {
            czt2.b(cyd2);
            btw.a(ala2, (fh)this, "commands.achievement.take.success.one", cyd2.j(), czt2.i_());
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return btw.a(arrstring, "give", "take");
        }
        if (arrstring.length == 2) {
            ArrayList arrayList = ov.a();
            for (cyd cyd2 : bpa.e) {
                arrayList.add(cyd2.e);
            }
            return btw.a(arrstring, arrayList);
        }
        if (arrstring.length == 3) {
            return btw.a(arrstring, a2.J());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return n2 == 2;
    }
}

