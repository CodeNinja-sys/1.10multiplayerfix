/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bl;
import com.a.a.b.bp;
import com.a.a.b.bq;
import com.a.a.b.br;
import com.a.a.b.bs;
import com.a.a.b.bt;
import com.a.a.b.bu;
import com.a.a.b.bv;
import com.a.a.b.bw;
import com.a.a.b.cm;
import com.a.a.b.dx;
import java.util.Map;

public final class bn {
    private bn() {
    }

    public static bl a() {
        return bw.a;
    }

    public static bl b() {
        return bt.a;
    }

    public static bl a(Map map) {
        return new bs(map);
    }

    public static bl a(Map map, Object object) {
        return new bq(map, object);
    }

    public static bl a(bl bl2, bl bl3) {
        return new br(bl2, bl3);
    }

    public static bl a(cm cm2) {
        return new bu(cm2, null);
    }

    public static bl a(Object object) {
        return new bp(object);
    }

    public static bl a(dx dx2) {
        return new bv(dx2, null);
    }
}

