/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.ArrayList;
import org.apache.logging.log4j.core.i.al;
import org.apache.logging.log4j.core.i.am;
import org.apache.logging.log4j.core.i.an;
import org.apache.logging.log4j.core.i.ao;

public abstract class ak {
    private static final ak a = new am();

    public static ak a(String string) {
        if (string.length() > 0) {
            int n2;
            String string2 = string.trim();
            if (string2.isEmpty()) {
                return a;
            }
            for (n2 = 0; n2 < string2.length() && string2.charAt(n2) >= '0' && string2.charAt(n2) <= '9'; ++n2) {
            }
            if (n2 == string2.length()) {
                return new al(Integer.parseInt(string2));
            }
            ArrayList<ao> arrayList = new ArrayList<ao>(5);
            for (int i2 = 0; i2 < string2.length() && i2 >= 0; ++i2) {
                int n3;
                int n4 = i2;
                if (string2.charAt(i2) == '*') {
                    n3 = Integer.MAX_VALUE;
                    ++n4;
                } else if (string2.charAt(i2) >= '0' && string2.charAt(i2) <= '9') {
                    n3 = string2.charAt(i2) - 48;
                    ++n4;
                } else {
                    n3 = 0;
                }
                char c2 = '\u0000';
                if (n4 < string2.length() && (c2 = string2.charAt(n4)) == '.') {
                    c2 = '\u0000';
                }
                arrayList.add(new ao(n3, c2));
                i2 = string2.indexOf(46, i2);
                if (i2 == -1) break;
            }
            return new an(arrayList);
        }
        return a;
    }

    public static ak a() {
        return a;
    }

    public abstract String b(String var1);
}

