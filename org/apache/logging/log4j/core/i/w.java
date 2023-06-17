/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.Date;
import org.apache.logging.log4j.core.i.a;
import org.apache.logging.log4j.core.i.l;

public final class w
extends a
implements l {
    private static final w b = new w();

    private w() {
        super("Integer", "integer");
    }

    public static w a(String[] arrstring) {
        return b;
    }

    @Override
    public void a(StringBuilder stringBuilder, Object ... arrobject) {
        for (Object object : arrobject) {
            if (!(object instanceof Integer)) continue;
            this.a(object, stringBuilder);
            break;
        }
    }

    @Override
    public void a(Object object, StringBuilder stringBuilder) {
        if (object instanceof Integer) {
            stringBuilder.append(object.toString());
        }
        if (object instanceof Date) {
            stringBuilder.append(Long.toString(((Date)object).getTime()));
        }
    }
}

