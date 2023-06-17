/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.j.d;
import net.minecraft.j.f;
import net.minecraft.j.j;
import net.minecraft.j.p;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.w.n;

public class r {
    private final Map a = sz.c();
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final j[] d = new j[19];
    private final Map e = sz.c();
    private final Map f = sz.c();
    private static String[] g;

    public j b(String string) {
        return (j)this.a.get(string);
    }

    public j a(String string, f f2) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
        }
        j j2 = this.b(string);
        if (j2 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        j2 = new j(this, string, f2);
        List list = (List)this.b.get(f2);
        if (list == null) {
            list = ov.a();
            this.b.put(f2, list);
        }
        list.add(j2);
        this.a.put(string, j2);
        this.a(j2);
        return j2;
    }

    public Collection a(f f2) {
        Collection collection = (Collection)this.b.get(f2);
        return collection == null ? ov.a() : ov.a(collection);
    }

    public boolean b(String string, j j2) {
        Map map = (Map)this.c.get(string);
        if (map == null) {
            return false;
        }
        p p2 = (p)map.get(j2);
        return p2 != null;
    }

    public p c(String string, j j2) {
        p p2;
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        Map map = (Map)this.c.get(string);
        if (map == null) {
            map = sz.c();
            this.c.put(string, map);
        }
        if ((p2 = (p)map.get(j2)) == null) {
            p2 = new p(this, j2, string);
            map.put(j2, p2);
        }
        return p2;
    }

    public Collection i(j j2) {
        ArrayList arrayList = ov.a();
        for (Map map : this.c.values()) {
            p p2 = (p)map.get(j2);
            if (p2 == null) continue;
            arrayList.add(p2);
        }
        Collections.sort(arrayList, p.a);
        return arrayList;
    }

    public Collection b() {
        return this.a.values();
    }

    public Collection c() {
        return this.c.keySet();
    }

    public void d(String string, j j2) {
        if (j2 == null) {
            Map map = (Map)this.c.remove(string);
            if (map != null) {
                this.a(string);
            }
        } else {
            Map map = (Map)this.c.get(string);
            if (map != null) {
                p p2 = (p)map.remove(j2);
                if (map.size() < 1) {
                    Map map2 = (Map)this.c.remove(string);
                    if (map2 != null) {
                        this.a(string);
                    }
                } else if (p2 != null) {
                    this.a(string, j2);
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

    public void j(j j2) {
        this.a.remove(j2.b());
        for (int i2 = 0; i2 < 19; ++i2) {
            if (this.a(i2) != j2) continue;
            this.a(i2, null);
        }
        List list = (List)this.b.get(j2.c());
        if (list != null) {
            list.remove(j2);
        }
        for (Map map : this.c.values()) {
            map.remove(j2);
        }
        this.c(j2);
    }

    public void a(int n2, j j2) {
        this.d[n2] = j2;
    }

    public j a(int n2) {
        return this.d[n2];
    }

    public d d(String string) {
        return (d)this.e.get(string);
    }

    public d e(String string) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        d d2 = this.d(string);
        if (d2 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        d2 = new d(this, string);
        this.e.put(string, d2);
        this.a(d2);
        return d2;
    }

    public void d(d d2) {
        this.e.remove(d2.a());
        for (String string : d2.c()) {
            this.f.remove(string);
        }
        this.c(d2);
    }

    public boolean a(String string, String string2) {
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        if (!this.e.containsKey(string2)) {
            return false;
        }
        d d2 = this.d(string2);
        if (this.g(string) != null) {
            this.f(string);
        }
        this.f.put(string, d2);
        d2.c().add(string);
        return true;
    }

    public boolean f(String string) {
        d d2 = this.g(string);
        if (d2 != null) {
            this.a(string, d2);
            return true;
        }
        return false;
    }

    public void a(String string, d d2) {
        if (this.g(string) != d2) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + d2.a() + "'.");
        }
        this.f.remove(string);
        d2.c().remove(string);
    }

    public Collection e() {
        return this.e.keySet();
    }

    public Collection f() {
        return this.e.values();
    }

    public d g(String string) {
        return (d)this.f.get(string);
    }

    public void a(j j2) {
    }

    public void b(j j2) {
    }

    public void c(j j2) {
    }

    public void a(p p2) {
    }

    public void a(String string) {
    }

    public void a(String string, j j2) {
    }

    public void a(d d2) {
    }

    public void b(d d2) {
    }

    public void c(d d2) {
    }

    public static String b(int n2) {
        o o2;
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
        if (n2 >= 3 && n2 <= 18 && (o2 = o.a(n2 - 3)) != null && o2 != o.v) {
            return "sidebar.team." + o2.d();
        }
        return null;
    }

    public static int h(String string) {
        String string2;
        o o2;
        if ("list".equalsIgnoreCase(string)) {
            return 0;
        }
        if ("sidebar".equalsIgnoreCase(string)) {
            return 1;
        }
        if ("belowName".equalsIgnoreCase(string)) {
            return 2;
        }
        if (string.startsWith("sidebar.team.") && (o2 = o.b(string2 = string.substring("sidebar.team.".length()))) != null && o2.a() >= 0) {
            return o2.a() + 3;
        }
        return -1;
    }

    public static String[] g() {
        if (g == null) {
            g = new String[19];
            for (int i2 = 0; i2 < 19; ++i2) {
                r.g[i2] = r.b(i2);
            }
        }
        return g;
    }

    public void a(n n2) {
        if (n2 != null && !(n2 instanceof b) && !n2.br()) {
            String string = n2.cN();
            this.d(string, null);
            this.f(string);
        }
    }
}

