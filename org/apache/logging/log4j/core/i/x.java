/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.EnumMap;
import java.util.Locale;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class x
extends ac {
    private static final String b = "length";
    private static final String c = "lowerCase";
    private static final x d = new x(null);
    private final EnumMap e;

    private x(EnumMap enumMap) {
        super("Level", "level");
        this.e = enumMap;
    }

    public static x a(String[] arrstring) {
        Object object;
        String[] arrstring2;
        if (arrstring == null || arrstring.length == 0) {
            return d;
        }
        EnumMap<b, Object> enumMap = new EnumMap<b, Object>(b.class);
        int n2 = Integer.MAX_VALUE;
        boolean bl2 = false;
        for (String string : arrstring2 = arrstring[0].split(",")) {
            object = string.split("=");
            if (object == null || ((String[])object).length != 2) {
                a.b("Invalid option {}", string);
                continue;
            }
            String string2 = object[0].trim();
            String string3 = object[1].trim();
            if (b.equalsIgnoreCase(string2)) {
                n2 = Integer.parseInt(string3);
                continue;
            }
            if (c.equalsIgnoreCase(string2)) {
                bl2 = Boolean.parseBoolean(string3);
                continue;
            }
            b b2 = org.apache.logging.log4j.b.a(string2, null);
            if (b2 == null) {
                a.b("Invalid Level {}", string2);
                continue;
            }
            enumMap.put(b2, string3);
        }
        if (enumMap.size() == 0 && n2 == Integer.MAX_VALUE && !bl2) {
            return d;
        }
        for (b b3 : org.apache.logging.log4j.b.values()) {
            if (enumMap.containsKey((Object)b3)) continue;
            object = x.a(b3, n2);
            enumMap.put(b3, bl2 ? ((String)object).toLowerCase(Locale.US) : object);
        }
        return new x(enumMap);
    }

    private static String a(b b2, int n2) {
        String string = b2.toString();
        if (n2 >= string.length()) {
            return string;
        }
        return string.substring(0, n2);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(this.e == null ? h2.a().toString() : (String)this.e.get((Object)h2.a()));
    }

    @Override
    public String a(Object object) {
        if (object instanceof h) {
            b b2 = ((h)object).a();
            switch (b2) {
                case g: {
                    return "level trace";
                }
                case f: {
                    return "level debug";
                }
                case e: {
                    return "level info";
                }
                case d: {
                    return "level warn";
                }
                case c: {
                    return "level error";
                }
                case b: {
                    return "level fatal";
                }
            }
            return "level " + ((h)object).a().toString();
        }
        return "level";
    }
}

