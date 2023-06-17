/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.as;
import org.apache.logging.log4j.core.i.k;

public final class v
extends ac {
    private static final EnumMap b = new EnumMap(b.class);
    private static final EnumMap c = new EnumMap(b.class);
    private static final String d = "STYLE";
    private static final String e = "DEFAULT";
    private static final String f = "LOGBACK";
    private static final Map g = new HashMap();
    private final EnumMap h;
    private final List i;

    private static EnumMap a(String[] arrstring) {
        if (arrstring.length < 2) {
            return b;
        }
        Map map = k.a(arrstring[1], new String[]{d});
        EnumMap<b, String> enumMap = new EnumMap<b, String>(b);
        for (Map.Entry entry : map.entrySet()) {
            Object object;
            String string = ((String)entry.getKey()).toUpperCase(Locale.ENGLISH);
            String string2 = (String)entry.getValue();
            if (d.equalsIgnoreCase(string)) {
                object = (EnumMap)g.get(string2.toUpperCase(Locale.ENGLISH));
                if (object == null) {
                    a.b("Unknown level style: " + string2 + ". Use one of " + Arrays.toString(g.keySet().toArray()));
                    continue;
                }
                enumMap.putAll((Map<b, String>)object);
                continue;
            }
            object = org.apache.logging.log4j.b.valueOf(string);
            if (object == null) {
                a.b("Unknown level name: " + string + ". Use one of " + Arrays.toString(b.keySet().toArray()));
                continue;
            }
            enumMap.put((b)((Object)object), string2);
        }
        return enumMap;
    }

    public static v a(d d2, String[] arrstring) {
        if (arrstring.length < 1) {
            a.b("Incorrect number of options on style. Expected at least 1, received " + arrstring.length);
            return null;
        }
        if (arrstring[0] == null) {
            a.b("No pattern supplied on style");
            return null;
        }
        as as2 = org.apache.logging.log4j.core.g.g.a(d2);
        List list = as2.a(arrstring[0]);
        return new v(list, v.a(arrstring));
    }

    private v(List list, EnumMap enumMap) {
        super("style", "style");
        this.i = list;
        this.h = enumMap;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (ar ar2 : this.i) {
            ar2.a(h2, stringBuilder2);
        }
        if (stringBuilder2.length() > 0) {
            stringBuilder.append((String)this.h.get((Object)h2.a())).append(stringBuilder2.toString()).append(k.a());
        }
    }

    @Override
    public boolean cO_() {
        for (ar ar2 : this.i) {
            if (!ar2.c()) continue;
            return true;
        }
        return false;
    }

    static {
        b.put(org.apache.logging.log4j.b.b, k.a("BRIGHT", "RED"));
        b.put(org.apache.logging.log4j.b.c, k.a("BRIGHT", "RED"));
        b.put(org.apache.logging.log4j.b.d, k.a(new String[]{"YELLOW"}));
        b.put(org.apache.logging.log4j.b.e, k.a(new String[]{"GREEN"}));
        b.put(org.apache.logging.log4j.b.f, k.a(new String[]{"CYAN"}));
        b.put(org.apache.logging.log4j.b.g, k.a(new String[]{"BLACK"}));
        c.put(org.apache.logging.log4j.b.b, k.a("BLINK", "BRIGHT", "RED"));
        c.put(org.apache.logging.log4j.b.c, k.a("BRIGHT", "RED"));
        c.put(org.apache.logging.log4j.b.d, k.a(new String[]{"RED"}));
        c.put(org.apache.logging.log4j.b.e, k.a(new String[]{"BLUE"}));
        c.put(org.apache.logging.log4j.b.f, k.a((String[])null));
        c.put(org.apache.logging.log4j.b.g, k.a((String[])null));
        g.put(e, b);
        g.put(f, c);
    }
}

