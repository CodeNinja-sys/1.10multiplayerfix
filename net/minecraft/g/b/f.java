/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.b;

import com.a.a.b.cn;
import com.a.a.d.cm;
import com.a.a.d.ov;
import java.util.Collection;
import net.minecraft.g.b.e;
import net.minecraft.u.ad;

public class f
extends e {
    protected f(String string, Collection collection) {
        super(string, ad.class, collection);
    }

    public static f b(String string) {
        return f.a(string, cn.a());
    }

    public static f a(String string, com.a.a.b.cm cm2) {
        return f.a(string, cm.a((Collection)ov.a(ad.values()), cm2));
    }

    public static f a(String string, Collection collection) {
        return new f(string, collection);
    }
}

