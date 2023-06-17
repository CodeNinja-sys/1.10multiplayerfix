/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.b;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.b.f;
import net.minecraft.g.b.b;
import net.minecraft.g.cn;

public abstract class g
implements f {
    protected Map b = sz.d();

    public String a(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            b b2 = (b)entry.getKey();
            stringBuilder.append(b2.a());
            stringBuilder.append("=");
            stringBuilder.append(this.a(b2, (Comparable)entry.getValue()));
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("normal");
        }
        return stringBuilder.toString();
    }

    private String a(b b2, Comparable comparable) {
        return b2.a(comparable);
    }

    @Override
    public Map a(cn cn2) {
        for (net.minecraft.g.c.b b2 : cn2.u().a()) {
            this.b.put(b2, this.a(b2));
        }
        return this.b;
    }

    protected abstract ag a(net.minecraft.g.c.b var1);
}

