/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.util.Map;
import org.apache.commons.d.a.o;

final class p
implements Map.Entry {
    private final Object a;
    private final Object b;

    private p(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public boolean equals(Object object) {
        boolean bl2 = false;
        if (object != null && object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            bl2 = (this.getKey() == null ? entry.getKey() == null : this.getKey().equals(entry.getKey())) && (this.getValue() == null ? entry.getValue() == null : this.getValue().equals(entry.getValue()));
        }
        return bl2;
    }

    public int hashCode() {
        return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException("Entry.setValue is not supported.");
    }

    public Object getValue() {
        return this.b;
    }

    public Object getKey() {
        return this.a;
    }

    p(Object object, Object object2, o o2) {
        this(object, object2);
    }
}

