/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c;

import com.a.a.b.bl;
import java.util.Map;
import net.minecraft.g.b.b;

class j
implements bl {
    j() {
    }

    public String a(Map.Entry entry) {
        if (entry == null) {
            return "<NULL>";
        }
        b b2 = (b)entry.getKey();
        return String.valueOf(b2.a()) + "=" + this.a(b2, (Comparable)entry.getValue());
    }

    private String a(b b2, Comparable comparable) {
        return b2.a(comparable);
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((Map.Entry)object);
    }
}

