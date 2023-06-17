/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.j.a;
import net.minecraft.j.g;
import net.minecraft.j.l;
import net.minecraft.j.m;
import net.minecraft.j.q;
import net.minecraft.u.d.o;

public interface f {
    public static final Map a = sz.c();
    public static final f b = new m("dummy");
    public static final f c = new m("trigger");
    public static final f d = new m("deathCount");
    public static final f e = new m("playerKillCount");
    public static final f f = new m("totalKillCount");
    public static final f g = new a("health");
    public static final f h = new g("food");
    public static final f i = new g("air");
    public static final f j = new g("armor");
    public static final f k = new g("xp");
    public static final f l = new g("level");
    public static final f[] m = new f[]{new q("teamkill.", o.a), new q("teamkill.", o.b), new q("teamkill.", o.c), new q("teamkill.", o.d), new q("teamkill.", o.e), new q("teamkill.", o.f), new q("teamkill.", o.g), new q("teamkill.", o.h), new q("teamkill.", o.i), new q("teamkill.", o.j), new q("teamkill.", o.k), new q("teamkill.", o.l), new q("teamkill.", o.m), new q("teamkill.", o.n), new q("teamkill.", o.o), new q("teamkill.", o.p)};
    public static final f[] n = new f[]{new q("killedByTeam.", o.a), new q("killedByTeam.", o.b), new q("killedByTeam.", o.c), new q("killedByTeam.", o.d), new q("killedByTeam.", o.e), new q("killedByTeam.", o.f), new q("killedByTeam.", o.g), new q("killedByTeam.", o.h), new q("killedByTeam.", o.i), new q("killedByTeam.", o.j), new q("killedByTeam.", o.k), new q("killedByTeam.", o.l), new q("killedByTeam.", o.m), new q("killedByTeam.", o.n), new q("killedByTeam.", o.o), new q("killedByTeam.", o.p)};

    public String c();

    public boolean a();

    public l b();
}

