/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.AttributeConverter
 */
package org.apache.logging.log4j.core.a.a.b.a;

import javax.persistence.AttributeConverter;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.f;

public class g
implements AttributeConverter {
    public String a(f f2) {
        if (f2 == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(f2.a());
        int n2 = 0;
        boolean bl2 = false;
        for (f f3 = f2.b(); f3 != null; f3 = f3.b()) {
            ++n2;
            bl2 = true;
            stringBuilder.append("[ ").append(f3.a());
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(" ]");
        }
        if (bl2) {
            stringBuilder.append(" ]");
        }
        return stringBuilder.toString();
    }

    public f a(String string) {
        if (v.a(string)) {
            return null;
        }
        int n2 = string.indexOf("[");
        return n2 < 1 ? org.apache.logging.log4j.g.a(string) : org.apache.logging.log4j.g.a(string.substring(0, n2));
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((f)object);
    }
}

