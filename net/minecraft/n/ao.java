/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.n.aa;
import net.minecraft.n.aq;
import net.minecraft.n.ax;
import net.minecraft.n.az;
import net.minecraft.n.bb;
import net.minecraft.n.bd;
import net.minecraft.n.bf;
import net.minecraft.n.bh;
import net.minecraft.n.c;
import net.minecraft.n.d;
import net.minecraft.n.e;
import net.minecraft.n.h;
import net.minecraft.n.r;
import net.minecraft.n.s;
import net.minecraft.n.u;
import net.minecraft.q.am;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.u.b.b;
import net.minecraft.u.d.l;
import net.minecraft.u.d.o;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

public class ao {
    private static final Pattern a = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
    private static final Pattern b = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
    private static final Pattern c = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
    private static final Set d = aad.a("x", "y", "z", "dx", "dy", "dz", "rm", "r");

    public static g a(az az2, String string) {
        return (g)ao.a(az2, string, g.class);
    }

    public static n a(az az2, String string, Class class_) {
        List list = ao.b(az2, string, class_);
        return list.size() == 1 ? (n)list.get(0) : null;
    }

    public static net.minecraft.u.d.a b(az az2, String string) {
        List list = ao.b(az2, string, n.class);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = ov.a();
        for (n n2 : list) {
            arrayList.add(n2.aK());
        }
        return aa.a(arrayList);
    }

    public static List b(az az2, String string, Class class_) {
        Matcher matcher = a.matcher(string);
        if (matcher.matches() && az2.a(1, "@")) {
            Map map = ao.c(matcher.group(2));
            if (!ao.b(az2, map)) {
                return Collections.emptyList();
            }
            String string2 = matcher.group(1);
            b b2 = ao.a(map, az2.aC());
            net.minecraft.u.b.s s2 = ao.b(map, az2.aD());
            List list = ao.a(az2, map);
            ArrayList arrayList = ov.a();
            for (k k2 : list) {
                if (k2 == null) continue;
                ArrayList arrayList2 = ov.a();
                arrayList2.addAll(ao.a(map, string2));
                arrayList2.addAll(ao.b(map));
                arrayList2.addAll(ao.c(map));
                arrayList2.addAll(ao.d(map));
                arrayList2.addAll(ao.c(az2, map));
                arrayList2.addAll(ao.e(map));
                arrayList2.addAll(ao.f(map));
                arrayList2.addAll(ao.a(map, s2));
                arrayList2.addAll(ao.g(map));
                arrayList.addAll(ao.a(map, class_, arrayList2, string2, k2, b2));
            }
            return ao.a(arrayList, map, az2, class_, string2, s2);
        }
        return Collections.emptyList();
    }

    private static List a(az az2, Map map) {
        ArrayList arrayList = ov.a();
        if (ao.h(map)) {
            arrayList.add(az2.aE());
        } else {
            Collections.addAll(arrayList, az2.aS().d);
        }
        return arrayList;
    }

    private static boolean b(az az2, Map map) {
        String string = ao.b(map, "type");
        String string2 = string = string != null && string.startsWith("!") ? string.substring(1) : string;
        if (string != null && !net.minecraft.w.h.b(string)) {
            l l2 = new l("commands.generic.entity.invalidType", string);
            l2.a().a(o.m);
            az2.a(l2);
            return false;
        }
        return true;
    }

    private static List a(Map map, String string) {
        boolean bl2;
        boolean bl3;
        ArrayList arrayList = ov.a();
        String string2 = ao.b(map, "type");
        boolean bl4 = bl3 = string2 != null && string2.startsWith("!");
        if (bl3) {
            string2 = string2.substring(1);
        }
        boolean bl5 = !string.equals("e");
        boolean bl6 = bl2 = string.equals("r") && string2 != null;
        if (!(string2 != null && string.equals("e") || bl2)) {
            if (bl5) {
                arrayList.add(new ax());
            }
        } else {
            String string3 = string2;
            arrayList.add(new e(string3, bl3));
        }
        return arrayList;
    }

    private static List b(Map map) {
        ArrayList arrayList = ov.a();
        int n2 = ao.a(map, "lm", -1);
        int n3 = ao.a(map, "l", -1);
        if (n2 > -1 || n3 > -1) {
            arrayList.add(new bd(n2, n3));
        }
        return arrayList;
    }

    private static List c(Map map) {
        am am2;
        ArrayList arrayList = ov.a();
        String string = ao.b(map, "m");
        if (string == null) {
            return arrayList;
        }
        boolean bl2 = string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        try {
            int n2 = Integer.parseInt(string);
            am2 = am.a(n2, am.a);
        }
        catch (Throwable throwable) {
            am2 = am.a(string, am.a);
        }
        am am3 = am2;
        arrayList.add(new c(bl2, am3));
        return arrayList;
    }

    private static List d(Map map) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string = ao.b(map, "team");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new h(string2, bl2));
        }
        return arrayList;
    }

    private static List c(az az2, Map map) {
        Map map2 = ao.a(map);
        return map2.isEmpty() ? Collections.emptyList() : ov.a(new bb(az2, map2));
    }

    private static List e(Map map) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string = ao.b(map, "name");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new aq(string2, bl2));
        }
        return arrayList;
    }

    private static List f(Map map) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string = ao.b(map, "tag");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new u(string2, bl2));
        }
        return arrayList;
    }

    private static List a(Map map, net.minecraft.u.b.s s2) {
        boolean bl2;
        double d2 = ao.a(map, "rm", -1);
        double d3 = ao.a(map, "r", -1);
        boolean bl3 = d2 < -0.5;
        boolean bl4 = bl2 = d3 < -0.5;
        if (bl3 && bl2) {
            return Collections.emptyList();
        }
        double d4 = Math.max(d2, 1.0E-4);
        double d5 = d4 * d4;
        double d6 = Math.max(d3, 1.0E-4);
        double d7 = d6 * d6;
        return ov.a(new d(s2, bl3, d5, bl2, d7));
    }

    private static List g(Map map) {
        int n2;
        int n3;
        ArrayList arrayList = ov.a();
        if (map.containsKey("rym") || map.containsKey("ry")) {
            n3 = net.minecraft.u.b.n.b(ao.a(map, "rym", 0));
            n2 = net.minecraft.u.b.n.b(ao.a(map, "ry", 359));
            arrayList.add(new s(n3, n2));
        }
        if (map.containsKey("rxm") || map.containsKey("rx")) {
            n3 = net.minecraft.u.b.n.b(ao.a(map, "rxm", 0));
            n2 = net.minecraft.u.b.n.b(ao.a(map, "rx", 359));
            arrayList.add(new bh(n3, n2));
        }
        return arrayList;
    }

    private static List a(Map map, Class class_, List list, String string, k k2, b b2) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string2 = ao.b(map, "type");
        string2 = string2 != null && string2.startsWith("!") ? string2.substring(1) : string2;
        boolean bl3 = !string.equals("e");
        boolean bl4 = string.equals("r") && string2 != null;
        int n2 = ao.a(map, "dx", 0);
        int n3 = ao.a(map, "dy", 0);
        int n4 = ao.a(map, "dz", 0);
        int n5 = ao.a(map, "r", -1);
        cm cm2 = cn.a((Iterable)list);
        cm cm3 = cn.a(net.minecraft.u.r.a, cm2);
        int n6 = k2.g.size();
        int n7 = k2.c.size();
        boolean bl5 = bl2 = n6 < n7 / 16;
        if (!(map.containsKey("dx") || map.containsKey("dy") || map.containsKey("dz"))) {
            if (n5 >= 0) {
                a a2 = new a(b2.cy_() - n5, b2.k() - n5, b2.l() - n5, b2.cy_() + n5 + 1, b2.k() + n5 + 1, b2.l() + n5 + 1);
                if (bl3 && bl2 && !bl4) {
                    arrayList.addAll(k2.b(class_, cm3));
                } else {
                    arrayList.addAll(k2.a(class_, a2, cm3));
                }
            } else if (string.equals("a")) {
                arrayList.addAll(k2.b(class_, cm2));
            } else if (!(string.equals("p") || string.equals("r") && !bl4)) {
                arrayList.addAll(k2.a(class_, cm3));
            } else {
                arrayList.addAll(k2.b(class_, cm3));
            }
        } else {
            a a3 = ao.a(b2, n2, n3, n4);
            if (bl3 && bl2 && !bl4) {
                bf bf2 = new bf(a3);
                arrayList.addAll(k2.b(class_, cn.a(cm3, (cm)bf2)));
            } else {
                arrayList.addAll(k2.a(class_, a3, cm3));
            }
        }
        return arrayList;
    }

    private static List a(List arrayList, Map map, az az2, Class class_, String string, net.minecraft.u.b.s s2) {
        n n2;
        int n3 = ao.a(map, "c", !string.equals("a") && !string.equals("e") ? 1 : 0);
        if (!(string.equals("p") || string.equals("a") || string.equals("e"))) {
            if (string.equals("r")) {
                Collections.shuffle(arrayList);
            }
        } else {
            Collections.sort(arrayList, new r(s2));
        }
        if ((n2 = az2.aF()) != null && class_.isAssignableFrom(n2.getClass()) && n3 == 1 && arrayList.contains(n2) && !"r".equals(string)) {
            arrayList = ov.a(n2);
        }
        if (n3 != 0) {
            if (n3 < 0) {
                Collections.reverse(arrayList);
            }
            arrayList = arrayList.subList(0, Math.min(Math.abs(n3), arrayList.size()));
        }
        return arrayList;
    }

    private static a a(b b2, int n2, int n3, int n4) {
        boolean bl2 = n2 < 0;
        boolean bl3 = n3 < 0;
        boolean bl4 = n4 < 0;
        int n5 = b2.cy_() + (bl2 ? n2 : 0);
        int n6 = b2.k() + (bl3 ? n3 : 0);
        int n7 = b2.l() + (bl4 ? n4 : 0);
        int n8 = b2.cy_() + (bl2 ? 0 : n2) + 1;
        int n9 = b2.k() + (bl3 ? 0 : n3) + 1;
        int n10 = b2.l() + (bl4 ? 0 : n4) + 1;
        return new a(n5, n6, n7, n8, n9, n10);
    }

    private static b a(Map map, b b2) {
        return new b(ao.a(map, "x", b2.cy_()), ao.a(map, "y", b2.k()), ao.a(map, "z", b2.l()));
    }

    private static net.minecraft.u.b.s b(Map map, net.minecraft.u.b.s s2) {
        return new net.minecraft.u.b.s(ao.a(map, "x", s2.b, true), ao.a(map, "y", s2.c, false), ao.a(map, "z", s2.d, true));
    }

    private static double a(Map map, String string, double d2, boolean bl2) {
        return map.containsKey(string) ? (double)net.minecraft.u.b.n.a((String)map.get(string), net.minecraft.u.b.n.c(d2)) + (bl2 ? 0.5 : 0.0) : d2;
    }

    private static boolean h(Map map) {
        for (String string : d) {
            if (!map.containsKey(string)) continue;
            return true;
        }
        return false;
    }

    private static int a(Map map, String string, int n2) {
        return map.containsKey(string) ? net.minecraft.u.b.n.a((String)map.get(string), n2) : n2;
    }

    private static String b(Map map, String string) {
        return (String)map.get(string);
    }

    public static Map a(Map map) {
        HashMap hashMap = sz.c();
        for (String string : map.keySet()) {
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            hashMap.put(string.substring("score_".length()), net.minecraft.u.b.n.a((String)map.get(string), 1));
        }
        return hashMap;
    }

    public static boolean a(String string) {
        int n2;
        Matcher matcher = a.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        Map map = ao.c(matcher.group(2));
        String string2 = matcher.group(1);
        int n3 = n2 = !"a".equals(string2) && !"e".equals(string2) ? 1 : 0;
        return ao.a(map, "c", n2) != 1;
    }

    public static boolean b(String string) {
        return a.matcher(string).matches();
    }

    private static Map c(String string) {
        HashMap hashMap = sz.c();
        if (string == null) {
            return hashMap;
        }
        int n2 = 0;
        int n3 = -1;
        Matcher matcher = b.matcher(string);
        while (matcher.find()) {
            String string2 = null;
            switch (n2++) {
                case 0: {
                    string2 = "x";
                    break;
                }
                case 1: {
                    string2 = "y";
                    break;
                }
                case 2: {
                    string2 = "z";
                    break;
                }
                case 3: {
                    string2 = "r";
                }
            }
            if (string2 != null && !matcher.group(1).isEmpty()) {
                hashMap.put(string2, matcher.group(1));
            }
            n3 = matcher.end();
        }
        if (n3 < string.length()) {
            matcher = c.matcher(n3 == -1 ? string : string.substring(n3));
            while (matcher.find()) {
                hashMap.put(matcher.group(1), matcher.group(2));
            }
        }
        return hashMap;
    }
}

