/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ap;

public final class n
extends ap {
    private static final String b = "?";

    private n(String[] arrstring) {
        super("Class Name", "class name", arrstring);
    }

    public static n a(String[] arrstring) {
        return new n(arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StackTraceElement stackTraceElement = h2.c();
        if (stackTraceElement == null) {
            stringBuilder.append(b);
        } else {
            stringBuilder.append(this.a(stackTraceElement.getClassName()));
        }
    }
}

