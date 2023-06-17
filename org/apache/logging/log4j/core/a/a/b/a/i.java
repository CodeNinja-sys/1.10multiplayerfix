/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.AttributeConverter
 */
package org.apache.logging.log4j.core.a.a.b.a;

import javax.persistence.AttributeConverter;
import org.apache.logging.log4j.core.d.v;

public class i
implements AttributeConverter {
    private static final int a = -1;
    private static final int b = -2;

    public String a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return null;
        }
        return stackTraceElement.toString();
    }

    public StackTraceElement a(String string) {
        if (v.a(string)) {
            return null;
        }
        return i.b(string);
    }

    static StackTraceElement b(String string) {
        int n2 = string.indexOf("(");
        String string2 = string.substring(0, n2);
        String string3 = string2.substring(0, string2.lastIndexOf("."));
        String string4 = string2.substring(string2.lastIndexOf(".") + 1);
        String string5 = string.substring(n2 + 1, string.indexOf(")"));
        String string6 = null;
        int n3 = -1;
        if ("Native Method".equals(string5)) {
            n3 = -2;
        } else if (!"Unknown Source".equals(string5)) {
            int n4 = string5.indexOf(":");
            if (n4 > -1) {
                string6 = string5.substring(0, n4);
                try {
                    n3 = Integer.parseInt(string5.substring(n4 + 1));
                }
                catch (NumberFormatException numberFormatException) {}
            } else {
                string6 = string5.substring(0);
            }
        }
        return new StackTraceElement(string3, string4, string6, n3);
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((StackTraceElement)object);
    }
}

