/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class bzt {
    private final Map a = sz.c();
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final bhi[] d = new bhi[19];
    private final Map e = sz.c();
    private final Map f = sz.c();
    private static String[] g;

    public bhi b(String string) {
        return (bhi)this.a.get(string);
    }

    public bhi a(String string, bcu bcu2) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
        }
        bhi bhi2 = this.b(string);
        if (bhi2 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        bhi2 = new bhi(this, string, bcu2);
        List list = (List)this.b.get(bcu2);
        if (list == null) {
            list = ov.a();
            this.b.put(bcu2, list);
        }
        list.add(bhi2);
        this.a.put(string, bhi2);
        this.a(bhi2);
        return bhi2;
    }

    public Collection a(bcu bcu2) {
        Collection collection = (Collection)this.b.get(bcu2);
        return collection == null ? ov.a() : ov.a(collection);
    }

    public boolean b(String string, bhi bhi2) {
        Map map = (Map)this.c.get(string);
        if (map == null) {
            return false;
        }
        czu czu2 = (czu)map.get(bhi2);
        return czu2 != null;
    }

    public czu c(String string, bhi bhi2) {
        czu czu2;
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        Map map = (Map)this.c.get(string);
        if (map == null) {
            map = sz.c();
            this.c.put(string, map);
        }
        if ((czu2 = (czu)map.get(bhi2)) == null) {
            czu2 = new czu(this, bhi2, string);
            map.put(bhi2, czu2);
        }
        return czu2;
    }

    public Collection i(bhi bhi2) {
        ArrayList arrayList = ov.a();
        for (Map map : this.c.values()) {
            czu czu2 = (czu)map.get(bhi2);
            if (czu2 == null) continue;
            arrayList.add(czu2);
        }
        Collections.sort(arrayList, czu.a);
        return arrayList;
    }

    public Collection b() {
        return this.a.values();
    }

    public Collection c() {
        return this.c.keySet();
    }

    public void d(String string, bhi bhi2) {
        if (bhi2 == null) {
            Map map = (Map)this.c.remove(string);
            if (map != null) {
                this.a(string);
            }
        } else {
            Map map = (Map)this.c.get(string);
            if (map != null) {
                czu czu2 = (czu)map.remove(bhi2);
                if (map.size() < 1) {
                    Map map2 = (Map)this.c.remove(string);
                    if (map2 != null) {
                        this.a(string);
                    }
                } else if (czu2 != null) {
                    this.a(string, bhi2);
                }
            }
        }
    }

    public Collection d() {
        Collection collection = this.c.values();
        ArrayList arrayList = ov.a();
        for (Map map : collection) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public Map c(String string) {
        Map map = (Map)this.c.get(string);
        if (map == null) {
            map = sz.c();
        }
        return map;
    }

    public void j(bhi bhi2) {
        this.a.remove(bhi2.b());
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != bhi2) continue;
            this.a(i2, null);
        }
        List list = (List)this.b.get(bhi2.c());
        if (list != null) {
            list.remove(bhi2);
        }
        for (Map map : this.c.values()) {
            map.remove(bhi2);
        }
        this.c(bhi2);
    }

    public void a(int n2, bhi bhi2) {
        this.d[n2] = bhi2;
    }

    public bhi a(int n2) {
        return this.d[n2];
    }

    public ef d(String string) {
        return (ef)this.e.get(string);
    }

    public ef e(String string) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        ef ef2 = this.d(string);
        if (ef2 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        ef2 = new ef(this, string);
        this.e.put(string, ef2);
        this.a(ef2);
        return ef2;
    }

    public void d(ef ef2) {
        this.e.remove(ef2.a());
        for (String string : ef2.c()) {
            this.f.remove(string);
        }
        this.c(ef2);
    }

    public boolean a(String string, String string2) {
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        if (!this.e.containsKey(string2)) {
            return false;
        }
        ef ef2 = this.d(string2);
        if (this.g(string) != null) {
            this.f(string);
        }
        this.f.put(string, ef2);
        ef2.c().add(string);
        return true;
    }

    public boolean f(String string) {
        ef ef2 = this.g(string);
        if (ef2 != null) {
            this.a(string, ef2);
            return true;
        }
        return false;
    }

    public void a(String string, ef ef2) {
        if (this.g(string) != ef2) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + ef2.a() + "'.");
        }
        this.f.remove(string);
        ef2.c().remove(string);
    }

    public Collection e() {
        return this.e.keySet();
    }

    public Collection f() {
        return this.e.values();
    }

    public ef g(String string) {
        return (ef)this.f.get(string);
    }

    public void a(bhi bhi2) {
    }

    public void b(bhi bhi2) {
    }

    public void c(bhi bhi2) {
    }

    public void a(czu czu2) {
    }

    public void a(String string) {
    }

    public void a(String string, bhi bhi2) {
    }

    public void a(ef ef2) {
    }

    public void b(ef ef2) {
    }

    public void c(ef ef2) {
    }

    public static String b(int n2) {
        aug aug2;
        switch (n2) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        if (n2 >= 3 && n2 <= 18 && (aug2 = aug.a(n2 - 3)) != null && aug2 != aug.v) {
            return "sidebar.team." + aug2.d();
        }
        return null;
    }

    public static int h(String string) {
        String string2;
        aug aug2;
        if ("list".equalsIgnoreCase(string)) {
            return 0;
        }
        if ("sidebar".equalsIgnoreCase(string)) {
            return 1;
        }
        if ("belowName".equalsIgnoreCase(string)) {
            return 2;
        }
        if (string.startsWith("sidebar.team.") && (aug2 = aug.b(string2 = string.substring("sidebar.team.".length()))) != null && aug2.a() >= 0) {
            return aug2.a() + 3;
        }
        return -1;
    }

    public static String[] g() {
        if (g == null) {
            g = new String[19];
            for (int i2 = 0; i2 < 19; ++i2) {
                bzt.g[i2] = bzt.b(i2);
            }
        }
        return g;
    }

    public void a(cpk cpk2) {
        if (cpk2 == null || cpk2 instanceof bdl || cpk2.bj()) {
            return;
        }
        String string = cpk2.cy();
        this.d(string, null);
        this.f(string);
    }
}

