/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.c.a;

public class dm
extends mn {
    @Override
    public String a() {
        return "scoreboard";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.scoreboard.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        if (this.b(a2, ala2, arrstring)) {
            return;
        }
        if (arrstring.length < 1) {
            throw new ben("commands.scoreboard.usage", new Object[0]);
        }
        if ("objectives".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 1) {
                throw new ben("commands.scoreboard.objectives.usage", new Object[0]);
            }
            if ("list".equalsIgnoreCase(arrstring[1])) {
                this.a(ala2, a2);
                return;
            } else if ("add".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 4) throw new ben("commands.scoreboard.objectives.add.usage", new Object[0]);
                this.a(ala2, arrstring, 2, a2);
                return;
            } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 3) throw new ben("commands.scoreboard.objectives.remove.usage", new Object[0]);
                this.a(ala2, arrstring[2], a2);
                return;
            } else {
                if (!"setdisplay".equalsIgnoreCase(arrstring[1])) throw new ben("commands.scoreboard.objectives.usage", new Object[0]);
                if (arrstring.length != 3 && arrstring.length != 4) throw new ben("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                this.i(ala2, arrstring, 2, a2);
            }
            return;
        } else if ("players".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 1) {
                throw new ben("commands.scoreboard.players.usage", new Object[0]);
            }
            if ("list".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length > 3) throw new ben("commands.scoreboard.players.list.usage", new Object[0]);
                this.j(ala2, arrstring, 2, a2);
                return;
            } else if ("add".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 5) throw new ben("commands.scoreboard.players.add.usage", new Object[0]);
                this.k(ala2, arrstring, 2, a2);
                return;
            } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 5) throw new ben("commands.scoreboard.players.remove.usage", new Object[0]);
                this.k(ala2, arrstring, 2, a2);
                return;
            } else if ("set".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 5) throw new ben("commands.scoreboard.players.set.usage", new Object[0]);
                this.k(ala2, arrstring, 2, a2);
                return;
            } else if ("reset".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 3 && arrstring.length != 4) throw new ben("commands.scoreboard.players.reset.usage", new Object[0]);
                this.l(ala2, arrstring, 2, a2);
                return;
            } else if ("enable".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 4) throw new ben("commands.scoreboard.players.enable.usage", new Object[0]);
                this.m(ala2, arrstring, 2, a2);
                return;
            } else if ("test".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 5 && arrstring.length != 6) throw new ben("commands.scoreboard.players.test.usage", new Object[0]);
                this.n(ala2, arrstring, 2, a2);
                return;
            } else if ("operation".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 7) throw new ben("commands.scoreboard.players.operation.usage", new Object[0]);
                this.o(ala2, arrstring, 2, a2);
                return;
            } else {
                if (!"tag".equalsIgnoreCase(arrstring[1])) throw new ben("commands.scoreboard.players.usage", new Object[0]);
                if (arrstring.length < 4) throw new ben("commands.scoreboard.players.tag.usage", new Object[0]);
                this.a(a2, ala2, arrstring, 2);
            }
            return;
        } else {
            if (!"teams".equalsIgnoreCase(arrstring[0])) throw new ben("commands.scoreboard.usage", new Object[0]);
            if (arrstring.length == 1) {
                throw new ben("commands.scoreboard.teams.usage", new Object[0]);
            }
            if ("list".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length > 3) throw new ben("commands.scoreboard.teams.list.usage", new Object[0]);
                this.e(ala2, arrstring, 2, a2);
                return;
            } else if ("add".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 3) throw new ben("commands.scoreboard.teams.add.usage", new Object[0]);
                this.b(ala2, arrstring, 2, a2);
                return;
            } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 3) throw new ben("commands.scoreboard.teams.remove.usage", new Object[0]);
                this.d(ala2, arrstring, 2, a2);
                return;
            } else if ("empty".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length != 3) throw new ben("commands.scoreboard.teams.empty.usage", new Object[0]);
                this.h(ala2, arrstring, 2, a2);
                return;
            } else if ("join".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 4 && (arrstring.length != 3 || !(ala2 instanceof bdl))) throw new ben("commands.scoreboard.teams.join.usage", new Object[0]);
                this.f(ala2, arrstring, 2, a2);
                return;
            } else if ("leave".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length < 3 && !(ala2 instanceof bdl)) throw new ben("commands.scoreboard.teams.leave.usage", new Object[0]);
                this.g(ala2, arrstring, 2, a2);
                return;
            } else {
                if (!"option".equalsIgnoreCase(arrstring[1])) throw new ben("commands.scoreboard.teams.usage", new Object[0]);
                if (arrstring.length != 4 && arrstring.length != 5) throw new ben("commands.scoreboard.teams.option.usage", new Object[0]);
                this.c(ala2, arrstring, 2, a2);
            }
        }
    }

    private boolean b(a a2, ala ala2, String[] arrstring) {
        int n2 = -1;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!this.a(arrstring, i2) || !"*".equals(arrstring[i2])) continue;
            if (n2 < 0) {
                n2 = i2;
                continue;
            }
            throw new kx("commands.scoreboard.noMultiWildcard", new Object[0]);
        }
        if (n2 < 0) {
            return false;
        }
        ArrayList arrayList = ov.a(this.a(a2).c());
        String string = arrstring[n2];
        ArrayList arrayList2 = ov.a();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string2;
            arrstring[n2] = string2 = (String)iterator.next();
            try {
                this.a(a2, ala2, arrstring);
                arrayList2.add(string2);
            }
            catch (kx kx2) {
                du du2 = new du(kx2.getMessage(), kx2.a());
                du2.h().a(aug.m);
                ala2.a(du2);
            }
        }
        arrstring[n2] = string;
        ala2.a(bnw.c, arrayList2.size());
        if (arrayList2.isEmpty()) {
            throw new ben("commands.scoreboard.allMatchesFailed", new Object[0]);
        }
        return true;
    }

    protected bzt a(a a2) {
        return ((iu)((Object)a2.a(0))).P();
    }

    protected bhi a(String string, boolean bl2, a a2) {
        bzt bzt2 = this.a(a2);
        bhi bhi2 = bzt2.b(string);
        if (bhi2 == null) {
            throw new kx("commands.scoreboard.objectiveNotFound", string);
        }
        if (bl2 && bhi2.c().b()) {
            throw new kx("commands.scoreboard.objectiveReadOnly", string);
        }
        return bhi2;
    }

    protected ef a(String string, a a2) {
        bzt bzt2 = this.a(a2);
        ef ef2 = bzt2.d(string);
        if (ef2 == null) {
            throw new kx("commands.scoreboard.teamNotFound", string);
        }
        return ef2;
    }

    protected void a(ala ala2, String[] arrstring, int n2, a a2) {
        String string = arrstring[n2++];
        String string2 = arrstring[n2++];
        bzt bzt2 = this.a(a2);
        bcu bcu2 = (bcu)bcu.a.get(string2);
        if (bcu2 == null) {
            throw new ben("commands.scoreboard.objectives.add.wrongType", string2);
        }
        if (bzt2.b(string) != null) {
            throw new kx("commands.scoreboard.objectives.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new hw("commands.scoreboard.objectives.add.tooLong", string, 16);
        }
        if (string.isEmpty()) {
            throw new ben("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (arrstring.length > n2) {
            String string3 = dm.a(ala2, arrstring, n2).i();
            if (string3.length() > 32) {
                throw new hw("commands.scoreboard.objectives.add.displayTooLong", string3, 32);
            }
            if (string3.isEmpty()) {
                bzt2.a(string, bcu2);
            } else {
                bzt2.a(string, bcu2).a(string3);
            }
        } else {
            bzt2.a(string, bcu2);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.objectives.add.success", string);
    }

    protected void b(ala ala2, String[] arrstring, int n2, a a2) {
        String string = arrstring[n2++];
        bzt bzt2 = this.a(a2);
        if (bzt2.d(string) != null) {
            throw new kx("commands.scoreboard.teams.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new hw("commands.scoreboard.teams.add.tooLong", string, 16);
        }
        if (string.isEmpty()) {
            throw new ben("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (arrstring.length > n2) {
            String string2 = dm.a(ala2, arrstring, n2).i();
            if (string2.length() > 32) {
                throw new hw("commands.scoreboard.teams.add.displayTooLong", string2, 32);
            }
            if (string2.isEmpty()) {
                bzt2.e(string);
            } else {
                bzt2.e(string).a(string2);
            }
        } else {
            bzt2.e(string);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.teams.add.success", string);
    }

    protected void c(ala ala2, String[] arrstring, int n2, a a2) {
        String string;
        ef ef2;
        if ((ef2 = this.a(arrstring[n2++], a2)) == null) {
            return;
        }
        if (!("color".equalsIgnoreCase(string = arrstring[n2++].toLowerCase()) || "friendlyfire".equalsIgnoreCase(string) || "seeFriendlyInvisibles".equalsIgnoreCase(string) || "nametagVisibility".equalsIgnoreCase(string) || "deathMessageVisibility".equalsIgnoreCase(string) || "collisionRule".equalsIgnoreCase(string))) {
            throw new ben("commands.scoreboard.teams.option.usage", new Object[0]);
        }
        if (arrstring.length == 4) {
            if ("color".equalsIgnoreCase(string)) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(aug.a(true, false)));
            }
            if ("friendlyfire".equalsIgnoreCase(string) || "seeFriendlyInvisibles".equalsIgnoreCase(string)) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(Arrays.asList("true", "false")));
            }
            if ("nametagVisibility".equalsIgnoreCase(string) || "deathMessageVisibility".equalsIgnoreCase(string)) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(afb.a()));
            }
            if ("collisionRule".equalsIgnoreCase(string)) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(bfo.a()));
            }
            throw new ben("commands.scoreboard.teams.option.usage", new Object[0]);
        }
        String string2 = arrstring[n2];
        if ("color".equalsIgnoreCase(string)) {
            aug aug2 = aug.b(string2);
            if (aug2 == null || aug2.b()) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(aug.a(true, false)));
            }
            ef2.a(aug2);
            ef2.b(aug2.toString());
            ef2.c(aug.v.toString());
        } else if ("friendlyfire".equalsIgnoreCase(string)) {
            if (!"true".equalsIgnoreCase(string2) && !"false".equalsIgnoreCase(string2)) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(Arrays.asList("true", "false")));
            }
            ef2.a("true".equalsIgnoreCase(string2));
        } else if ("seeFriendlyInvisibles".equalsIgnoreCase(string)) {
            if (!"true".equalsIgnoreCase(string2) && !"false".equalsIgnoreCase(string2)) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(Arrays.asList("true", "false")));
            }
            ef2.b("true".equalsIgnoreCase(string2));
        } else if ("nametagVisibility".equalsIgnoreCase(string)) {
            afb afb2 = afb.a(string2);
            if (afb2 == null) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(afb.a()));
            }
            ef2.a(afb2);
        } else if ("deathMessageVisibility".equalsIgnoreCase(string)) {
            afb afb3 = afb.a(string2);
            if (afb3 == null) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(afb.a()));
            }
            ef2.b(afb3);
        } else if ("collisionRule".equalsIgnoreCase(string)) {
            bfo bfo2 = bfo.a(string2);
            if (bfo2 == null) {
                throw new ben("commands.scoreboard.teams.option.noValue", string, dm.a(bfo.a()));
            }
            ef2.a(bfo2);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.teams.option.success", string, ef2.a(), string2);
    }

    protected void d(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        ef ef2 = this.a(arrstring[n2], a2);
        if (ef2 == null) {
            return;
        }
        bzt2.d(ef2);
        dm.a(ala2, (fh)this, "commands.scoreboard.teams.remove.success", ef2.a());
    }

    protected void e(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        if (arrstring.length > n2) {
            ef ef2 = this.a(arrstring[n2], a2);
            if (ef2 == null) {
                return;
            }
            Collection collection = ef2.c();
            ala2.a(bnw.e, collection.size());
            if (collection.isEmpty()) {
                throw new kx("commands.scoreboard.teams.list.player.empty", ef2.a());
            }
            du du2 = new du("commands.scoreboard.teams.list.player.count", collection.size(), ef2.a());
            du2.h().a(aug.c);
            ala2.a(du2);
            ala2.a(new aym(dm.a(collection.toArray())));
        } else {
            Collection collection = bzt2.f();
            ala2.a(bnw.e, collection.size());
            if (collection.isEmpty()) {
                throw new kx("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            du du3 = new du("commands.scoreboard.teams.list.count", collection.size());
            du3.h().a(aug.c);
            ala2.a(du3);
            for (ef ef3 : collection) {
                ala2.a(new du("commands.scoreboard.teams.list.entry", ef3.a(), ef3.b(), ef3.c().size()));
            }
        }
    }

    protected void f(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        String string = arrstring[n2++];
        HashSet hashSet = aad.a();
        HashSet hashSet2 = aad.a();
        if (ala2 instanceof bdl && n2 == arrstring.length) {
            String string2 = dm.b(ala2).i_();
            if (bzt2.a(string2, string)) {
                hashSet.add(string2);
            } else {
                hashSet2.add(string2);
            }
        } else {
            while (n2 < arrstring.length) {
                Object object;
                String string3;
                if ((string3 = arrstring[n2++]).startsWith("@")) {
                    object = dm.c(a2, ala2, string3);
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        cpk cpk2 = (cpk)iterator.next();
                        String string4 = dm.e(a2, ala2, cpk2.cy());
                        if (bzt2.a(string4, string)) {
                            hashSet.add(string4);
                            continue;
                        }
                        hashSet2.add(string4);
                    }
                    continue;
                }
                object = dm.e(a2, ala2, string3);
                if (bzt2.a((String)object, string)) {
                    hashSet.add(object);
                    continue;
                }
                hashSet2.add(object);
            }
        }
        if (!hashSet.isEmpty()) {
            ala2.a(bnw.c, hashSet.size());
            dm.a(ala2, (fh)this, "commands.scoreboard.teams.join.success", hashSet.size(), string, dm.a(hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new kx("commands.scoreboard.teams.join.failure", hashSet2.size(), string, dm.a(hashSet2.toArray(new String[hashSet2.size()])));
        }
    }

    protected void g(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        HashSet hashSet = aad.a();
        HashSet hashSet2 = aad.a();
        if (ala2 instanceof bdl && n2 == arrstring.length) {
            String string = dm.b(ala2).i_();
            if (bzt2.f(string)) {
                hashSet.add(string);
            } else {
                hashSet2.add(string);
            }
        } else {
            while (n2 < arrstring.length) {
                Object object;
                String string;
                if ((string = arrstring[n2++]).startsWith("@")) {
                    object = dm.c(a2, ala2, string);
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        cpk cpk2 = (cpk)iterator.next();
                        String string2 = dm.e(a2, ala2, cpk2.cy());
                        if (bzt2.f(string2)) {
                            hashSet.add(string2);
                            continue;
                        }
                        hashSet2.add(string2);
                    }
                    continue;
                }
                object = dm.e(a2, ala2, string);
                if (bzt2.f((String)object)) {
                    hashSet.add(object);
                    continue;
                }
                hashSet2.add(object);
            }
        }
        if (!hashSet.isEmpty()) {
            ala2.a(bnw.c, hashSet.size());
            dm.a(ala2, (fh)this, "commands.scoreboard.teams.leave.success", hashSet.size(), dm.a(hashSet.toArray(new String[hashSet.size()])));
        }
        if (!hashSet2.isEmpty()) {
            throw new kx("commands.scoreboard.teams.leave.failure", hashSet2.size(), dm.a(hashSet2.toArray(new String[hashSet2.size()])));
        }
    }

    protected void h(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        ef ef2 = this.a(arrstring[n2], a2);
        if (ef2 == null) {
            return;
        }
        ArrayList arrayList = ov.a(ef2.c());
        ala2.a(bnw.c, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new kx("commands.scoreboard.teams.empty.alreadyEmpty", ef2.a());
        }
        for (String string : arrayList) {
            bzt2.a(string, ef2);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.teams.empty.success", arrayList.size(), ef2.a());
    }

    protected void a(ala ala2, String string, a a2) {
        bzt bzt2 = this.a(a2);
        bhi bhi2 = this.a(string, false, a2);
        bzt2.j(bhi2);
        dm.a(ala2, (fh)this, "commands.scoreboard.objectives.remove.success", string);
    }

    protected void a(ala ala2, a a2) {
        bzt bzt2 = this.a(a2);
        Collection collection = bzt2.b();
        if (collection.isEmpty()) {
            throw new kx("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        du du2 = new du("commands.scoreboard.objectives.list.count", collection.size());
        du2.h().a(aug.c);
        ala2.a(du2);
        for (bhi bhi2 : collection) {
            ala2.a(new du("commands.scoreboard.objectives.list.entry", bhi2.b(), bhi2.d(), bhi2.c().a()));
        }
    }

    protected void i(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        String string = arrstring[n2++];
        int n3 = bzt.h(string);
        bhi bhi2 = null;
        if (arrstring.length == 4) {
            bhi2 = this.a(arrstring[n2], false, a2);
        }
        if (n3 < 0) {
            throw new kx("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
        }
        bzt2.a(n3, bhi2);
        if (bhi2 != null) {
            dm.a(ala2, (fh)this, "commands.scoreboard.objectives.setdisplay.successSet", bzt.b(n3), bhi2.b());
        } else {
            dm.a(ala2, (fh)this, "commands.scoreboard.objectives.setdisplay.successCleared", bzt.b(n3));
        }
    }

    protected void j(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        if (arrstring.length > n2) {
            String string = dm.e(a2, ala2, arrstring[n2]);
            Map map = bzt2.c(string);
            ala2.a(bnw.e, map.size());
            if (map.isEmpty()) {
                throw new kx("commands.scoreboard.players.list.player.empty", string);
            }
            du du2 = new du("commands.scoreboard.players.list.player.count", map.size(), string);
            du2.h().a(aug.c);
            ala2.a(du2);
            for (czu czu2 : map.values()) {
                ala2.a(new du("commands.scoreboard.players.list.player.entry", czu2.b(), czu2.c().d(), czu2.c().b()));
            }
        } else {
            Collection collection = bzt2.c();
            ala2.a(bnw.e, collection.size());
            if (collection.isEmpty()) {
                throw new kx("commands.scoreboard.players.list.empty", new Object[0]);
            }
            du du3 = new du("commands.scoreboard.players.list.count", collection.size());
            du3.h().a(aug.c);
            ala2.a(du3);
            ala2.a(new aym(dm.a(collection.toArray())));
        }
    }

    protected void k(ala ala2, String[] arrstring, int n2, a a2) {
        Object object;
        Object object2;
        int n3;
        String string;
        String string2 = arrstring[n2 - 1];
        int n4 = n2;
        if ((string = dm.e(a2, ala2, arrstring[n2++])).length() > 40) {
            throw new hw("commands.scoreboard.players.name.tooLong", string, 40);
        }
        bhi bhi2 = this.a(arrstring[n2++], true, a2);
        int n5 = n3 = "set".equalsIgnoreCase(string2) ? dm.a(arrstring[n2++]) : dm.a(arrstring[n2++], 0);
        if (arrstring.length > n2) {
            object2 = dm.b(a2, ala2, arrstring[n4]);
            try {
                object = bdg.a(dm.b(arrstring, n2));
                bvp bvp2 = dm.a((cpk)object2);
                if (!ayj.a((azt)object, bvp2, true)) {
                    throw new kx("commands.scoreboard.players.set.tagMismatch", string);
                }
            }
            catch (aoo aoo2) {
                throw new kx("commands.scoreboard.players.set.tagError", aoo2.getMessage());
            }
        }
        object2 = this.a(a2);
        object = ((bzt)object2).c(string, bhi2);
        if ("set".equalsIgnoreCase(string2)) {
            ((czu)object).c(n3);
        } else if ("add".equalsIgnoreCase(string2)) {
            ((czu)object).a(n3);
        } else {
            ((czu)object).b(n3);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.players.set.success", bhi2.b(), string, ((czu)object).b());
    }

    protected void l(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        String string = dm.e(a2, ala2, arrstring[n2++]);
        if (arrstring.length > n2) {
            bhi bhi2 = this.a(arrstring[n2++], false, a2);
            bzt2.d(string, bhi2);
            dm.a(ala2, (fh)this, "commands.scoreboard.players.resetscore.success", bhi2.b(), string);
        } else {
            bzt2.d(string, null);
            dm.a(ala2, (fh)this, "commands.scoreboard.players.reset.success", string);
        }
    }

    protected void m(ala ala2, String[] arrstring, int n2, a a2) {
        String string;
        bzt bzt2 = this.a(a2);
        if ((string = dm.d(a2, ala2, arrstring[n2++])).length() > 40) {
            throw new hw("commands.scoreboard.players.name.tooLong", string, 40);
        }
        bhi bhi2 = this.a(arrstring[n2], false, a2);
        if (bhi2.c() != bcu.c) {
            throw new kx("commands.scoreboard.players.enable.noTrigger", bhi2.b());
        }
        czu czu2 = bzt2.c(string, bhi2);
        czu2.a(false);
        dm.a(ala2, (fh)this, "commands.scoreboard.players.enable.success", bhi2.b(), string);
    }

    protected void n(ala ala2, String[] arrstring, int n2, a a2) {
        bhi bhi2;
        String string;
        bzt bzt2 = this.a(a2);
        if ((string = dm.e(a2, ala2, arrstring[n2++])).length() > 40) {
            throw new hw("commands.scoreboard.players.name.tooLong", string, 40);
        }
        if (!bzt2.b(string, bhi2 = this.a(arrstring[n2++], false, a2))) {
            throw new kx("commands.scoreboard.players.test.notFound", bhi2.b(), string);
        }
        int n3 = arrstring[n2].equals("*") ? Integer.MIN_VALUE : dm.a(arrstring[n2]);
        int n4 = ++n2 >= arrstring.length || arrstring[n2].equals("*") ? Integer.MAX_VALUE : dm.a(arrstring[n2], n3);
        czu czu2 = bzt2.c(string, bhi2);
        if (czu2.b() < n3 || czu2.b() > n4) {
            throw new kx("commands.scoreboard.players.test.failed", czu2.b(), n3, n4);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.players.test.success", czu2.b(), n3, n4);
    }

    protected void o(ala ala2, String[] arrstring, int n2, a a2) {
        bzt bzt2 = this.a(a2);
        String string = dm.e(a2, ala2, arrstring[n2++]);
        bhi bhi2 = this.a(arrstring[n2++], true, a2);
        String string2 = arrstring[n2++];
        String string3 = dm.e(a2, ala2, arrstring[n2++]);
        bhi bhi3 = this.a(arrstring[n2], false, a2);
        if (string.length() > 40) {
            throw new hw("commands.scoreboard.players.name.tooLong", string, 40);
        }
        if (string3.length() > 40) {
            throw new hw("commands.scoreboard.players.name.tooLong", string3, 40);
        }
        czu czu2 = bzt2.c(string, bhi2);
        if (!bzt2.b(string3, bhi3)) {
            throw new kx("commands.scoreboard.players.operation.notFound", bhi3.b(), string3);
        }
        czu czu3 = bzt2.c(string3, bhi3);
        if ("+=".equals(string2)) {
            czu2.c(czu2.b() + czu3.b());
        } else if ("-=".equals(string2)) {
            czu2.c(czu2.b() - czu3.b());
        } else if ("*=".equals(string2)) {
            czu2.c(czu2.b() * czu3.b());
        } else if ("/=".equals(string2)) {
            if (czu3.b() != 0) {
                czu2.c(czu2.b() / czu3.b());
            }
        } else if ("%=".equals(string2)) {
            if (czu3.b() != 0) {
                czu2.c(czu2.b() % czu3.b());
            }
        } else if ("=".equals(string2)) {
            czu2.c(czu3.b());
        } else if ("<".equals(string2)) {
            czu2.c(Math.min(czu2.b(), czu3.b()));
        } else if (">".equals(string2)) {
            czu2.c(Math.max(czu2.b(), czu3.b()));
        } else if ("><".equals(string2)) {
            int n3 = czu2.b();
            czu2.c(czu3.b());
            czu3.c(n3);
        } else {
            throw new kx("commands.scoreboard.players.operation.invalidOperation", string2);
        }
        dm.a(ala2, (fh)this, "commands.scoreboard.players.operation.success", new Object[0]);
    }

    protected void a(a a2, ala ala2, String[] arrstring, int n2) {
        String string = dm.e(a2, ala2, arrstring[n2]);
        cpk cpk2 = dm.b(a2, ala2, arrstring[n2++]);
        String string2 = arrstring[n2++];
        Set set = cpk2.bX();
        if ("list".equals(string2)) {
            if (!set.isEmpty()) {
                du du2 = new du("commands.scoreboard.players.tag.list", string);
                du2.h().a(aug.c);
                ala2.a(du2);
                ala2.a(new aym(dm.a(set.toArray())));
            }
            ala2.a(bnw.e, set.size());
            return;
        }
        if (arrstring.length < 5) {
            throw new ben("commands.scoreboard.players.tag.usage", new Object[0]);
        }
        String string3 = arrstring[n2++];
        if (arrstring.length > n2) {
            try {
                bvp bvp2 = bdg.a(dm.b(arrstring, n2));
                bvp bvp3 = dm.a(cpk2);
                if (!ayj.a(bvp2, bvp3, true)) {
                    throw new kx("commands.scoreboard.players.tag.tagMismatch", string);
                }
            }
            catch (aoo aoo2) {
                throw new kx("commands.scoreboard.players.tag.tagError", aoo2.getMessage());
            }
        }
        if ("add".equals(string2)) {
            if (!cpk2.e(string3)) {
                throw new kx("commands.scoreboard.players.tag.tooMany", 1024);
            }
            dm.a(ala2, (fh)this, "commands.scoreboard.players.tag.success.add", string3);
        } else if ("remove".equals(string2)) {
            if (!cpk2.f(string3)) {
                throw new kx("commands.scoreboard.players.tag.notFound", string3);
            }
            dm.a(ala2, (fh)this, "commands.scoreboard.players.tag.success.remove", string3);
        } else {
            throw new ben("commands.scoreboard.players.tag.usage", new Object[0]);
        }
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length == 1) {
            return dm.a(arrstring, "objectives", "players", "teams");
        }
        if ("objectives".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 2) {
                return dm.a(arrstring, "list", "add", "remove", "setdisplay");
            }
            if ("add".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 4) {
                    Set set = bcu.a.keySet();
                    return dm.a(arrstring, set);
                }
            } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, this.a(false, a2));
                }
            } else if ("setdisplay".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, bzt.g());
                }
                if (arrstring.length == 4) {
                    return dm.a(arrstring, this.a(false, a2));
                }
            }
        } else if ("players".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 2) {
                return dm.a(arrstring, "set", "add", "remove", "reset", "list", "enable", "test", "operation", "tag");
            }
            if ("set".equalsIgnoreCase(arrstring[1]) || "add".equalsIgnoreCase(arrstring[1]) || "remove".equalsIgnoreCase(arrstring[1]) || "reset".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, a2.J());
                }
                if (arrstring.length == 4) {
                    return dm.a(arrstring, this.a(true, a2));
                }
            } else if ("enable".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, a2.J());
                }
                if (arrstring.length == 4) {
                    return dm.a(arrstring, this.b(a2));
                }
            } else if ("list".equalsIgnoreCase(arrstring[1]) || "test".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, this.a(a2).c());
                }
                if (arrstring.length == 4 && "test".equalsIgnoreCase(arrstring[1])) {
                    return dm.a(arrstring, this.a(false, a2));
                }
            } else if ("operation".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, this.a(a2).c());
                }
                if (arrstring.length == 4) {
                    return dm.a(arrstring, this.a(true, a2));
                }
                if (arrstring.length == 5) {
                    return dm.a(arrstring, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><");
                }
                if (arrstring.length == 6) {
                    return dm.a(arrstring, a2.J());
                }
                if (arrstring.length == 7) {
                    return dm.a(arrstring, this.a(false, a2));
                }
            } else if ("tag".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, this.a(a2).c());
                }
                if (arrstring.length == 4) {
                    return dm.a(arrstring, "add", "remove", "list");
                }
            }
        } else if ("teams".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 2) {
                return dm.a(arrstring, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if ("join".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return dm.a(arrstring, this.a(a2).e());
                }
                if (arrstring.length >= 4) {
                    return dm.a(arrstring, a2.J());
                }
            } else {
                if ("leave".equalsIgnoreCase(arrstring[1])) {
                    return dm.a(arrstring, a2.J());
                }
                if ("empty".equalsIgnoreCase(arrstring[1]) || "list".equalsIgnoreCase(arrstring[1]) || "remove".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length == 3) {
                        return dm.a(arrstring, this.a(a2).e());
                    }
                } else if ("option".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length == 3) {
                        return dm.a(arrstring, this.a(a2).e());
                    }
                    if (arrstring.length == 4) {
                        return dm.a(arrstring, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility", "collisionRule");
                    }
                    if (arrstring.length == 5) {
                        if ("color".equalsIgnoreCase(arrstring[3])) {
                            return dm.a(arrstring, aug.a(true, false));
                        }
                        if ("nametagVisibility".equalsIgnoreCase(arrstring[3]) || "deathMessageVisibility".equalsIgnoreCase(arrstring[3])) {
                            return dm.a(arrstring, afb.a());
                        }
                        if ("collisionRule".equalsIgnoreCase(arrstring[3])) {
                            return dm.a(arrstring, bfo.a());
                        }
                        if ("friendlyfire".equalsIgnoreCase(arrstring[3]) || "seeFriendlyInvisibles".equalsIgnoreCase(arrstring[3])) {
                            return dm.a(arrstring, "true", "false");
                        }
                    }
                }
            }
        }
        return Collections.emptyList();
    }

    protected List a(boolean bl2, a a2) {
        Collection collection = this.a(a2).b();
        ArrayList arrayList = ov.a();
        for (bhi bhi2 : collection) {
            if (bl2 && bhi2.c().b()) continue;
            arrayList.add(bhi2.b());
        }
        return arrayList;
    }

    protected List b(a a2) {
        Collection collection = this.a(a2).b();
        ArrayList arrayList = ov.a();
        for (bhi bhi2 : collection) {
            if (bhi2.c() != bcu.c) continue;
            arrayList.add(bhi2.b());
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        if ("players".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length > 1 && "operation".equalsIgnoreCase(arrstring[1])) {
                return n2 == 2 || n2 == 5;
            }
            return n2 == 2;
        }
        if ("teams".equalsIgnoreCase(arrstring[0])) {
            return n2 == 2;
        }
        return false;
    }
}

