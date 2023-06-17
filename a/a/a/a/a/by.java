/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.cy;
import java.util.Comparator;
import java.util.Map;

final class by
implements Comparator {
    final /* synthetic */ cy a;

    by(cy cy2) {
        this.a = cy2;
    }

    public int a(Map.Entry entry, Map.Entry entry2) {
        return this.a.compare(entry.getKey(), entry2.getKey());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Map.Entry)object, (Map.Entry)object2);
    }
}

