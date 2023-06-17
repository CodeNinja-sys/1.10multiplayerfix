/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.AttributeConverter
 */
package org.apache.logging.log4j.core.a.a.b.a;

import javax.persistence.AttributeConverter;
import org.apache.logging.log4j.j;

public class d
implements AttributeConverter {
    public String a(j j2) {
        if (j2 == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : j2.d()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append('\n');
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public j a(String string) {
        throw new UnsupportedOperationException("Log events can only be persisted, not extracted.");
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((j)object);
    }
}

