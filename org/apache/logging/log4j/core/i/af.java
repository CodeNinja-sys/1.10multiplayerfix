/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.Map;
import java.util.TreeSet;
import org.apache.logging.log4j.a.j;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class af
extends ac {
    private final String b;

    private af(String[] arrstring) {
        super(arrstring != null && arrstring.length > 0 ? "MAP{" + arrstring[0] + "}" : "MAP", "map");
        this.b = arrstring != null && arrstring.length > 0 ? arrstring[0] : null;
    }

    public static af a(String[] arrstring) {
        return new af(arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        if (!(h2.d() instanceof j)) {
            return;
        }
        j j2 = (j)h2.d();
        Map map = j2.f();
        if (this.b == null) {
            if (map.size() == 0) {
                stringBuilder.append("{}");
                return;
            }
            StringBuilder stringBuilder2 = new StringBuilder("{");
            TreeSet treeSet = new TreeSet(map.keySet());
            for (String string : treeSet) {
                if (stringBuilder2.length() > 1) {
                    stringBuilder2.append(", ");
                }
                stringBuilder2.append(string).append("=").append((String)map.get(string));
            }
            stringBuilder2.append("}");
            stringBuilder.append((CharSequence)stringBuilder2);
        } else {
            String string = (String)map.get(this.b);
            if (string != null) {
                stringBuilder.append(string);
            }
        }
    }
}

