/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.b.cc;
import com.a.a.b.cg;
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.b.dg;
import com.a.a.d.mq;
import java.util.List;
import net.minecraft.client.g.b.a.a.a;
import net.minecraft.client.g.b.a.a.h;
import net.minecraft.client.g.b.a.a.r;
import net.minecraft.g.b.b;
import net.minecraft.g.c.i;

public class n
implements h {
    private static final dg c = dg.a('|').a();
    private final String d;
    private final String e;

    public n(String string, String string2) {
        this.d = string;
        this.e = string2;
    }

    @Override
    public cm a(i i2) {
        List list;
        boolean bl2;
        b b2 = i2.a(this.d);
        if (b2 == null) {
            throw new RuntimeException(String.valueOf(this.toString()) + ": Definition: " + i2 + " has no property: " + this.d);
        }
        String string = this.e;
        boolean bl3 = bl2 = !string.isEmpty() && string.charAt(0) == '!';
        if (bl2) {
            string = string.substring(1);
        }
        if ((list = c.b(string)).isEmpty()) {
            throw new RuntimeException(String.valueOf(this.toString()) + ": has an empty value: " + this.e);
        }
        cm cm2 = list.size() == 1 ? this.a(b2, string) : cn.b(mq.a((Iterable)list, new r(this, b2)));
        return bl2 ? cn.a(cm2) : cm2;
    }

    private cm a(b b2, String string) {
        cg cg2 = b2.a(string);
        if (!cg2.b()) {
            throw new RuntimeException(String.valueOf(this.toString()) + ": has an unknown value: " + this.e);
        }
        return new a(this, b2, cg2);
    }

    public String toString() {
        return cc.a((Object)this).a("key", this.d).a("value", this.e).toString();
    }

    static /* synthetic */ cm a(n n2, b b2, String string) {
        return n2.a(b2, string);
    }
}

