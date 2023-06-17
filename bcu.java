/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public interface bcu {
    public static final Map a = sz.c();
    public static final bcu b = new cmm("dummy");
    public static final bcu c = new cmm("trigger");
    public static final bcu d = new cmm("deathCount");
    public static final bcu e = new cmm("playerKillCount");
    public static final bcu f = new cmm("totalKillCount");
    public static final bcu g = new ceu("health");
    public static final bcu h = new cuw("food");
    public static final bcu i = new cuw("air");
    public static final bcu j = new cuw("armor");
    public static final bcu k = new cuw("xp");
    public static final bcu l = new cuw("level");
    public static final bcu[] m = new bcu[]{new ccc("teamkill.", aug.a), new ccc("teamkill.", aug.b), new ccc("teamkill.", aug.c), new ccc("teamkill.", aug.d), new ccc("teamkill.", aug.e), new ccc("teamkill.", aug.f), new ccc("teamkill.", aug.g), new ccc("teamkill.", aug.h), new ccc("teamkill.", aug.i), new ccc("teamkill.", aug.j), new ccc("teamkill.", aug.k), new ccc("teamkill.", aug.l), new ccc("teamkill.", aug.m), new ccc("teamkill.", aug.n), new ccc("teamkill.", aug.o), new ccc("teamkill.", aug.p)};
    public static final bcu[] n = new bcu[]{new ccc("killedByTeam.", aug.a), new ccc("killedByTeam.", aug.b), new ccc("killedByTeam.", aug.c), new ccc("killedByTeam.", aug.d), new ccc("killedByTeam.", aug.e), new ccc("killedByTeam.", aug.f), new ccc("killedByTeam.", aug.g), new ccc("killedByTeam.", aug.h), new ccc("killedByTeam.", aug.i), new ccc("killedByTeam.", aug.j), new ccc("killedByTeam.", aug.k), new ccc("killedByTeam.", aug.l), new ccc("killedByTeam.", aug.m), new ccc("killedByTeam.", aug.n), new ccc("killedByTeam.", aug.o), new ccc("killedByTeam.", aug.p)};

    public String a();

    public boolean b();

    public bmb c();
}

