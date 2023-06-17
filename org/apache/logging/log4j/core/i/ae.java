/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.Map;
import java.util.TreeSet;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class ae
extends ac {
    private final String b;

    private ae(String[] arrstring) {
        super(arrstring != null && arrstring.length > 0 ? "MDC{" + arrstring[0] + "}" : "MDC", "mdc");
        this.b = arrstring != null && arrstring.length > 0 ? arrstring[0] : null;
    }

    public static ae a(String[] arrstring) {
        return new ae(arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        Object v2;
        Map map = h2.i();
        if (this.b == null) {
            if (map == null || map.size() == 0) {
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
        } else if (map != null && (v2 = map.get(this.b)) != null) {
            stringBuilder.append(v2);
        }
    }
}

