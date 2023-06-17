/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n.a;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.e.a;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.e.u;
import net.minecraft.j.d;
import net.minecraft.j.f;
import net.minecraft.j.j;
import net.minecraft.j.n;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.as;
import net.minecraft.n.az;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public class b
extends aa {
    @Override
    public String a() {
        return "scoreboard";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.scoreboard.usage";
    }

    @Override
    public void a(net.minecraft.c.a a2, az az2, String[] arrstring) {
        if (!this.b(a2, az2, arrstring)) {
            if (arrstring.length < 1) {
                throw new ac("commands.scoreboard.usage", new Object[0]);
            }
            if ("objectives".equalsIgnoreCase(arrstring[0])) {
                if (arrstring.length == 1) {
                    throw new ac("commands.scoreboard.objectives.usage", new Object[0]);
                }
                if ("list".equalsIgnoreCase(arrstring[1])) {
                    this.a(az2, a2);
                } else if ("add".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length < 4) {
                        throw new ac("commands.scoreboard.objectives.add.usage", new Object[0]);
                    }
                    this.a(az2, arrstring, 2, a2);
                } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 3) {
                        throw new ac("commands.scoreboard.objectives.remove.usage", new Object[0]);
                    }
                    this.a(az2, arrstring[2], a2);
                } else {
                    if (!"setdisplay".equalsIgnoreCase(arrstring[1])) {
                        throw new ac("commands.scoreboard.objectives.usage", new Object[0]);
                    }
                    if (arrstring.length != 3 && arrstring.length != 4) {
                        throw new ac("commands.scoreboard.objectives.setdisplay.usage", new Object[0]);
                    }
                    this.i(az2, arrstring, 2, a2);
                }
            } else if ("players".equalsIgnoreCase(arrstring[0])) {
                if (arrstring.length == 1) {
                    throw new ac("commands.scoreboard.players.usage", new Object[0]);
                }
                if ("list".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length > 3) {
                        throw new ac("commands.scoreboard.players.list.usage", new Object[0]);
                    }
                    this.j(az2, arrstring, 2, a2);
                } else if ("add".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length < 5) {
                        throw new ac("commands.scoreboard.players.add.usage", new Object[0]);
                    }
                    this.k(az2, arrstring, 2, a2);
                } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length < 5) {
                        throw new ac("commands.scoreboard.players.remove.usage", new Object[0]);
                    }
                    this.k(az2, arrstring, 2, a2);
                } else if ("set".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length < 5) {
                        throw new ac("commands.scoreboard.players.set.usage", new Object[0]);
                    }
                    this.k(az2, arrstring, 2, a2);
                } else if ("reset".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 3 && arrstring.length != 4) {
                        throw new ac("commands.scoreboard.players.reset.usage", new Object[0]);
                    }
                    this.l(az2, arrstring, 2, a2);
                } else if ("enable".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 4) {
                        throw new ac("commands.scoreboard.players.enable.usage", new Object[0]);
                    }
                    this.m(az2, arrstring, 2, a2);
                } else if ("test".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 5 && arrstring.length != 6) {
                        throw new ac("commands.scoreboard.players.test.usage", new Object[0]);
                    }
                    this.n(az2, arrstring, 2, a2);
                } else if ("operation".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 7) {
                        throw new ac("commands.scoreboard.players.operation.usage", new Object[0]);
                    }
                    this.o(az2, arrstring, 2, a2);
                } else {
                    if (!"tag".equalsIgnoreCase(arrstring[1])) {
                        throw new ac("commands.scoreboard.players.usage", new Object[0]);
                    }
                    if (arrstring.length < 4) {
                        throw new ac("commands.scoreboard.players.tag.usage", new Object[0]);
                    }
                    this.a(a2, az2, arrstring, 2);
                }
            } else {
                if (!"teams".equalsIgnoreCase(arrstring[0])) {
                    throw new ac("commands.scoreboard.usage", new Object[0]);
                }
                if (arrstring.length == 1) {
                    throw new ac("commands.scoreboard.teams.usage", new Object[0]);
                }
                if ("list".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length > 3) {
                        throw new ac("commands.scoreboard.teams.list.usage", new Object[0]);
                    }
                    this.e(az2, arrstring, 2, a2);
                } else if ("add".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length < 3) {
                        throw new ac("commands.scoreboard.teams.add.usage", new Object[0]);
                    }
                    this.b(az2, arrstring, 2, a2);
                } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 3) {
                        throw new ac("commands.scoreboard.teams.remove.usage", new Object[0]);
                    }
                    this.d(az2, arrstring, 2, a2);
                } else if ("empty".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length != 3) {
                        throw new ac("commands.scoreboard.teams.empty.usage", new Object[0]);
                    }
                    this.h(az2, arrstring, 2, a2);
                } else if ("join".equalsIgnoreCase(arrstring[1])) {
                    if (!(arrstring.length >= 4 || arrstring.length == 3 && az2 instanceof net.minecraft.w.a.b)) {
                        throw new ac("commands.scoreboard.teams.join.usage", new Object[0]);
                    }
                    this.f(az2, arrstring, 2, a2);
                } else if ("leave".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length < 3 && !(az2 instanceof net.minecraft.w.a.b)) {
                        throw new ac("commands.scoreboard.teams.leave.usage", new Object[0]);
                    }
                    this.g(az2, arrstring, 2, a2);
                } else {
                    if (!"option".equalsIgnoreCase(arrstring[1])) {
                        throw new ac("commands.scoreboard.teams.usage", new Object[0]);
                    }
                    if (arrstring.length != 4 && arrstring.length != 5) {
                        throw new ac("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    this.c(az2, arrstring, 2, a2);
                }
            }
        }
    }

    private boolean b(net.minecraft.c.a a2, az az2, String[] arrstring) {
        int n2 = -1;
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!this.a(arrstring, i2) || !"*".equals(arrstring[i2])) continue;
            if (n2 >= 0) {
                throw new o("commands.scoreboard.noMultiWildcard", new Object[0]);
            }
            n2 = i2;
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
                this.a(a2, az2, arrstring);
                arrayList2.add(string2);
            }
            catch (o o2) {
                l l2 = new l(o2.getMessage(), o2.a());
                l2.a().a(net.minecraft.u.d.o.m);
                az2.a(l2);
            }
        }
        arrstring[n2] = string;
        az2.a(br.c, arrayList2.size());
        if (arrayList2.isEmpty()) {
            throw new ac("commands.scoreboard.allMatchesFailed", new Object[0]);
        }
        return true;
    }

    protected r a(net.minecraft.c.a a2) {
        return a2.a(0).Q();
    }

    protected j a(String string, boolean bl2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        j j2 = r2.b(string);
        if (j2 == null) {
            throw new o("commands.scoreboard.objectiveNotFound", string);
        }
        if (bl2 && j2.c().a()) {
            throw new o("commands.scoreboard.objectiveReadOnly", string);
        }
        return j2;
    }

    protected d a(String string, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        d d2 = r2.d(string);
        if (d2 == null) {
            throw new o("commands.scoreboard.teamNotFound", string);
        }
        return d2;
    }

    protected void a(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        String string = arrstring[n2++];
        String string2 = arrstring[n2++];
        r r2 = this.a(a2);
        f f2 = (f)f.a.get(string2);
        if (f2 == null) {
            throw new ac("commands.scoreboard.objectives.add.wrongType", string2);
        }
        if (r2.b(string) != null) {
            throw new o("commands.scoreboard.objectives.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new as("commands.scoreboard.objectives.add.tooLong", string, 16);
        }
        if (string.isEmpty()) {
            throw new ac("commands.scoreboard.objectives.add.usage", new Object[0]);
        }
        if (arrstring.length > n2) {
            String string3 = b.a(az2, arrstring, n2).c();
            if (string3.length() > 32) {
                throw new as("commands.scoreboard.objectives.add.displayTooLong", string3, 32);
            }
            if (string3.isEmpty()) {
                r2.a(string, f2);
            } else {
                r2.a(string, f2).a(string3);
            }
        } else {
            r2.a(string, f2);
        }
        b.a(az2, (t)this, "commands.scoreboard.objectives.add.success", string);
    }

    protected void b(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        String string = arrstring[n2++];
        r r2 = this.a(a2);
        if (r2.d(string) != null) {
            throw new o("commands.scoreboard.teams.add.alreadyExists", string);
        }
        if (string.length() > 16) {
            throw new as("commands.scoreboard.teams.add.tooLong", string, 16);
        }
        if (string.isEmpty()) {
            throw new ac("commands.scoreboard.teams.add.usage", new Object[0]);
        }
        if (arrstring.length > n2) {
            String string2 = b.a(az2, arrstring, n2).c();
            if (string2.length() > 32) {
                throw new as("commands.scoreboard.teams.add.displayTooLong", string2, 32);
            }
            if (string2.isEmpty()) {
                r2.e(string);
            } else {
                r2.e(string).a(string2);
            }
        } else {
            r2.e(string);
        }
        b.a(az2, (t)this, "commands.scoreboard.teams.add.success", string);
    }

    protected void c(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        d d2;
        if ((d2 = this.a(arrstring[n2++], a2)) != null) {
            String string;
            if (!("color".equalsIgnoreCase(string = arrstring[n2++].toLowerCase()) || "friendlyfire".equalsIgnoreCase(string) || "seeFriendlyInvisibles".equalsIgnoreCase(string) || "nametagVisibility".equalsIgnoreCase(string) || "deathMessageVisibility".equalsIgnoreCase(string) || "collisionRule".equalsIgnoreCase(string))) {
                throw new ac("commands.scoreboard.teams.option.usage", new Object[0]);
            }
            if (arrstring.length == 4) {
                if ("color".equalsIgnoreCase(string)) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(net.minecraft.u.d.o.a(true, false)));
                }
                if (!"friendlyfire".equalsIgnoreCase(string) && !"seeFriendlyInvisibles".equalsIgnoreCase(string)) {
                    if (!"nametagVisibility".equalsIgnoreCase(string) && !"deathMessageVisibility".equalsIgnoreCase(string)) {
                        if ("collisionRule".equalsIgnoreCase(string)) {
                            throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(net.minecraft.j.b.a()));
                        }
                        throw new ac("commands.scoreboard.teams.option.usage", new Object[0]);
                    }
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(n.a()));
                }
                throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(Arrays.asList("true", "false")));
            }
            String string2 = arrstring[n2];
            if ("color".equalsIgnoreCase(string)) {
                net.minecraft.u.d.o o2 = net.minecraft.u.d.o.b(string2);
                if (o2 == null || o2.b()) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(net.minecraft.u.d.o.a(true, false)));
                }
                d2.a(o2);
                d2.b(o2.toString());
                d2.c(net.minecraft.u.d.o.v.toString());
            } else if ("friendlyfire".equalsIgnoreCase(string)) {
                if (!"true".equalsIgnoreCase(string2) && !"false".equalsIgnoreCase(string2)) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(Arrays.asList("true", "false")));
                }
                d2.a("true".equalsIgnoreCase(string2));
            } else if ("seeFriendlyInvisibles".equalsIgnoreCase(string)) {
                if (!"true".equalsIgnoreCase(string2) && !"false".equalsIgnoreCase(string2)) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(Arrays.asList("true", "false")));
                }
                d2.b("true".equalsIgnoreCase(string2));
            } else if ("nametagVisibility".equalsIgnoreCase(string)) {
                n n3 = n.a(string2);
                if (n3 == null) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(n.a()));
                }
                d2.a(n3);
            } else if ("deathMessageVisibility".equalsIgnoreCase(string)) {
                n n4 = n.a(string2);
                if (n4 == null) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(n.a()));
                }
                d2.b(n4);
            } else if ("collisionRule".equalsIgnoreCase(string)) {
                net.minecraft.j.b b2 = net.minecraft.j.b.a(string2);
                if (b2 == null) {
                    throw new ac("commands.scoreboard.teams.option.noValue", string, b.a(net.minecraft.j.b.a()));
                }
                d2.a(b2);
            }
            b.a(az2, (t)this, "commands.scoreboard.teams.option.success", string, d2.a(), string2);
        }
    }

    protected void d(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        d d2 = this.a(arrstring[n2], a2);
        if (d2 != null) {
            r2.d(d2);
            b.a(az2, (t)this, "commands.scoreboard.teams.remove.success", d2.a());
        }
    }

    protected void e(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        if (arrstring.length > n2) {
            d d2 = this.a(arrstring[n2], a2);
            if (d2 == null) {
                return;
            }
            Collection collection = d2.c();
            az2.a(br.e, collection.size());
            if (collection.isEmpty()) {
                throw new o("commands.scoreboard.teams.list.player.empty", d2.a());
            }
            l l2 = new l("commands.scoreboard.teams.list.player.count", collection.size(), d2.a());
            l2.a().a(net.minecraft.u.d.o.c);
            az2.a(l2);
            az2.a(new k(b.a(collection.toArray())));
        } else {
            Collection collection = r2.f();
            az2.a(br.e, collection.size());
            if (collection.isEmpty()) {
                throw new o("commands.scoreboard.teams.list.empty", new Object[0]);
            }
            l l3 = new l("commands.scoreboard.teams.list.count", collection.size());
            l3.a().a(net.minecraft.u.d.o.c);
            az2.a(l3);
            for (d d3 : collection) {
                az2.a(new l("commands.scoreboard.teams.list.entry", d3.a(), d3.b(), d3.c().size()));
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void f(az var1_1, String[] var2_2, int var3_3, net.minecraft.c.a var4_4) {
        block7: {
            var5_5 = this.a(var4_4);
            var6_6 = var2_2[var3_3++];
            var7_7 = aad.a();
            var8_8 = aad.a();
            if (!(var1_1 instanceof net.minecraft.w.a.b) || var3_3 != var2_2.length) ** GOTO lbl35
            var9_9 = b.b(var1_1).X();
            if (var5_5.a(var9_9, var6_6)) {
                var7_7.add(var9_9);
            } else {
                var8_8.add(var9_9);
            }
            break block7;
lbl-1000:
            // 1 sources

            {
                block8: {
                    if (!(var9_10 = var2_2[var3_3++]).startsWith("@")) break block8;
                    var11_12 = b.c(var4_4, var1_1, var9_10).iterator();
                    ** GOTO lbl34
                }
                var10_11 = b.e(var4_4, var1_1, var9_10);
                if (var5_5.a((String)var10_11, var6_6)) {
                    var7_7.add(var10_11);
                    continue;
                }
                var8_8.add(var10_11);
                continue;
lbl-1000:
                // 1 sources

                {
                    var10_11 = (net.minecraft.w.n)var11_12.next();
                    var12_13 = b.e(var4_4, var1_1, var10_11.cN());
                    if (var5_5.a(var12_13, var6_6)) {
                        var7_7.add(var12_13);
                        continue;
                    }
                    var8_8.add(var12_13);
lbl34:
                    // 3 sources

                    ** while (var11_12.hasNext())
                }
lbl35:
                // 4 sources

                ** while (var3_3 < var2_2.length)
            }
        }
        if (!var7_7.isEmpty()) {
            var1_1.a(br.c, var7_7.size());
            b.a(var1_1, (t)this, "commands.scoreboard.teams.join.success", new Object[]{var7_7.size(), var6_6, b.a(var7_7.toArray(new String[var7_7.size()]))});
        }
        if (var8_8.isEmpty() != false) return;
        throw new o("commands.scoreboard.teams.join.failure", new Object[]{var8_8.size(), var6_6, b.a(var8_8.toArray(new String[var8_8.size()]))});
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void g(az var1_1, String[] var2_2, int var3_3, net.minecraft.c.a var4_4) {
        block7: {
            var5_5 = this.a(var4_4);
            var6_6 = aad.a();
            var7_7 = aad.a();
            if (!(var1_1 instanceof net.minecraft.w.a.b) || var3_3 != var2_2.length) ** GOTO lbl34
            var8_8 = b.b(var1_1).X();
            if (var5_5.f(var8_8)) {
                var6_6.add(var8_8);
            } else {
                var7_7.add(var8_8);
            }
            break block7;
lbl-1000:
            // 1 sources

            {
                block8: {
                    if (!(var8_9 = var2_2[var3_3++]).startsWith("@")) break block8;
                    var10_11 = b.c(var4_4, var1_1, var8_9).iterator();
                    ** GOTO lbl33
                }
                var9_10 = b.e(var4_4, var1_1, var8_9);
                if (var5_5.f((String)var9_10)) {
                    var6_6.add(var9_10);
                    continue;
                }
                var7_7.add(var9_10);
                continue;
lbl-1000:
                // 1 sources

                {
                    var9_10 = (net.minecraft.w.n)var10_11.next();
                    var11_12 = b.e(var4_4, var1_1, var9_10.cN());
                    if (var5_5.f(var11_12)) {
                        var6_6.add(var11_12);
                        continue;
                    }
                    var7_7.add(var11_12);
lbl33:
                    // 3 sources

                    ** while (var10_11.hasNext())
                }
lbl34:
                // 4 sources

                ** while (var3_3 < var2_2.length)
            }
        }
        if (!var6_6.isEmpty()) {
            var1_1.a(br.c, var6_6.size());
            b.a(var1_1, (t)this, "commands.scoreboard.teams.leave.success", new Object[]{var6_6.size(), b.a(var6_6.toArray(new String[var6_6.size()]))});
        }
        if (var7_7.isEmpty() != false) return;
        throw new o("commands.scoreboard.teams.leave.failure", new Object[]{var7_7.size(), b.a(var7_7.toArray(new String[var7_7.size()]))});
    }

    protected void h(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        d d2 = this.a(arrstring[n2], a2);
        if (d2 != null) {
            ArrayList arrayList = ov.a(d2.c());
            az2.a(br.c, arrayList.size());
            if (arrayList.isEmpty()) {
                throw new o("commands.scoreboard.teams.empty.alreadyEmpty", d2.a());
            }
            for (String string : arrayList) {
                r2.a(string, d2);
            }
            b.a(az2, (t)this, "commands.scoreboard.teams.empty.success", arrayList.size(), d2.a());
        }
    }

    protected void a(az az2, String string, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        j j2 = this.a(string, false, a2);
        r2.j(j2);
        b.a(az2, (t)this, "commands.scoreboard.objectives.remove.success", string);
    }

    protected void a(az az2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        Collection collection = r2.b();
        if (collection.isEmpty()) {
            throw new o("commands.scoreboard.objectives.list.empty", new Object[0]);
        }
        l l2 = new l("commands.scoreboard.objectives.list.count", collection.size());
        l2.a().a(net.minecraft.u.d.o.c);
        az2.a(l2);
        for (j j2 : collection) {
            az2.a(new l("commands.scoreboard.objectives.list.entry", j2.b(), j2.d(), j2.c().c()));
        }
    }

    protected void i(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        String string = arrstring[n2++];
        int n3 = r.h(string);
        j j2 = null;
        if (arrstring.length == 4) {
            j2 = this.a(arrstring[n2], false, a2);
        }
        if (n3 < 0) {
            throw new o("commands.scoreboard.objectives.setdisplay.invalidSlot", string);
        }
        r2.a(n3, j2);
        if (j2 != null) {
            b.a(az2, (t)this, "commands.scoreboard.objectives.setdisplay.successSet", r.b(n3), j2.b());
        } else {
            b.a(az2, (t)this, "commands.scoreboard.objectives.setdisplay.successCleared", r.b(n3));
        }
    }

    protected void j(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        if (arrstring.length > n2) {
            String string = b.e(a2, az2, arrstring[n2]);
            Map map = r2.c(string);
            az2.a(br.e, map.size());
            if (map.isEmpty()) {
                throw new o("commands.scoreboard.players.list.player.empty", string);
            }
            l l2 = new l("commands.scoreboard.players.list.player.count", map.size(), string);
            l2.a().a(net.minecraft.u.d.o.c);
            az2.a(l2);
            for (p p2 : map.values()) {
                az2.a(new l("commands.scoreboard.players.list.player.entry", p2.b(), p2.c().d(), p2.c().b()));
            }
        } else {
            Collection collection = r2.c();
            az2.a(br.e, collection.size());
            if (collection.isEmpty()) {
                throw new o("commands.scoreboard.players.list.empty", new Object[0]);
            }
            l l3 = new l("commands.scoreboard.players.list.count", collection.size());
            l3.a().a(net.minecraft.u.d.o.c);
            az2.a(l3);
            az2.a(new k(b.a(collection.toArray())));
        }
    }

    protected void k(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        Object object;
        Object object2;
        int n3;
        String string;
        String string2 = arrstring[n2 - 1];
        int n4 = n2;
        if ((string = b.e(a2, az2, arrstring[n2++])).length() > 40) {
            throw new as("commands.scoreboard.players.name.tooLong", string, 40);
        }
        j j2 = this.a(arrstring[n2++], true, a2);
        int n5 = n3 = "set".equalsIgnoreCase(string2) ? b.a(arrstring[n2++]) : b.a(arrstring[n2++], 0);
        if (arrstring.length > n2) {
            object2 = b.b(a2, az2, arrstring[n4]);
            try {
                object = net.minecraft.e.n.a(b.b(arrstring, n2));
                e e2 = b.a((net.minecraft.w.n)object2);
                if (!u.a((a)object, e2, true)) {
                    throw new o("commands.scoreboard.players.set.tagMismatch", string);
                }
            }
            catch (i i2) {
                throw new o("commands.scoreboard.players.set.tagError", i2.getMessage());
            }
        }
        object2 = this.a(a2);
        object = ((r)object2).c(string, j2);
        if ("set".equalsIgnoreCase(string2)) {
            ((p)object).c(n3);
        } else if ("add".equalsIgnoreCase(string2)) {
            ((p)object).a(n3);
        } else {
            ((p)object).b(n3);
        }
        b.a(az2, (t)this, "commands.scoreboard.players.set.success", j2.b(), string, ((p)object).b());
    }

    protected void l(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        String string = b.e(a2, az2, arrstring[n2++]);
        if (arrstring.length > n2) {
            j j2 = this.a(arrstring[n2++], false, a2);
            r2.d(string, j2);
            b.a(az2, (t)this, "commands.scoreboard.players.resetscore.success", j2.b(), string);
        } else {
            r2.d(string, null);
            b.a(az2, (t)this, "commands.scoreboard.players.reset.success", string);
        }
    }

    protected void m(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        String string;
        r r2 = this.a(a2);
        if ((string = b.d(a2, az2, arrstring[n2++])).length() > 40) {
            throw new as("commands.scoreboard.players.name.tooLong", string, 40);
        }
        j j2 = this.a(arrstring[n2], false, a2);
        if (j2.c() != f.c) {
            throw new o("commands.scoreboard.players.enable.noTrigger", j2.b());
        }
        p p2 = r2.c(string, j2);
        p2.a(false);
        b.a(az2, (t)this, "commands.scoreboard.players.enable.success", j2.b(), string);
    }

    protected void n(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        j j2;
        String string;
        r r2 = this.a(a2);
        if ((string = b.e(a2, az2, arrstring[n2++])).length() > 40) {
            throw new as("commands.scoreboard.players.name.tooLong", string, 40);
        }
        if (!r2.b(string, j2 = this.a(arrstring[n2++], false, a2))) {
            throw new o("commands.scoreboard.players.test.notFound", j2.b(), string);
        }
        int n3 = arrstring[n2].equals("*") ? Integer.MIN_VALUE : b.a(arrstring[n2]);
        int n4 = ++n2 < arrstring.length && !arrstring[n2].equals("*") ? b.a(arrstring[n2], n3) : Integer.MAX_VALUE;
        p p2 = r2.c(string, j2);
        if (p2.b() < n3 || p2.b() > n4) {
            throw new o("commands.scoreboard.players.test.failed", p2.b(), n3, n4);
        }
        b.a(az2, (t)this, "commands.scoreboard.players.test.success", p2.b(), n3, n4);
    }

    protected void o(az az2, String[] arrstring, int n2, net.minecraft.c.a a2) {
        r r2 = this.a(a2);
        String string = b.e(a2, az2, arrstring[n2++]);
        j j2 = this.a(arrstring[n2++], true, a2);
        String string2 = arrstring[n2++];
        String string3 = b.e(a2, az2, arrstring[n2++]);
        j j3 = this.a(arrstring[n2], false, a2);
        if (string.length() > 40) {
            throw new as("commands.scoreboard.players.name.tooLong", string, 40);
        }
        if (string3.length() > 40) {
            throw new as("commands.scoreboard.players.name.tooLong", string3, 40);
        }
        p p2 = r2.c(string, j2);
        if (!r2.b(string3, j3)) {
            throw new o("commands.scoreboard.players.operation.notFound", j3.b(), string3);
        }
        p p3 = r2.c(string3, j3);
        if ("+=".equals(string2)) {
            p2.c(p2.b() + p3.b());
        } else if ("-=".equals(string2)) {
            p2.c(p2.b() - p3.b());
        } else if ("*=".equals(string2)) {
            p2.c(p2.b() * p3.b());
        } else if ("/=".equals(string2)) {
            if (p3.b() != 0) {
                p2.c(p2.b() / p3.b());
            }
        } else if ("%=".equals(string2)) {
            if (p3.b() != 0) {
                p2.c(p2.b() % p3.b());
            }
        } else if ("=".equals(string2)) {
            p2.c(p3.b());
        } else if ("<".equals(string2)) {
            p2.c(Math.min(p2.b(), p3.b()));
        } else if (">".equals(string2)) {
            p2.c(Math.max(p2.b(), p3.b()));
        } else {
            if (!"><".equals(string2)) {
                throw new o("commands.scoreboard.players.operation.invalidOperation", string2);
            }
            int n3 = p2.b();
            p2.c(p3.b());
            p3.c(n3);
        }
        b.a(az2, (t)this, "commands.scoreboard.players.operation.success", new Object[0]);
    }

    protected void a(net.minecraft.c.a a2, az az2, String[] arrstring, int n2) {
        String string = b.e(a2, az2, arrstring[n2]);
        net.minecraft.w.n n3 = b.b(a2, az2, arrstring[n2++]);
        String string2 = arrstring[n2++];
        Set set = n3.cb();
        if ("list".equals(string2)) {
            if (!set.isEmpty()) {
                l l2 = new l("commands.scoreboard.players.tag.list", string);
                l2.a().a(net.minecraft.u.d.o.c);
                az2.a(l2);
                az2.a(new k(b.a(set.toArray())));
            }
            az2.a(br.e, set.size());
        } else {
            if (arrstring.length < 5) {
                throw new ac("commands.scoreboard.players.tag.usage", new Object[0]);
            }
            String string3 = arrstring[n2++];
            if (arrstring.length > n2) {
                try {
                    e e2 = net.minecraft.e.n.a(b.b(arrstring, n2));
                    e e3 = b.a(n3);
                    if (!u.a(e2, e3, true)) {
                        throw new o("commands.scoreboard.players.tag.tagMismatch", string);
                    }
                }
                catch (i i2) {
                    throw new o("commands.scoreboard.players.tag.tagError", i2.getMessage());
                }
            }
            if ("add".equals(string2)) {
                if (!n3.e(string3)) {
                    throw new o("commands.scoreboard.players.tag.tooMany", 1024);
                }
                b.a(az2, (t)this, "commands.scoreboard.players.tag.success.add", string3);
            } else {
                if (!"remove".equals(string2)) {
                    throw new ac("commands.scoreboard.players.tag.usage", new Object[0]);
                }
                if (!n3.f(string3)) {
                    throw new o("commands.scoreboard.players.tag.notFound", string3);
                }
                b.a(az2, (t)this, "commands.scoreboard.players.tag.success.remove", string3);
            }
        }
    }

    @Override
    public List a(net.minecraft.c.a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        if (arrstring.length == 1) {
            return b.a(arrstring, "objectives", "players", "teams");
        }
        if ("objectives".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 2) {
                return b.a(arrstring, "list", "add", "remove", "setdisplay");
            }
            if ("add".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 4) {
                    Set set = f.a.keySet();
                    return b.a(arrstring, set);
                }
            } else if ("remove".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return b.a(arrstring, this.a(false, a2));
                }
            } else if ("setdisplay".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return b.a(arrstring, r.g());
                }
                if (arrstring.length == 4) {
                    return b.a(arrstring, this.a(false, a2));
                }
            }
        } else if ("players".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 2) {
                return b.a(arrstring, "set", "add", "remove", "reset", "list", "enable", "test", "operation", "tag");
            }
            if (!("set".equalsIgnoreCase(arrstring[1]) || "add".equalsIgnoreCase(arrstring[1]) || "remove".equalsIgnoreCase(arrstring[1]) || "reset".equalsIgnoreCase(arrstring[1]))) {
                if ("enable".equalsIgnoreCase(arrstring[1])) {
                    if (arrstring.length == 3) {
                        return b.a(arrstring, a2.T());
                    }
                    if (arrstring.length == 4) {
                        return b.a(arrstring, this.b(a2));
                    }
                } else if (!"list".equalsIgnoreCase(arrstring[1]) && !"test".equalsIgnoreCase(arrstring[1])) {
                    if ("operation".equalsIgnoreCase(arrstring[1])) {
                        if (arrstring.length == 3) {
                            return b.a(arrstring, this.a(a2).c());
                        }
                        if (arrstring.length == 4) {
                            return b.a(arrstring, this.a(true, a2));
                        }
                        if (arrstring.length == 5) {
                            return b.a(arrstring, "+=", "-=", "*=", "/=", "%=", "=", "<", ">", "><");
                        }
                        if (arrstring.length == 6) {
                            return b.a(arrstring, a2.T());
                        }
                        if (arrstring.length == 7) {
                            return b.a(arrstring, this.a(false, a2));
                        }
                    } else if ("tag".equalsIgnoreCase(arrstring[1])) {
                        if (arrstring.length == 3) {
                            return b.a(arrstring, this.a(a2).c());
                        }
                        if (arrstring.length == 4) {
                            return b.a(arrstring, "add", "remove", "list");
                        }
                    }
                } else {
                    if (arrstring.length == 3) {
                        return b.a(arrstring, this.a(a2).c());
                    }
                    if (arrstring.length == 4 && "test".equalsIgnoreCase(arrstring[1])) {
                        return b.a(arrstring, this.a(false, a2));
                    }
                }
            } else {
                if (arrstring.length == 3) {
                    return b.a(arrstring, a2.T());
                }
                if (arrstring.length == 4) {
                    return b.a(arrstring, this.a(true, a2));
                }
            }
        } else if ("teams".equalsIgnoreCase(arrstring[0])) {
            if (arrstring.length == 2) {
                return b.a(arrstring, "add", "remove", "join", "leave", "empty", "list", "option");
            }
            if ("join".equalsIgnoreCase(arrstring[1])) {
                if (arrstring.length == 3) {
                    return b.a(arrstring, this.a(a2).e());
                }
                if (arrstring.length >= 4) {
                    return b.a(arrstring, a2.T());
                }
            } else {
                if ("leave".equalsIgnoreCase(arrstring[1])) {
                    return b.a(arrstring, a2.T());
                }
                if (!("empty".equalsIgnoreCase(arrstring[1]) || "list".equalsIgnoreCase(arrstring[1]) || "remove".equalsIgnoreCase(arrstring[1]))) {
                    if ("option".equalsIgnoreCase(arrstring[1])) {
                        if (arrstring.length == 3) {
                            return b.a(arrstring, this.a(a2).e());
                        }
                        if (arrstring.length == 4) {
                            return b.a(arrstring, "color", "friendlyfire", "seeFriendlyInvisibles", "nametagVisibility", "deathMessageVisibility", "collisionRule");
                        }
                        if (arrstring.length == 5) {
                            if ("color".equalsIgnoreCase(arrstring[3])) {
                                return b.a(arrstring, net.minecraft.u.d.o.a(true, false));
                            }
                            if ("nametagVisibility".equalsIgnoreCase(arrstring[3]) || "deathMessageVisibility".equalsIgnoreCase(arrstring[3])) {
                                return b.a(arrstring, n.a());
                            }
                            if ("collisionRule".equalsIgnoreCase(arrstring[3])) {
                                return b.a(arrstring, net.minecraft.j.b.a());
                            }
                            if ("friendlyfire".equalsIgnoreCase(arrstring[3]) || "seeFriendlyInvisibles".equalsIgnoreCase(arrstring[3])) {
                                return b.a(arrstring, "true", "false");
                            }
                        }
                    }
                } else if (arrstring.length == 3) {
                    return b.a(arrstring, this.a(a2).e());
                }
            }
        }
        return Collections.emptyList();
    }

    protected List a(boolean bl2, net.minecraft.c.a a2) {
        Collection collection = this.a(a2).b();
        ArrayList arrayList = ov.a();
        for (j j2 : collection) {
            if (bl2 && j2.c().a()) continue;
            arrayList.add(j2.b());
        }
        return arrayList;
    }

    protected List b(net.minecraft.c.a a2) {
        Collection collection = this.a(a2).b();
        ArrayList arrayList = ov.a();
        for (j j2 : collection) {
            if (j2.c() != f.c) continue;
            arrayList.add(j2.b());
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return !"players".equalsIgnoreCase(arrstring[0]) ? ("teams".equalsIgnoreCase(arrstring[0]) ? n2 == 2 : false) : (arrstring.length > 1 && "operation".equalsIgnoreCase(arrstring[1]) ? n2 == 2 || n2 == 5 : n2 == 2);
    }
}

