/*
 * Decompiled with CFR 0.150.
 */
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

public class an {
    private static final Pattern a = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
    private static final Pattern b = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
    private static final Pattern c = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
    private static final Set d = aad.a("x", "y", "z", "dx", "dy", "dz", "rm", "r");

    public static czt a(ala ala2, String string) {
        return (czt)an.a(ala2, string, czt.class);
    }

    public static cpk a(ala ala2, String string, Class class_) {
        List list = an.b(ala2, string, class_);
        return list.size() == 1 ? (cpk)list.get(0) : null;
    }

    public static cbg b(ala ala2, String string) {
        List list = an.b(ala2, string, cpk.class);
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = ov.a();
        for (cpk cpk2 : list) {
            arrayList.add(cpk2.v());
        }
        return mn.a(arrayList);
    }

    public static List b(ala ala2, String string, Class class_) {
        Matcher matcher = a.matcher(string);
        if (matcher.matches() && ala2.a(1, "@")) {
            Map map = an.c(matcher.group(2));
            if (!an.b(ala2, map)) {
                return Collections.emptyList();
            }
            String string2 = matcher.group(1);
            cmz cmz2 = an.a(map, ala2.k_());
            amj amj2 = an.b(map, ala2.l_());
            List list = an.a(ala2, map);
            ArrayList arrayList = ov.a();
            for (iu iu2 : list) {
                if (iu2 == null) continue;
                ArrayList arrayList2 = ov.a();
                arrayList2.addAll(an.a(map, string2));
                arrayList2.addAll(an.b(map));
                arrayList2.addAll(an.c(map));
                arrayList2.addAll(an.d(map));
                arrayList2.addAll(an.c(ala2, map));
                arrayList2.addAll(an.e(map));
                arrayList2.addAll(an.f(map));
                arrayList2.addAll(an.a(map, amj2));
                arrayList2.addAll(an.g(map));
                arrayList.addAll(an.a(map, class_, arrayList2, string2, iu2, cmz2));
            }
            return an.a(arrayList, map, ala2, class_, string2, amj2);
        }
        return Collections.emptyList();
    }

    private static List a(ala ala2, Map map) {
        ArrayList arrayList = ov.a();
        if (an.h(map)) {
            arrayList.add(ala2.m_());
        } else {
            Collections.addAll(arrayList, ala2.o_().d);
        }
        return arrayList;
    }

    private static boolean b(ala ala2, Map map) {
        String string = an.b(map, "type");
        String string2 = string = string != null && string.startsWith("!") ? string.substring(1) : string;
        if (string != null && !vb.b(string)) {
            du du2 = new du("commands.generic.entity.invalidType", string);
            du2.h().a(aug.m);
            ala2.a(du2);
            return false;
        }
        return true;
    }

    private static List a(Map map, String string) {
        boolean bl2;
        boolean bl3;
        ArrayList arrayList = ov.a();
        String string2 = an.b(map, "type");
        boolean bl4 = bl3 = string2 != null && string2.startsWith("!");
        if (bl3) {
            string2 = string2.substring(1);
        }
        String string3 = string2;
        boolean bl5 = !string.equals("e");
        boolean bl6 = bl2 = string.equals("r") && string2 != null;
        if (string2 != null && string.equals("e") || bl2) {
            arrayList.add(new cwu(string3, bl3));
        } else if (bl5) {
            arrayList.add(new cby());
        }
        return arrayList;
    }

    private static List b(Map map) {
        ArrayList arrayList = ov.a();
        int n2 = an.a(map, "lm", -1);
        int n3 = an.a(map, "l", -1);
        if (n2 > -1 || n3 > -1) {
            arrayList.add(new cql(n2, n3));
        }
        return arrayList;
    }

    private static List c(Map map) {
        bvh bvh2;
        ArrayList arrayList = ov.a();
        String string = an.b(map, "m");
        if (string == null) {
            return arrayList;
        }
        boolean bl2 = string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        try {
            int n2 = Integer.parseInt(string);
            bvh2 = bvh.a(n2, bvh.a);
        }
        catch (Throwable throwable) {
            bvh2 = bvh.a(string, bvh.a);
        }
        bvh bvh3 = bvh2;
        arrayList.add(new ja(bl2, bvh3));
        return arrayList;
    }

    private static List d(Map map) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string = an.b(map, "team");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        String string2 = string;
        if (string != null) {
            arrayList.add(new bdx(string2, bl2));
        }
        return arrayList;
    }

    private static List c(ala ala2, Map map) {
        Map map2 = an.a(map);
        if (map2.isEmpty()) {
            return Collections.emptyList();
        }
        return ov.a(new cac(ala2, map2));
    }

    private static List e(Map map) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string = an.b(map, "name");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        String string2 = string;
        if (string != null) {
            arrayList.add(new atr(string2, bl2));
        }
        return arrayList;
    }

    private static List f(Map map) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string = an.b(map, "tag");
        boolean bl3 = bl2 = string != null && string.startsWith("!");
        if (bl2) {
            string = string.substring(1);
        }
        if (string != null) {
            String string2 = string;
            arrayList.add(new cgw(string2, bl2));
        }
        return arrayList;
    }

    private static List a(Map map, amj amj2) {
        boolean bl2;
        double d2 = an.a(map, "rm", -1);
        double d3 = an.a(map, "r", -1);
        boolean bl3 = d2 < -0.5;
        boolean bl4 = bl2 = d3 < -0.5;
        if (bl3 && bl2) {
            return Collections.emptyList();
        }
        double d4 = Math.max(d2, 1.0E-4);
        double d5 = d4 * d4;
        double d6 = Math.max(d3, 1.0E-4);
        double d7 = d6 * d6;
        return ov.a(new aib(amj2, bl3, d5, bl2, d7));
    }

    private static List g(Map map) {
        int n2;
        int n3;
        ArrayList arrayList = ov.a();
        if (map.containsKey("rym") || map.containsKey("ry")) {
            n3 = cmk.b(an.a(map, "rym", 0));
            n2 = cmk.b(an.a(map, "ry", 359));
            arrayList.add(new bxm(n3, n2));
        }
        if (map.containsKey("rxm") || map.containsKey("rx")) {
            n3 = cmk.b(an.a(map, "rxm", 0));
            n2 = cmk.b(an.a(map, "rx", 359));
            arrayList.add(new cfm(n3, n2));
        }
        return arrayList;
    }

    private static List a(Map map, Class class_, List list, String string, iu iu2, cmz cmz2) {
        boolean bl2;
        ArrayList arrayList = ov.a();
        String string2 = an.b(map, "type");
        string2 = string2 != null && string2.startsWith("!") ? string2.substring(1) : string2;
        boolean bl3 = !string.equals("e");
        boolean bl4 = string.equals("r") && string2 != null;
        int n2 = an.a(map, "dx", 0);
        int n3 = an.a(map, "dy", 0);
        int n4 = an.a(map, "dz", 0);
        int n5 = an.a(map, "r", -1);
        cm cm2 = cn.a((Iterable)list);
        cm cm3 = cn.a(auxx.a, cm2);
        int n6 = iu2.g.size();
        int n7 = iu2.c.size();
        boolean bl5 = bl2 = n6 < n7 / 16;
        if (map.containsKey("dx") || map.containsKey("dy") || map.containsKey("dz")) {
            cxt cxt2 = an.a(cmz2, n2, n3, n4);
            if (bl3 && bl2 && !bl4) {
                aeb aeb2 = new aeb(cxt2);
                arrayList.addAll(iu2.b(class_, cn.a(cm3, (cm)aeb2)));
            } else {
                arrayList.addAll(iu2.a(class_, cxt2, cm3));
            }
        } else if (n5 >= 0) {
            cxt cxt3 = new cxt(cmz2.a() - n5, cmz2.b() - n5, cmz2.c() - n5, cmz2.a() + n5 + 1, cmz2.b() + n5 + 1, cmz2.c() + n5 + 1);
            if (bl3 && bl2 && !bl4) {
                arrayList.addAll(iu2.b(class_, cm3));
            } else {
                arrayList.addAll(iu2.a(class_, cxt3, cm3));
            }
        } else if (string.equals("a")) {
            arrayList.addAll(iu2.b(class_, cm2));
        } else if (string.equals("p") || string.equals("r") && !bl4) {
            arrayList.addAll(iu2.b(class_, cm3));
        } else {
            arrayList.addAll(iu2.a(class_, cm3));
        }
        return arrayList;
    }

    private static List a(List arrayList, Map map, ala ala2, Class class_, String string, amj amj2) {
        int n2 = an.a(map, "c", string.equals("a") || string.equals("e") ? 0 : 1);
        if (string.equals("p") || string.equals("a") || string.equals("e")) {
            Collections.sort(arrayList, new bgy(amj2));
        } else if (string.equals("r")) {
            Collections.shuffle(arrayList);
        }
        cpk cpk2 = ala2.n_();
        if (cpk2 != null && class_.isAssignableFrom(cpk2.getClass()) && n2 == 1 && arrayList.contains(cpk2) && !"r".equals(string)) {
            arrayList = ov.a(cpk2);
        }
        if (n2 != 0) {
            if (n2 < 0) {
                Collections.reverse(arrayList);
            }
            arrayList = arrayList.subList(0, Math.min(Math.abs(n2), arrayList.size()));
        }
        return arrayList;
    }

    private static cxt a(cmz cmz2, int n2, int n3, int n4) {
        boolean bl2 = n2 < 0;
        boolean bl3 = n3 < 0;
        boolean bl4 = n4 < 0;
        int n5 = cmz2.a() + (bl2 ? n2 : 0);
        int n6 = cmz2.b() + (bl3 ? n3 : 0);
        int n7 = cmz2.c() + (bl4 ? n4 : 0);
        int n8 = cmz2.a() + (bl2 ? 0 : n2) + 1;
        int n9 = cmz2.b() + (bl3 ? 0 : n3) + 1;
        int n10 = cmz2.c() + (bl4 ? 0 : n4) + 1;
        return new cxt(n5, n6, n7, n8, n9, n10);
    }

    private static cmz a(Map map, cmz cmz2) {
        return new cmz(an.a(map, "x", cmz2.a()), an.a(map, "y", cmz2.b()), an.a(map, "z", cmz2.c()));
    }

    private static amj b(Map map, amj amj2) {
        return new amj(an.a(map, "x", amj2.b, true), an.a(map, "y", amj2.c, false), an.a(map, "z", amj2.d, true));
    }

    private static double a(Map map, String string, double d2, boolean bl2) {
        return map.containsKey(string) ? (double)cmk.a((String)map.get(string), cmk.c(d2)) + (bl2 ? 0.5 : 0.0) : d2;
    }

    private static boolean h(Map map) {
        for (String string : d) {
            if (!map.containsKey(string)) continue;
            return true;
        }
        return false;
    }

    private static int a(Map map, String string, int n2) {
        return map.containsKey(string) ? cmk.a((String)map.get(string), n2) : n2;
    }

    private static String b(Map map, String string) {
        return (String)map.get(string);
    }

    public static Map a(Map map) {
        HashMap hashMap = sz.c();
        for (String string : map.keySet()) {
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            hashMap.put(string.substring("score_".length()), cmk.a((String)map.get(string), 1));
        }
        return hashMap;
    }

    public static boolean a(String string) {
        Matcher matcher = a.matcher(string);
        if (matcher.matches()) {
            Map map = an.c(matcher.group(2));
            String string2 = matcher.group(1);
            int n2 = "a".equals(string2) || "e".equals(string2) ? 0 : 1;
            return an.a(map, "c", n2) != 1;
        }
        return false;
    }

    public static boolean b(String string) {
        return a.matcher(string).matches();
    }

    private static Map c(String string) {
        Object object;
        HashMap hashMap = sz.c();
        if (string == null) {
            return hashMap;
        }
        int n2 = 0;
        int n3 = -1;
        Matcher matcher = b.matcher(string);
        while (matcher.find()) {
            object = null;
            switch (n2++) {
                case 0: {
                    object = "x";
                    break;
                }
                case 1: {
                    object = "y";
                    break;
                }
                case 2: {
                    object = "z";
                    break;
                }
                case 3: {
                    object = "r";
                }
            }
            if (object != null && !matcher.group(1).isEmpty()) {
                hashMap.put(object, matcher.group(1));
            }
            n3 = matcher.end();
        }
        if (n3 < string.length()) {
            object = c.matcher(n3 == -1 ? string : string.substring(n3));
            while (((Matcher)object).find()) {
                hashMap.put(((Matcher)object).group(1), ((Matcher)object).group(2));
            }
        }
        return hashMap;
    }
}

