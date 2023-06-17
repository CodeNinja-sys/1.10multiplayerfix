/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.d.abx;
import com.a.a.d.adv;
import com.a.a.d.adw;
import com.a.a.d.ady;
import com.a.a.d.aea;
import com.a.a.d.aeb;
import com.a.a.d.aef;
import com.a.a.d.aeh;
import com.a.a.d.aei;
import com.a.a.d.zy;
import java.util.Map;

public final class adx {
    private static final bl a = new ady();

    private adx() {
    }

    public static adw a(Object object, Object object2, Object object3) {
        return new aea(object, object2, object3);
    }

    public static adv a(adv adv2) {
        return adv2 instanceof aef ? ((aef)adv2).a : new aef(adv2);
    }

    public static adv a(Map map, dx dx2) {
        cl.a(map.isEmpty());
        cl.a(dx2);
        return new abx(map, dx2);
    }

    public static adv a(adv adv2, bl bl2) {
        return new aeb(adv2, bl2);
    }

    public static adv b(adv adv2) {
        return new aei(adv2);
    }

    public static zy a(zy zy2) {
        return new aeh(zy2);
    }

    private static bl b() {
        return a;
    }

    static boolean a(adv adv2, Object object) {
        if (object == adv2) {
            return true;
        }
        if (object instanceof adv) {
            adv adv3 = (adv)object;
            return adv2.e().equals(adv3.e());
        }
        return false;
    }

    static /* synthetic */ bl a() {
        return adx.b();
    }
}

