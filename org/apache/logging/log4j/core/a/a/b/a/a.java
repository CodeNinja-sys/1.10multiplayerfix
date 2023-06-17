/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.persistence.AttributeConverter
 */
package org.apache.logging.log4j.core.a.a.b.a;

import java.util.Map;
import javax.persistence.AttributeConverter;

public class a
implements AttributeConverter {
    public String a(Map map) {
        if (map == null) {
            return null;
        }
        return map.toString();
    }

    public Map a(String string) {
        throw new UnsupportedOperationException("Log events can only be persisted, not extracted.");
    }

    public /* synthetic */ Object b(Object object) {
        return this.a((Map)object);
    }
}

